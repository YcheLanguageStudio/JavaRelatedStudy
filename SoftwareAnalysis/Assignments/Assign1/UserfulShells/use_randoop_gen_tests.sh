RANDOOP_CLASSPATH="../Local-Jars/randoop-all-3.0.4.jar"
SRC_CLASSPATH="../AssignmentSubject/bin"
IO_ARGS="--classlist=my_classes.txt --junit-output-dir=../AssignmentSubject/test_src"
java -cp $RANDOOP_CLASSPATH:$SRC_CLASSPATH randoop.main.Main gentests $IO_ARGS