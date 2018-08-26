package homework;

public class Bike implements Vehicle {

	@Override
	public void start() {
		
		System.out.println("驾~~");
	}

	@Override
	public void stop() {
		System.out.println("吁~~~");
	}

}
