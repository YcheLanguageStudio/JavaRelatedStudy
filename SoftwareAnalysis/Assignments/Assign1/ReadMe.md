#Assignment 1
##Questions & Answers
###Q1: Randoop Related
- Q1-(1): **What is test oracle when conducting random testing via Randoop**

- Answer: five built-in **test oracle** are as follows:
  1. Equals to null: `o.equals(null)` should return `false`
  1. Reflexivity of equality: `o.equals(o)` should return `true`
  1. Symmetry of equality: `o1.equals(o2)` implies `o2.equals(o1)`
  1. Equals-hashcode: If `o1.equals(o2)==true`, then `o1.hashCode()==o2.hashCode()`
  1. No null pointer exceptions: NO `NullPointerException` is thrown if no null inputs are used in a test

---

- Q1-(2): **How do you use Randoop to generate test cases? (Please give a detailed descriptions on the steps and the parameter settings.)**

- Answer as follows, in three steps

- first, enter into Dir `UserfulShells`, and use the following shell script

```zsh
RANDOOP_CLASSPATH="../Local-Jars/randoop-all-3.0.4.jar"
SRC_CLASSPATH="../AssignmentSubject/bin"
IO_ARGS="--classlist=my_classes.txt --junit-output-dir=../AssignmentSubject/test_src"
java -cp $RANDOOP_CLASSPATH:$SRC_CLASSPATH randoop.main.Main gentests $IO_ARGS
```

- second, run the shell

```zsh
./use_randoop_gen_tests.sh
```

- third, observe the result, No error-revealing tests to output

```zsh
policy = sun.security.provider.PolicyFile@568db2f2
PUBLIC MEMBERS=9
Explorer = randoop.generation.ForwardGenerator@17d10166

Progress update: test inputs generated=0, failing inputs=0      (Mon Oct 10 16:17:26 HKT 2016)
Progress update: test inputs generated=63, failing inputs=0      (Mon Oct 10 16:17:31 HKT 2016)
Progress update: test inputs generated=112, failing inputs=0      (Mon Oct 10 16:17:36 HKT 2016)
Progress update: test inputs generated=159, failing inputs=0      (Mon Oct 10 16:17:41 HKT 2016)
Progress update: test inputs generated=202, failing inputs=0      (Mon Oct 10 16:17:46 HKT 2016)
Progress update: test inputs generated=251, failing inputs=0      (Mon Oct 10 16:17:51 HKT 2016)
Progress update: test inputs generated=301, failing inputs=0      (Mon Oct 10 16:17:56 HKT 2016)
Progress update: test inputs generated=347, failing inputs=0      (Mon Oct 10 16:18:01 HKT 2016)
Progress update: test inputs generated=389, failing inputs=0      (Mon Oct 10 16:18:06 HKT 2016)
Progress update: test inputs generated=438, failing inputs=0      (Mon Oct 10 16:18:11 HKT 2016)
Progress update: test inputs generated=490, failing inputs=0      (Mon Oct 10 16:18:16 HKT 2016)
Progress update: test inputs generated=544, failing inputs=0      (Mon Oct 10 16:18:21 HKT 2016)
Progress update: test inputs generated=593, failing inputs=0      (Mon Oct 10 16:18:26 HKT 2016)
Progress update: test inputs generated=646, failing inputs=0      (Mon Oct 10 16:18:31 HKT 2016)
Progress update: test inputs generated=700, failing inputs=0      (Mon Oct 10 16:18:36 HKT 2016)
Progress update: test inputs generated=757, failing inputs=0      (Mon Oct 10 16:18:41 HKT 2016)
Progress update: test inputs generated=812, failing inputs=0      (Mon Oct 10 16:18:46 HKT 2016)
Progress update: test inputs generated=862, failing inputs=0      (Mon Oct 10 16:18:51 HKT 2016)
Progress update: test inputs generated=911, failing inputs=0      (Mon Oct 10 16:18:56 HKT 2016)
Progress update: test inputs generated=956, failing inputs=0      (Mon Oct 10 16:19:01 HKT 2016)
Progress update: test inputs generated=994, failing inputs=0      (Mon Oct 10 16:19:06 HKT 2016)
Progress update: test inputs generated=995, failing inputs=0      (Mon Oct 10 16:19:06 HKT 2016)
Normal method executions:2774775
Exceptional method executions:191

Average method execution time (normal termination):      0.0347
Average method execution time (exceptional termination): 0.116

No error-revealing tests to output

Regression test output:
Regression test count: 581
Writing JUnit tests...

Created file: /home/cheyulin/GitRepos/JavaRelatedStudy/SoftwareAnalysis/Assignments/Assign1/UserfulShells/../AssignmentSubject/test_src/RegressionTest0.java
Created file: /home/cheyulin/GitRepos/JavaRelatedStudy/SoftwareAnalysis/Assignments/Assign1/UserfulShells/../AssignmentSubject/test_src/RegressionTest1.java
Created file: /home/cheyulin/GitRepos/JavaRelatedStudy/SoftwareAnalysis/Assignments/Assign1/UserfulShells/../AssignmentSubject/test_src/RegressionTest.java
```

---

###Q2: Coverage Related
- Q2-(1): **Please specify the settings of Randoop**

---

- Q2-(2): **What are the statement coverage and branch coverage in your random testing**

---

##Instruction & Coverage Measurement Program
###Part1:Statement Coverage

---

###Part2:Branch Coverage(Bonus)

---

##References
- [Tutorial](../../../SoftwareAnalysis/References/workshop1/Tutorial_1.pdf)
- [Assignment Requirements](https://course.cse.ust.hk/comp5111/assignment/assignment1.html)
- [Assignment Faq](http://sccpu2.cse.ust.hk/wurongxin/faq.html)
- [Soot Doc](https://course.cse.ust.hk/comp5111/assignment/soot_tutorials/index.html)
