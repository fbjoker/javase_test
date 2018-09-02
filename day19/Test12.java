package doufu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test12 {
	public static void main(String[] args) {
		List list = Arrays.asList(1,2,3,3,4,4,5,5,6,1,9,3,25,4);
		ArrayList listone=new ArrayList();
		for (Object obj: list) {
			if(!listone.contains(obj)){
				listone.add(obj);
			}
			
		}
		System.out.println(listone);
	}

}
