#Assignment 1
##Questions & **Answer**s
###Q1: Randoop Related
- Q1-(1): **What is test oracle when conducting random testing via Randoop**

- **Answer**: five built-in **test oracle** are as follows:
  1. Equals to null: `o.equals(null)` should return `false`
  1. Reflexivity of equality: `o.equals(o)` should return `true`
  1. Symmetry of equality: `o1.equals(o2)` implies `o2.equals(o1)`
  1. Equals-hashcode: If `o1.equals(o2)==true`, then `o1.hashCode()==o2.hashCode()`
  1. No null pointer exceptions: NO `NullPointerException` is thrown if no null inputs are used in a test

---

- Q1-(2): **How do you use Randoop to generate test cases? (Please give a detailed descriptions on the steps and the parameter settings.)**

- **Answer**: as follows, in three steps

  - first, enter into Dir `UserfulShells`, and use the following shell script

  ```zsh
  RANDOOP_CLASSPATH="../Local-Jars/randoop-all-3.0.4.jar"
  SRC_CLASSPATH="../AssignmentSubject/bin"
  IO_ARGS="--classlist=my_classes.txt --junit-output-dir=../AssignmentSubject/test_src --junit-package-name=util_test"
  LITERAL_ARGS="--literals-file=literals.txt"
  TIME_LIMIT_ARGS=" --timelimit=600"
  java -cp $RANDOOP_CLASSPATH:$SRC_CLASSPATH randoop.main.Main gentests $IO_ARGS $LITERAL_ARGS $TIME_LIMIT_ARGS
  ```

  - second, run the shell

  ```zsh
  ./use_randoop_gen_tests.sh
  ```

  - third, list the gist of the output
  ```zsh
  Normal method executions:16443052
  Exceptional method executions:1472

  Average method execution time (normal termination):      0.0353
  Average method execution time (exceptional termination): 0.0957

  No error-revealing tests to output

  Regression test output:
  Regression test count: 3797
  Writing JUnit tests...
  ```

---

###Q2: Coverage Related
- Q2-(1): **Please specify the settings of Randoop**

- **Answer**: it is what is elaborated in Q1(2), the shell used is as follows:

```zsh
RANDOOP_CLASSPATH="../Local-Jars/randoop-all-3.0.4.jar"
SRC_CLASSPATH="../AssignmentSubject/bin"
IO_ARGS="--classlist=my_classes.txt --junit-output-dir=../AssignmentSubject/test_src --junit-package-name=util_test"
LITERAL_ARGS="--literals-file=literals.txt"
TIME_LIMIT_ARGS=" --timelimit=600"
java -cp $RANDOOP_CLASSPATH:$SRC_CLASSPATH randoop.main.Main gentests $IO_ARGS $LITERAL_ARGS $TIME_LIMIT_ARGS
```

---

- Q2-(2): **What are the statement coverage and branch coverage in your random testing**
- **Answer**: the statement coverage and branch coverage collected by EclEmma, underlying using Jacoco are as follows.

- **Statement Coverage**

Element | Coverage | Covered Instructions | Missed Instructions | Total Instructions
--- | --- | --- | --- | ---
IntArrayUtil.java | 96.7% | 757 | 26 | 783



- **Branch Coverage**

Element | Coverage | Covered Branch | Missed Branch | Total Branches
--- | --- | --- | --- | ---
IntArrayUtil.java | 96.7% | 757 | 26 | 783

- Screenshot:statement coverage and branch coverage

![Statement Coverage](Pictures/statement_coverage.png)

![Branch Coverage](Pictures/branch_coverage.png)

---

##Statement & Branch Coverage Measurement Program
###Understanding
- here, in the jimple code, arguments passing should be skipped, i.e, `JIdentityStmt`, including `this` and other arguments
- **statement coverage**, is the vertices, represented as a statement, for the ratio, dividing it by whole if
- **branch coverage**, is the edges between nodes starting from a `JIfStmt`, destinating in another statement e.g, `goto label`, and the else is the statement chained
after the `JIfstmt` for the ratio

###Part1:Statement Coverage

---

###Part2:Branch Coverage(Bonus)

---

##References
- [Tutorial](../../../SoftwareAnalysis/References/workshop1/Tutorial_1.pdf)
- [Assignment Requirements](https://course.cse.ust.hk/comp5111/assignment/assignment1.html)
- [Assignment Faq](http://sccpu2.cse.ust.hk/wurongxin/faq.html)
- [Soot Doc](https://course.cse.ust.hk/comp5111/assignment/soot_tutorials/index.html)
