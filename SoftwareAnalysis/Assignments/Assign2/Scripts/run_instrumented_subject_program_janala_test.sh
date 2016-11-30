#!/usr/bin/env zsh
java -cp sootOutput:../Local-Jars/subjectGoldenVersion.jar:../Local-Jars/hamcrest-core-1.3.jar:../Local-Jars/junit-4.11.jar org.junit.runner.JUnitCore janala.FindMinViaIterTestCase > janala_coverage.txt
