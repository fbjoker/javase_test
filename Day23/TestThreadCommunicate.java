package dfoufu;

/*
 * 生产者与消费者问题：
 * 	 当有多个线程，一些线程是负责“生产”数据的，另一些线程是负责“消费”数据的，然而“存储”数据的容器（或缓冲区）的大小是固定。
 *  那么就会出现，缓冲区可能被“填满”，这个时候，“生产者”线程就应该停下来；得等到“消费者”消费了数据后再继续生产；
 *  		 缓冲区可能出现“空”，这个时候，“消费者”线程就应该停下来；得等到“生产者”生产了数据后在继续消费；
 * 这里就涉及几个问题？
 * （1）线程安全问题？
 * 如何判断是否有线程安全问题？（1）多个线程（2）共享数据：缓冲区（3）多条语句操作共享数据
 * 这里判断有线程安全问题，肯定用到同步。
 * 
 * （2）线程之间的通信：谁“停下来”谁“叫醒”它       
 * 缓冲区的大小固定
 * 
 * 在java.lang.Object类中有：
 * （1）wait()
 * 		这个wait()只能有“锁”对象调用，“锁对象”又称为线程的监视器对象
 * （2）notify()
 * 		这个notify()只能有“锁”对象调用，“锁对象”又称为线程的监视器对象
 * 
 */
public class TestThreadCommunicate {
	public static void main(String[] args) {
		Worker w = new Worker();
		Saler s = new Saler();
		
		w.start();
		s.start();
	}
}
//仓库
class Houseware{
	private static int amount;//只能存10件
	
	//静态方法的默认锁对象是：当前类的Class对象
	synchronized public static void add(){
		if(amount >= 10){
			try {
				//当前线程应该暂停下来
				Houseware.class.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		amount++;
		System.out.println("生产者生产了一件商品，库存量为：" + amount);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//唤醒正在等待的线程，从阻塞状态到就绪状态
		Houseware.class.notify();
	}
	synchronized public static void take(){
		if(amount <= 0){
			//当前线程应该暂停下来
			try {
				//当前线程应该暂停下来
				Houseware.class.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		amount--;
		System.out.println("消费者消费了一件商品，库存量为：" + amount);
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		//唤醒正在等待的线程，从阻塞状态到就绪状态
		Houseware.class.notify();
	}
}

class Worker extends Thread{
	public void run(){
		while(true){
			Houseware.add();//一直往里加
		}
	}
}
class Saler extends Thread{
	public void run(){
		while(true){
			Houseware.take();//一直往外取
		}
	}
}