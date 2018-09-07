package doufu;

public class AccountTest2 {
	public static void main(String[] args) {
		Account account = new Account(0,"1001");
		Husband husband = new Husband(account,"若林");
		Wife wife = new Wife(account,"19号");
		Thread h=new Thread(husband,"丈夫");
		Thread w=new Thread(wife,"妻子");
		h.start();
		w.start();
	}

}

class Account {
	private  double balance;
	private  String id;
	
	

	public Account() {
		super();
	}

	public Account(double balance, String id) {
		super();
		this.balance = balance;
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	synchronized public  void save(double money) {
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

	synchronized public  void sale(double money) {
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

class Husband implements Runnable{
	private Account account;
	private String name;
	
	
	
	


	public Husband() {
		super();
	}


	public Husband(Account account, String name) {
		super();
		this.account = account;
		this.name = name;
	}

	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public void run(){
		
		while(true){
			
			account.save(Math.random()*100);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Wife implements Runnable{
	
	private Account account;
	private String name;
	
	
	
	



	public Wife() {
		super();
	}


	public Wife(Account account, String name) {
		super();
		this.account = account;
		this.name = name;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Account getAccount() {
		return account;
	}


	public void setAccount(Account account) {
		this.account = account;
	}


	public void run(){
		
		while(true){
			
			account.sale(Math.random()*200);
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}