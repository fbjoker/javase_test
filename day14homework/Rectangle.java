package homework;

public class Rectangle extends Shape {
	double width;
	double length;
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
 
	public double getArea() {
		return width*length;
	}
}
