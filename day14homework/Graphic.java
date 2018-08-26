package homework;


/* * 【练习题】1.抽象类与继承
设计一个能细分为矩形、三角形、圆形和椭圆形的“图形”类。使用继承将这些图形分类，
找出能作为基类部分的共同特征(如校准点)和方法(如画法、初始化)，
并看看这些图形是否能进一步划分为子类。本题只考虑实现思想，不考虑具体实现的细节，实现方式可自由发挥。
 */
 

public class Graphic {
	public static void main(String[] args) {
		Shape s1=new Circle(5.2);
		System.out.println(s1.getArea());
		Shape s2=new Rectangle(8.7,9.1);
		System.out.println(s2.getArea());
		Shape s3=new Triangle(4,3);
		System.out.println(s3.getArea());
		
	}
	
}
