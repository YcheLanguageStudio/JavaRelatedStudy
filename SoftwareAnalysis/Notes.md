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

##Test Coverage
Test coverage contains statement, brach, call graph, condition coverage, etc.

##Program Instrumentation
- Def: Program Instrumentation means the ability of an application to incorporate code tracing, debugging, profiling, computer data logging, etc.
- How-to: insert the code instructions that can monitor programs, two types: src and bin instrumentation
- Customize our own phase in Soot:
  - leverage the Jimple code(thus, our phase should be after the Jimple code is created, insert the instruction using Jimple code)
  -
