#-cp flag used to specify the classpath
javac -cp .:junit-4.12.jar RegressionTest*.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore RegressionTest