package doufu;

public class TestCircle {
	public static void main(String[] args) {
		Circle[] cir=new Circle[5];
		cir[0]=new Circle(4);
		cir[1]=new Circle(77);
		cir[2]=new Circle(3);
		cir[3]=new Circle(9);
		cir[4]=new Circle(15);
		
		GraphicTools.sort(cir);
		for (Circle circle : cir) {
			System.out.println(circle.toString());
		}
		
	}

}
