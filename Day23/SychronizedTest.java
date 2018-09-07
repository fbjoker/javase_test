package dfoufu;

public class SychronizedTest {
	public static void main(String[] args) {
		Ticket2 ticket = new Ticket2("第一个窗口");
		Ticket2 ticket2 = new Ticket2("第二个窗口");
		ticket.start();
		ticket2.start();
	}

}

class Ticket extends Thread {
	private static int total = 10;
	private String name;
	private static Object lock = new Object();

	public Ticket(String name) {
		super(name);

	}

	public void sale() {

	}

	@Override
	public void run() {
		while (total > 0) {
			synchronized (lock) {
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

	class Ticket2 extends Thread {
		private static int  total=10;
		private String name;
		private static Object lock= new Object();
		
		public Ticket2(String name) {
			super(name);
			
		}
		
		synchronized public static void sale(){
			
			
				if(total>0){
					
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					total--;
					System.out.println(Thread.currentThread().getName()+"剩余的票数："+total);
				}
			
			
		}
		
		
		
		
		@Override
		 public  void run() {
			while(total>0){
				sale();
			}
		}
	
	
}