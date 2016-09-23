package demo;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;


@RunWith(Suite.class)
@SuiteClasses({ 
	CircleTest.class, 
	GeometricObjectTest.class,
    RectangleTest.class })
public class AllTests {

}
