package demo;

public class Circle extends GeometricObject {
	private double radius;  // instance field or variable
	public static final double PI = 3.141592653;  // constant
	
	public Circle() {}
	
	public Circle(double r) {
		radius = r;
	}
	
	public void setRadius(double r) {
		radius = r;
	}
	
	public double getArea() {
		return PI*radius*radius;
	}
	
	public double getPerimeter() {
		return 2*PI*radius;
	}
	
	public static void main(String[] args) {
		Circle c1 = new Circle();  // create a Circle object instance
		c1.setRadius(1);
		System.out.println("The area is "+c1.getArea()+" with color "+c1.getColor());
	}
}
