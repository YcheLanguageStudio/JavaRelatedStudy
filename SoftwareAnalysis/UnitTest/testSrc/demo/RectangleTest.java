package demo;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RectangleTest { 

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetArea() { 
		Rectangle r1 = new Rectangle(4,4);
		double expected = 16;
		double actual = r1.getArea();
		assertEquals("getArea fails", expected, actual, tolerance);
	}

	@Test
	public void testResize() {
		Rectangle r1 = new Rectangle(4,4);
		double expectedHeight = 1;
		double expectedWidth = 8;
		r1.resize(0.25, 2);
		assertEquals("resize - height fails", expectedHeight, r1.getHeight(), tolerance);
		assertEquals("resize - width fails", expectedWidth, r1.getWidth(), tolerance);
	}

	@Test
	public void testGetPerimeter() {
		Rectangle r1 = new Rectangle();
		r1.setWidth(2);
		r1.setHeight(4);
		double expectedPerimeter = 12;
		double actualPerimeter = r1.getPerimeter();
		assertEquals("getPerimeter fails", expectedPerimeter, actualPerimeter,tolerance);
		// assertEquals(actualObject.equals(expectedObject));
	}

	final static double tolerance = 0.0001;
}
