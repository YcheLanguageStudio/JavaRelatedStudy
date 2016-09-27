#Class Notes
##Faults & Errors & Failures
- fault: static defect
- error: incorrect internal state
```java
public static int numZero(int[]x)
{
  int count=0;
  for(int i=1; i<x.length; i++){
    if(x[i]==count){
      count++;
    }
  }
  return count;
}
```
- failure: external incorrect behavior

##Test & Debug
- Test: find inputs that cause the software to failure
- Debug: find a fault given a failure

##Tools for Assignment 1
- Randoop: automic random independent random testing
- EclEmma, java code coverage tool
- Soot, do static code analysis(control flow analysis, call graph, point-to analysis), instrumentation, optimization
  - Input: java src, or bytecode
  - Intermediate representation, Jimple, Baf, Shimple, Grimp
  - Output: Optimized Java ByteCode
  - Soot's execution: a number of phases, e.g, JimpleBody are built in a phase named "jb"
  - Soot's options:
    - configure the phases of soot
    - write your own subphases
  - Implementation of ousr own phase
  ```java
  //Implement the abstract class, our own phase
  public class InvokeStaticInstrumenter extends BodyTransformer{
    @override
    protected void internalTransform)(Body body, String phase, Map options){

    }
  }

  //Usage: Add after Jimple code is created
  Pack jtp = PackManager.v().getPack("jtp");
  jtp.add(new Transform("jtp.instrumenter", new InvokeStaticInstrumenter()));
  ```
  - Instruct the program
  ```zsh
  java -cp bin:lib/soot-2.5.0.jar MainDriver -pp -soot-classpath ../Sample/bin TestInvoke
  ```
  - Run the instructed program(optimized bytecodes)
  ```zsh
  java -cp bin:sootOutput TestInvoke
  ```

##Specification of Jimple code
- the @param-assignment and @this-assignment should be always int the front of the method body


##Gist for InvokeStaticInstrumenter
```java
public class InvokeStaticInstrumenter extends BodyTransformer {
	static SootClass counterClass;
	static SootMethod increaseCounter, reportCounter;
	static {
		counterClass = Scene.v().loadClassAndSupport("MyCounter");
		increaseCounter = counterClass.getMethod("void increase(int)");
		reportCounter = counterClass.getMethod("void report()");
		Scene.v().setSootClassPath(null);
	}

	protected void internalTransform(Body body, String phase, Map options) {
		SootMethod method = body.getMethod();
		System.out.println("instrumenting method : " + method.getSignature());
		Chain units = body.getUnits();
		Iterator stmtIt = units.snapshotIterator();
		while (stmtIt.hasNext()) {
			Stmt stmt = (Stmt) stmtIt.next();
			if (!stmt.containsInvokeExpr()) {
				continue;
			}

			InvokeExpr expr = (InvokeExpr) stmt.getInvokeExpr();

			if (!(expr instanceof StaticInvokeExpr)) {
				continue;
			}

			InvokeExpr incExpr = Jimple.v().newStaticInvokeExpr(
					increaseCounter.makeRef(), IntConstant.v(1));
			Stmt incStmt = Jimple.v().newInvokeStmt(incExpr);

			units.insertBefore(incStmt, stmt);
		}

		String signature = method.getSubSignature();
		boolean isMain = signature.equals("void main(java.lang.String[])");

		if (isMain) {
			stmtIt = units.snapshotIterator();

			while (stmtIt.hasNext()) {
				Stmt stmt = (Stmt) stmtIt.next();

				if ((stmt instanceof ReturnStmt)
						|| (stmt instanceof ReturnVoidStmt)) {
					InvokeExpr reportExpr = Jimple.v().newStaticInvokeExpr(
							reportCounter.makeRef());

					Stmt reportStmt = Jimple.v().newInvokeStmt(reportExpr);

					units.insertBefore(reportStmt, stmt);
				}
			}
		}
	}
}
```
##Program Instrumentation
- Def: Program Instrumentation means the ability of an application to incorporate code tracing, debugging, profiling, computer data logging, etc.
- How-to: insert the code instructions that can monitor programs, two types: src and bin instrumentation
- Customize our own phase in Soot:
  - leverage the Jimple code(thus, our phase should be after the Jimple code is created, insert the instruction using Jimple code)

##Test Coverage
Test coverage contains statement, branch, call graph, condition coverage, etc.

