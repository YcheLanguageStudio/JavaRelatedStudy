##Soot Cmd Arguments

```zsh
java -cp xxx:.  profiler.MainDriver  
-pp -soot-classpath .:/home/cheyulin/GitRepos/JavaRelatedStudy/SoftwareAnalysis/Assignments/auto_rand_testing/target/test-classes
:/home/cheyulin/GitRepos/JavaRelatedStudy/SoftwareAnalysis/Assignments/Assign1/Local-Jars/junit-4.11.jar
:/home/cheyulin/GitRepos/JavaRelatedStudy/SoftwareAnalysis/Assignments/Assign1/Local-Jars/hamcrest-core-1.3.jar 
sample.TestInvoke util.IntArrayUtil
```


##Soot Instrumented Program 

- enter sootOutput

```zsh
./cp_classes_to.sh
./run_exp.sh
```

##In Soot Generated .class File

```zsh
java -cp .:../target/classes  sample.TestInvoke
```

##Soot Study
 

