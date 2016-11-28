##Janala2 Gradle Java8
- [janala2_tmp](janala2_tmp)
  - updated files: [build.gradle](janala2_tmp/build.gradle), [concolic.py](janala2_tmp/concolic.py), [setup.sh](janala2_tmp/setup.sh)
  - usage, with Java8 installed, `java` and `javac`
    - build janala2 into jar file and copy files
    - build [janala2_tmp/src/integration/java/tests](janala2_tmp/src/integration/java/tests),
    - use python scripts to run the program, to generate inputs for test cases

```zsh
./setup.sh
```

```zsh
gradle IntegrationTest
```

```zsh
python concolic.py 10 tests.homework.error.GetNextPermNumTestDriver
```

##Junit Usage

```zsh
java -cp auto_rand_testing/sootOutput:./Assign1/Local-Jars/hamcrest-core-1.3.jar:./Assign1/Local-Jars/junit-4.11.jar:auto_rand_testing/sootOutput/classes/ org.junit.runner.JUnitCore util_test.RegressionTest
```
