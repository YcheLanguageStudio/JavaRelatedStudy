If you would like to run the example:
- First, enter the command mode, and enter into the directory of Profiler project;    
```zsh
cd Profile
``

- Second, run the following commands to instrument the sample program:   
```zsh
java -cp bin;lib/soot-2.5.0.jar MainDriver -pp -soot-classpath  ../Sample/bin TestInvoke
``

Then,  it will generate a directory named sootOutput

- Third, run the instrumented program by the following command:   
```zsh
java -cp bin; sootOutput TestInvoke
```