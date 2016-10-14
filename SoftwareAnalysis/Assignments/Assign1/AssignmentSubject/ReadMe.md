#Randoop, Test Generations
##Randoop Usage

```zsh
RANDOOP_CLASSPATH="../Local-Jars/randoop-all-3.0.4.jar"
SRC_CLASSPATH="../AssignmentSubject/bin"
IO_ARGS="--classlist=my_classes.txt --junit-output-dir=../AssignmentSubject/test_src --junit-package-name=util_test"
LITERAL_ARGS="--literals-file=literals.txt"
TIME_LIMIT_ARGS=" --timelimit=600"
java -cp $RANDOOP_CLASSPATH:$SRC_CLASSPATH randoop.main.Main gentests $IO_ARGS $LITERAL_ARGS $TIME_LIMIT_ARGS
```

##Randoop Output Info Gist

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

##Coverage with EclEmma

- Statement Coverage

Element | Coverage | Covered Instructions | Missed Instructions | Total Instructions
--- | --- | --- | --- | ---
AssignmentSubject | 90.6% | 1,513,492 | 156,559 | 1,670,051
IntArrayUtil.java | 96.7% | 757 | 26 | 783
RegressionTest0.java | 89.9% | 200,222 | 22,488 | 222,710
RegressionTest1.java | 90.3% | 201,877 | 21,798 | 223,675
RegressionTest2.java | 90.5% | 200,988 | 20,995 | 221,983
RegressionTest3.java | 90.7% | 200,287 | 20,484 | 220,771
RegressionTest4.java | 90.9% | 197,394 | 19,779 | 217,173
RegressionTest5.java | 90.9% | 196,637 | 19,623 | 216,260
RegressionTest6.java | 90.9% | 197,012 | 19,690 | 216,702
RegressionTest7.java | 91.0% | 118,318 | 11,673 | 129,991


- Branch Coverage

Element | Coverage | Covered Branch | Missed Branch | Total Branches
--- | --- | --- | --- | ---
AssignmentSubject | 50.0% | 98,159 | 98,051 | 196,210
IntArrayUtil.java | 96.7% | 121 | 13 | 134
RegressionTest0.java | 50.0% | 13,021 | 13,021 | 26,042
RegressionTest1.java | 50.0% | 13,136 | 13,136 | 26,272
RegressionTest2.java | 50.0% | 13,014 | 13,021 | 26,028
RegressionTest3.java | 50.0% | 12,946 | 12,946 | 25,892
RegressionTest4.java | 50.0% | 12,731 | 12,731 | 25,462
RegressionTest5.java | 50.0% | 12,728 | 12,728 | 25,456
RegressionTest6.java | 50.0% | 12,781 | 12,781 | 25,562
RegressionTest7.java | 50.0% | 7,681 | 7,681 | 15,362
