package dfoufu;

public class Test1 {
	public static void main(String[] args) {
		Ticket11 t1 = new Ticket11("窗口1"); 
		Ticket11 t2 = new Ticket11("窗口2"); 
		Ticket11 t3 = new Ticket11("窗口3"); 
		
		t1.start();
		t2.start();
		t3.start();
	}
}
class Ticket11 extends Thread{
	private static int total = 10;
	
	public Ticket11(String name) {
		super(name);
		
	}

	 public void run(){
		 while(total>0){
			 sale();
		 }
	}
	
   synchronized public static void sale(){
		 if(total>0){
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			total--;
			System.out.println(Thread.class);
			System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余" + total);
		 }
	}
}