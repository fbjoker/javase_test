package doufu;

import java.util.TreeSet;

/*编写程序，在main方法中接收5个参数整数字符串；
创建TreeSet类型的集合，将5个字符串以整数形式添加到集合中；
增强型for循环遍历该集合，打印所有元素，并将所有元素之和打印出来。
*/

public class Test3 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(Integer.parseInt("234"));
		ts.add(Integer.parseInt("14"));
		ts.add(Integer.parseInt("14"));
		ts.add(Integer.parseInt("777"));
		ts.add(Integer.parseInt("1234"));
		
		int sum=0;
		for (Object object : ts) {
			System.out.println(object);
			sum+=(Integer)object;
		}
		System.out.println(sum);
		
		
	}

}
