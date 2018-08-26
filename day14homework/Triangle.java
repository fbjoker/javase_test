package homework;

public class Triangle extends Shape {
	double bottom;
	double height;
	public Triangle(double bottom, double height) {
		super();
		this.bottom = bottom;
		this.height = height;
	}
	public double getArea() {
		return 1/2.0*this.bottom*this.height;
	}
 
}