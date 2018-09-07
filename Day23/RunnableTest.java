package dfoufu;

public class RunnableTest {
	public static void main(String[] args) {
		MyRunable myRunable = new MyRunable();
		Thread thread = new Thread(myRunable);
		thread.start();
		for (int i = 0; i < 100; i++) {

			System.out.println("main" + i);

		}

	}

}

class MyRunable implements Runnable {

	@Override
	public void run() {

		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < i; j++) {

				System.out.println("thread" + i * j);
			}
		}
	}

}
