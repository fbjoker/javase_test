package doufu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test9 {
	public static void main(String[] args) {
		//String str = "10.	斐波纳契数列（Fibonacci Sequence）";
		String str = "中中国55kkfff";
		char[] charArray = str.toCharArray();
		StringBuffer sb=new  StringBuffer(str);
		ArrayList list=new ArrayList();
		for (Object obj: charArray) {
			if(!list.contains(obj)){
				list.add(obj);
			}
		}
		for (Object object : list) {
			int count =0;
			for (Object obj : charArray) {
				if(object.equals(obj)){
					count++;
				}
			}
			System.out.println(object+" : "+count);
		}
		System.out.println(list);
		
		
	}

}
