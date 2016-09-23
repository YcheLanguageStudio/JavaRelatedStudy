package demo;
import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import static org.junit.Assume.*;
import org.junit.experimental.theories.*;

// Theory: Given a circle C and a rectangle R, C has a larger perimeter than R implies 
// C has a larger area than R

@RunWith(Theories.class)
public class RectangleCircleTheoriesTest {

	// One set of datapoints for each datatype used by the theories
	@DataPoints 
	public static double[] samples={-1,0,1,2,100,200};
	
	// May state more than one theory. Note that theories often have parameters
	@Theory
	public void testTheory(double r, double w, double h) {
		
		// state assumptions
		assumeTrue(r>0);
		assumeTrue(w>0);
		assumeTrue(h>0);
		assumeTrue(Circle.PI*r > (w+h));
		
		// perform actions
		double x = new Circle(r).getArea();
		double y = new Rectangle(w,h).getArea();
		System.out.println("Instantiated test: r="+r+", w="+w+", h="+h);
		
		// assert the theory
		assertTrue(x > y);
	}
}
