package doufu;

import java.util.ArrayList;
import java.util.List;

public class Testms {
	public static void main(String[] args) {
		int i=0;
		List list=new ArrayList();
		getValue(i,list);
		System.out.println(i);
		System.out.println(list);
	}

	private static void getValue(int i, List list) {
		try {
			list.add(i++/0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		}finally{
			list.add(i);
		}
		
	}

}
