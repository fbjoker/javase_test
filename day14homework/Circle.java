package homework;

public class Circle extends Shape {
	double radius;
	public Circle(double radius) {
		this.radius=radius;
	}
	public double getArea() {
		return this.radius*this.radius*Math.PI;
	}
 
}
