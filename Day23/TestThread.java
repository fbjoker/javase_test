package dfoufu;

public class TestThread {
	public static void main(String[] args) {
		
		MyThread myThread = new MyThread();
		myThread.start();
		for (int i = 0; i < 100; i++) {
			System.out.println("main"+i);
		}
		
	}

}

class MyThread extends Thread{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("thread"+i);
		}
	}
	
}