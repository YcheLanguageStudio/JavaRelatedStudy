package tests;
import janala.Main;
import tests.SimpleProgram;
import catg.CATG;
public class TestSimpleProgram {
	public static void main (String[] args) {
		int a = CATG.readInt(1);
		int b = CATG.readInt(2);
		System.out.println("inputs: " + a + ", " + b);
		boolean result = SimpleProgram.compare(a, b);
		if(result){
			System.out.println("input a is not smaller than input b.");
		} else{
			System.out.println("input a is smaller than input b.");
		}
	}
}
