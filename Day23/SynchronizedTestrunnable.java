package dfoufu;

public class SynchronizedTestrunnable {
	public static void main(String[] args) {
		Ticket3 ticket = new Ticket3();
		Thread thread1 = new Thread(ticket,"第一");
		Thread thread2 = new Thread(ticket,"第二");
		Thread thread3 = new Thread(ticket,"第三");
		
		thread1.start();
		thread2.start();
		thread3.start();
		
	}

}

class Ticket3 implements Runnable{
	private int total=100;
	

	@Override
	public void run() {
		while (total > 0) {
			synchronized (this) {
				if (total > 0) {

					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					total--;
					System.out.println(Thread.currentThread().getName() + "剩余的票数：" + total);
				}
			}
		}
	}
	
	
	
	
}
