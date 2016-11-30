SootDriverName="profiler.SubjectProgramDriver"
ClassPath="../AssignmentSubject/bin:../Local-Jars/soot-2.5.0.jar"
SootParamsFlag="-keep-line-number -pp -soot-classpath"
SootClassPth="../AssignmentSubject/bin"
InstrumentedFiles="tests.homework.IntArrayUtil"

java -cp $ClassPath $SootDriverName $SootParamsFlag $SootClassPth $InstrumentedFiles 
