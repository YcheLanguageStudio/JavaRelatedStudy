package demo;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.*;
import java.util.*;

@RunWith(Parameterized.class)
public class RectanglePUTest {
	
	@Parameters(name="{index}: {0},{1},{2}") // describe a family of scenarios
	public static Collection<Object[]> parameters() {
		return Arrays.asList(new Object[][] {{0,0,0}, {8,2,4}, {8,-2,-4}});
    }
	
	@Parameter // default value=0
	public double expectedArea;
	
	@Parameter(value=1)
	public double width;
	
	@Parameter(value=2)
	public double height;
	
	@Test
	public void testGetArea() {
		Rectangle r1 = new Rectangle(width, height);
		assertEquals("getArea fails", expectedArea, r1.getArea(), tolerance);
	}

	final static double tolerance = 0.0001;
}
