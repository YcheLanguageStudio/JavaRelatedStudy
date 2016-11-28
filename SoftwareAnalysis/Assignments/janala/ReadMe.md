#Janala

##Introduction

Janala is a concolic unit testing engine for Java programs.  The implementation uses ASM for instrumentation.
ASM instrumentation instruments (see `janala.instrument.*`) class files at runtime and dumps (see `janala.logger.*`)
to a file a log of all instructions executed by the program and all values loaded from local stacks and heaps.
A concolic execution engine (see `janala.interpreters.*`) then takes the log and performs both symbolic and
concrete interpretation of the logged instructions.

##Attention

Use Java7, rahter than Java8. This constraint is similar to Soot.

##Dependencies

- You must have java, cvc4, and python 2.7 in your PATH.

```zsh
ant build
python testall.py
```


##Usage
- Add Src Files
  - [src/tests/SimpleProgram.java](src/tests/SimpleProgram.java)  
  - [src/tests/TestSimpleProgram.java](src/tests/TestSimpleProgram.java)

- Compile Src Files and Rebuild

```zsh
ant build
```

- Run Script

```zsh
python concolic.py 10 tests.TestSimpleProgram
```

##Extra Usage

- This runs the tests using online concolic execution.  To run tests with offline concolic execution, use

```zsh
python --offline testall.py
```
