##Janala2 Build Study

- `gradle build`

```zsh
:compileJava
Note: /home/cheyulin/GitRepos/JavaRelatedStudy/SoftwareAnalysis/Assignments/janala2_tmp/src/main/java/database/table/internals/ResultSetImpl.java uses or overrides a deprecated API.
Note: Recompile with -Xlint:deprecation for details.
Note: Some input files use unchecked or unsafe operations.
Note: Recompile with -Xlint:unchecked for details.
:compileGroovy UP-TO-DATE
:processResources UP-TO-DATE
:classes
:jar
:assemble
:compileTestJava
:compileTestGroovy
:processTestResources UP-TO-DATE
:testClasses
:test
Download https://jcenter.bintray.com/org/jacoco/org.jacoco.agent/0.7.1.201405082137/org.jacoco.agent-0.7.1.201405082137.pom
Download https://jcenter.bintray.com/org/jacoco/org.jacoco.build/0.7.1.201405082137/org.jacoco.build-0.7.1.201405082137.pom
Download https://jcenter.bintray.com/org/jacoco/org.jacoco.agent/0.7.1.201405082137/org.jacoco.agent-0.7.1.201405082137.jar
:check
:build

BUILD SUCCESSFUL

Total time: 29.601 secs

This build could be faster, please consider using the Gradle Daemon: http://gradle.org/docs/2.5/userguide/gradle_daemon.html
```

- `gradle jacocoTestReport`

```zsh
:compileJava UP-TO-DATE
:compileGroovy UP-TO-DATE
:processResources UP-TO-DATE
:classes UP-TO-DATE
:jacocoTestReport
Download https://jcenter.bintray.com/org/jacoco/org.jacoco.ant/0.7.1.201405082137/org.jacoco.ant-0.7.1.201405082137.pom
Download https://jcenter.bintray.com/org/jacoco/org.jacoco.core/0.7.1.201405082137/org.jacoco.core-0.7.1.201405082137.pom
Download https://jcenter.bintray.com/org/jacoco/org.jacoco.report/0.7.1.201405082137/org.jacoco.report-0.7.1.201405082137.pom
Download https://jcenter.bintray.com/org/ow2/asm/asm-debug-all/5.0.1/asm-debug-all-5.0.1.pom
Download https://jcenter.bintray.com/org/ow2/asm/asm-parent/5.0.1/asm-parent-5.0.1.pom
Download https://jcenter.bintray.com/org/jacoco/org.jacoco.ant/0.7.1.201405082137/org.jacoco.ant-0.7.1.201405082137.jar
Download https://jcenter.bintray.com/org/jacoco/org.jacoco.core/0.7.1.201405082137/org.jacoco.core-0.7.1.201405082137.jar
Download https://jcenter.bintray.com/org/jacoco/org.jacoco.report/0.7.1.201405082137/org.jacoco.report-0.7.1.201405082137.jar
Download https://jcenter.bintray.com/org/ow2/asm/asm-debug-all/5.0.1/asm-debug-all-5.0.1.jar

BUILD SUCCESSFUL

Total time: 16.736 secs

This build could be faster, please consider using the Gradle Daemon: http://gradle.org/docs/2.5/userguide/gradle_daemon.html
```
