package demo;
public class Rectangle extends GeometricObject {
  private double width;
  private double height;

  public Rectangle() {  
  } 

  public Rectangle(double width, double height) {
    this.width = width;
    this.height = height;
  }

  /** Return width */
  public double getWidth() {
    return width;
  }

  /** Set a new width */
  public void setWidth(double width) {
	  if (width >= 0)
		  this.width = width;
  }

  /** Return height */
  public double getHeight() {
    return height;
  }

  /** Set a new height */
  public void setHeight(double height) {
    this.height = height;
  }

  /**  
   * Grow or shrink a rectangle in both dimensions
   * @param hscale double multiplier for height
   * @param wscale double multiplier for width
   */
  public void resize(double hscale, double wscale){
	this.height *= hscale;
	this.width *= wscale;
  }
  
  /** Return area */
  public double getArea() {
    return width * height;
  }

  /** Return perimeter */
 public double getPerimeter() {
    return 2 * (width + height); 
  }
  
  public static void main(/* String [] args */) throws Exception {
	  Rectangle r1 = new Rectangle();
	  Rectangle r2 = new Rectangle();
	  System.out.println("I have created two rectangles!");
  }
  
  public static void tt(String[] args) {
	  int i = 1;
  }
  
  public boolean equals(Object o) {
	  if (o != null && o instanceof Rectangle) {
	    Rectangle r = (Rectangle) o;
	    return (this.getWidth()==r.getWidth()) && (this.getHeight()==r.getHeight());
	  }
	  return false;
  }
  
}
