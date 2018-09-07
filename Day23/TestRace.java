package dfoufu;

public class TestRace {
	public static void main(String[] args) {
		Race r1 = new Race("乌龟",100,1000);
		Race r2 = new Race("兔子",200,1000);
		Race r3 = new Race("大象",300,1000);
		Race r4 = new Race("老虎",400,1000);
		Race r5 = new Race("蛇",500,1000);
		Race r6 = new Race("鸡",600,1000);
		Race r7 = new Race("狗",700,1000);
		Race r8 = new Race("猪",800,1000);
		
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
		r6.start();
		r7.start();
		r8.start();
	}
}
class Race extends Thread{
	private String name;
	private int runTimePerMeter;//跑1米的时间，单位是毫秒
	private int restTime;//跑10米后的休息时间

	public Race(String name, int runTimePerMeter, int restTime) {
		super();
		this.name = name;
		this.runTimePerMeter = runTimePerMeter;
		this.restTime = restTime;
	}



	public void run(){
		for (int i = 1; i <= 30; i++) {
			System.out.println(name + "跑...");
			try {
				Thread.sleep(runTimePerMeter);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(i%10==0){
				System.out.println(name + "跑了" + i + "米");
				if(i<30){
					System.out.println(name + "开始休眠...");
					try {
						Thread.sleep(restTime);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}