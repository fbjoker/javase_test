package doufu;

import java.util.ArrayList;

/*
一列数的规则如下：1、1、2、3、5、8、13、21、34....求第n位数是多少？
在数学上，斐波纳契数列以如下被以递归的方法定义：F0=0，F1=1，Fn=F(n-1)+F(n-2)（n>=2，n∈N*）
在现代物理、准晶体结构、化学等领域，斐波纳契数列都有直接的应用*/

public class Fibonacci {
	public static void main(String[] args) {
		long start=System.currentTimeMillis();
		System.out.println(fibonacci(40));
		long end=System.currentTimeMillis();
		System.out.println(end-start);
		
		 start=System.currentTimeMillis();
		System.out.println(fibo(400));
		 end=System.currentTimeMillis();
		System.out.println(end-start);
		
		
	}
	//递归：
	public static int fibonacci(int n){
		
		return n<2?1:fibonacci(n-1)+fibonacci(n-2);
	}
	//循环：1、1、2、3、5、8、13、21、34
	public static int fibo(int n){
		
		int[] fb= new int[n+2];
		fb[0]=1;
		fb[1]=1;

		for (int i = 2; i <=n; i++) {
			fb[i]=fb[i-1]+fb[i-2];
		}
		return fb[n];
	}

}
