package tests;
import static org.junit.Assert.*;

import org.junit.Test;

import tests.MyClass;

public class MyClassTest3 {
/*
	@Test
	public void testMid1() {
		assertEquals("Failure2",1,MyClass.mid(1, 1, 2));
	}

	@Test
	public void testMid2() {
		assertEquals("Failure1",1,MyClass.mid(0, 1, 2));
	}
*/
	@Test
	public void testMid3() {
		assertEquals("Failure3",1,MyClass.mid(2, 1, 0));
	}
/*
	@Test
	public void testMid4() {
		assertEquals("Failure4",1,MyClass.mid(0, 2, 1));
	}

	@Test
	public void testMid5() {
		assertEquals("Failure5",1,MyClass.mid(1, 0, 2));
	}

	@Test
	public void testMid6() {
		assertEquals("Failure1",1,MyClass.mid(2, 0, 1));
	}
	*/
}
