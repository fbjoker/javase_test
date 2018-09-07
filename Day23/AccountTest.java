package dfoufu;



public class AccountTest {
	public static void main(String[] args) {
		
		Husband husband = new Husband();
		Wife wife = new Wife();
		husband.start();
		wife.start();
	}

}

class Account {
	private static double balance;

	public static void save(double money) {
		if (money < 0) {
			System.out.println("金额错误：");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance += money;
		System.out.println(Thread.currentThread().getName()+"存入了：" + money + "元，当前余额：" + balance + "元");
	}

	public static void sale(double money) {
		if (money < 0) {
			System.out.println("金额错误：");
		}
		if (money <= balance) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			balance -= money;
			System.out.println(Thread.currentThread().getName()+"消费了：" + money + "元，当前余额：" + balance + "元");
		} else {
			System.out.println(Thread.currentThread().getName()+"交易失败，准备取：" + money + "元，当前余额：" + balance + "元");
		}
	}
}

class Husband extends Thread{
	public void run(){
		
		while(true){
			
			Account.save(Math.random()*100);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Wife extends Thread{
	public void run(){
		
		while(true){
			
			Account.sale(Math.random()*200);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}