##Test-Coverage-Concepts
- Node coverage, edge coverage, edge-pair coverage, complete path coverage
- Simple path: A path from node ni to nj is simple if no node appears more than once,
except possibly the first and last nodes are the same
- Prime path: A simple path that does not appear as a proper subpath of any other simple path
- Technology
    - Finding all Simple Paths
        - from len0, i.e, a single vertex, extend until touch the src states, e.g, extend len2 from len1 with src vertex,
        and also marked terminate when it is not able to form a simple path anymore
        - if it is in terminate-state, not possible to expand
    - Extract Prime Paths
    - Construct test-path-set, remove redundant ones
    - test-path-set contains skip-loop, once-loop, more-than-once-loop
- Prime Path Coverage, subsumes node, edge, edge-pair coverage
- Besides subsumption, test Oracle is very important, how precision is test oracle

##Data-Flow-Coverage
- DU-pair, i.e, def/use pair
- DU-clear-path, i.e, no re def, e.g, assignment of the variable e.g x
- Criteria
    - all-def, def is used at least onece
    - all-use
    - all-du, remove redundant

##Mutation Coverage(break-through)

##Junit- version 4
- Parameterized unit testing
- four components: test input, expected ouptut, call actual method, compare methods

##Junit-Test-WRITING
- example
```java
@Test
public void testXXX(){
    // we also consider method invocation sequence
    A a = new A();       //test input vector: parameters are called test input vector
    a.push(0);
    a.pop();
    assert(...)     //test oracle: the statement to judge whether the execution is correct or not
}
```
- `@Before` and `@After`, invoked in every test, e.g
    1. @setUp
    2. test case 1
    3. @tearDown
    1. @setUp
    2. test case 2
    3. @tearDown

- EclEmma, highlight the statements covered with different colors

- Test Suite in Junit 4
    - `@RunWith(Suite.class)`, `@Suite.SuiteClasses`
    - `@Parameters(name="{index}"{0},{1},{2})`

##Junit4 big chnage
###Parameterized Junit Tests(PUT)
- just need to write one function, using parameters to make it easier to be consistent

###Junit Theories
- Adopts **Contract Model**
    - Assume, Act, Assert
    ```java
    @Theory
    public void testThoery(double...)
    {
        //state assumptions
        //pefrom actions
        //assert
    }
    ```

##Instrumentation
- node coverage
- edge coverage
- def-use coverage

##Test-Oracle
- Def: (Refer to[What is a test oracle, and what is it used for? Stackoverflow](http://stackoverflow.com/questions/23522166/what-is-a-test-oracle-and-what-is-it-used-for))
> A test oracle is a source of information about whether the output of a program (or function or method) is correct or not.

> A test oracle might specify correct output for all possible input or only for specific input. It might not specify actual output values but only constraints on them.

> An oracle isn't a test runner, but a test runner could use an oracle as a source of correct output to which to compare the system-under-test's output, or as a source of constraints against which to evaluate the SUT's output.

> The oracle might be
>   1) a program (separate from the system under test) which takes the same input and produces the same output    
>   2) documentation that gives specific correct outputs for specific given inputs   
>   3) a documented algorithm that a human could use to calculate correct outputs for given inputs   
>   4) a human domain expert who can somehow look at the output and tell whether it is correct   
>   or any other way of telling that output is correct.   

##Random-Generator
- generate data structures, method sequences

##Automatic Testing Category
- Random Testing
- Symbolic Execution
- Another

##Random Testing
- Challenge: data-structures, avoid generating redundant tests
- Randoop(Feedback Direct)
```
C holds the valid distinct terms, i.e, a set of terms

C={0, 1, 2, null, false, Mono(1,2,0), Poly(), plus(Poly(), Mono(1,2,0)}
```

- Built-in Oracles
    - Equal to null `o.equals(nul)`, always false
    - Reflexity
    - Symmetricity
    - Equals-HashCode
    - No null ptr exceptions

##Symbolic Execution
- concrete execution, `x=0`, `y=1`
- symbolic execution, `x=a`,`y=b`
- constraints solvers, 2000, 2010 becomes important
- handle loops, under-certain-assumption
- Problem
    - Constraints blow up
    - Only for Linear 
    - Need Source Codes(May Call) (Abstract Interpretation)
    - Inter-Procedure Analysis Complexity, rather than Intro-Procedure



