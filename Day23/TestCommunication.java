package account;

public class TestCommunication {

	public static void main(String[] args) {
		HouseWare h = new HouseWare(10);
		Worker w = new Worker(h);
		Customer c = new Customer(h);
		new Thread(w).start();
		new Thread(c).start();
	}
}

class HouseWare {
	private int num;

	public HouseWare(int total) {
		this.num = total;
	}

	public void put() {
		num++;
		System.out.println("工人生产了一台电视机，现在库存为：" + num);
	}

	public void take() {
		num--;
		System.out.println("消费者买走了一台电视机，现在库存为：" + num);
	}
}

class Worker implements Runnable {
	private HouseWare h;

	public Worker(HouseWare h) {
		super();
		this.h = h;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			h.put();
		}
	}
}

class Customer implements Runnable {
	private HouseWare h;

	public Customer(HouseWare h) {
		super();
		this.h = h;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 50; i++) {
			h.take();
		}
	}
}
