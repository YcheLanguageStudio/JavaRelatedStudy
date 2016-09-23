package demo;

public class MyProgram {
	public int sq(int x) {
		if (x>0)
			return x*x;
		else
			System.out.println("invalid input");
	return -1;
	}
	
	public String echo(String s) {
		if (s != null)
			return new String(s);
		return null;
	}
}
