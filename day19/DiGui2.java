package doufu;
/*4.6.	第一个人10，第2个比第1个人大2岁，以此类推，请用递归方式计算出第8个人多大？
 * f1=10
 * f2=f1+2
 * f3=f2+2
 * 
 * */
public class DiGui2 {
	public static void main(String[] args) {
		System.out.println("结果是："+digui(8));
	}
	
	public static int digui(int n){
		if(n>1){
			System.out.println(n);
			return digui(n-1)+2;//f(1)=10,f(2)=12 f(3)=14
		}
		return 10;
	}
	

}

