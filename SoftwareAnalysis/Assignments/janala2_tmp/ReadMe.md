#Janala2 Usage Study
##Janala2 Dependencies & Build Dir
###Dependencies      
- [asm](http://mvnrepository.com/artifact/org.ow2.asm/asm-all/5.0.4), used for instrumentation
- [automaton](http://mvnrepository.com/artifact/dk.brics.automaton/automaton/1.11-8), used for regex
- [junit 4.12](http://junit.org/junit4/)

```groovy
dependencies {
    compile 'org.ow2.asm:asm-all:5.0.4'  // Bytecode manipulation
    compile 'org.choco-solver:choco-solver:3.3.1'
    compile 'dk.brics.automaton:automaton:1.11-8' // Used for regex
    compile 'junit:junit:4.12' // Used for assertions

    testCompile 'junit:junit:4.12'
    testCompile 'org.codehaus.groovy:groovy-all:2.4.3'
    testCompile 'org.mockito:mockito-core:1.10.19'
}
```

###Build Info

- basic configurations

```groovy
repositories {
    // Use 'jcenter' for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
}

sourceSets {
    main {
        java {
            exclude 'src/integration'
        }
    }

    integration {
        java {
            compileClasspath += main.output
            runtimeClasspath += main.output
            srcDir 'src/integration'
        }
    }
}


configurations {
    integrationCompile.extendsFrom testCompile
    integrationRuntime.extendsFrom testRuntime
}
```

- integrationTest

```groovy
task integrationTest (type: Test) {
    testClassesDir = sourceSets.integration.output.classesDir
    classpath = sourceSets.integration.runtimeClasspath
}
```

- jar

```groovy
version = '0.2'
jar {
    manifest {
        attributes 'Premain-Class': 'janala.instrument.SnoopInstructionTransformer'
    }
}
```

- jacoco

```groovy
apply plugin: "jacoco"
jacoco {
    toolVersion = "0.7.1.201405082137"
}
```
