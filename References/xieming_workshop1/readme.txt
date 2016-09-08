If you would like to run the example:
(1) First, enter the command mode, and enter into the directory of Profiler project;
cd Profile

(2) Second, run the following commands to instrument the sample program:
java -cp bin;lib/soot-2.5.0.jar MainDriver -pp -soot-classpath  ../Sample/bin TestInvoke

Then,  it will generate a directory named sootOutput

(3) Third, run the instrumented program by the following command:
java -cp bin;sootOutput TestInvoke