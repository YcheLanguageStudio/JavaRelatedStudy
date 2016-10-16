package util_test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
RegressionTest0.class, 
RegressionTest1.class, 
RegressionTest2.class, 
RegressionTest3.class, 
RegressionTest4.class, 
RegressionTest5.class, 
RegressionTest6.class, 
RegressionTest7.class
})
public class RegressionTest{

    public RegressionTest() {
        System.out.println("Okay");
    }
}
