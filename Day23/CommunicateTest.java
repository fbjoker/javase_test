package dfoufu;

public class CommunicateTest {
	public static void main(String[] args) {
		Saler1 s = new Saler1();

		// 3个代理同时替s对象进行代理，共用一个被代理对象
		Thread t1 = new Thread(s, "窗口一");
		Thread t2 = new Thread(s, "窗口二");
		Thread t3 = new Thread(s, "窗口三");

		t1.start();
		t2.start();
		t3.start();
	}

}

class Saler1 implements Runnable{
	private int total = 100;

	@Override
	public void run() {
		while(total>0){
			sale();
		}
	}
	
	//非静态方法，默认的锁对象，也是this
	synchronized public void sale(){
		if(total>0){
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			total--;
		
			System.out.println(Thread.currentThread().getName() + "卖出一张票，剩余" + total);
		}
	}
	
}