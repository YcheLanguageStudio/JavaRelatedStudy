package demo;

public class HelloWorld {
	public static void main(String[] args) {
	}
	
	public static void main4Randoop(String[] args) {
		main(args);
	}

	public HelloWorld(int i) {
		counter = new Integer(i);
	}
	
	public HelloWorld(Integer o) {
		counter = o;
	}
	
	public HelloWorld(Integer[] ary) {
		if (ary != null)
			counter = ary[0];
	}
	
	Integer counter;
}
