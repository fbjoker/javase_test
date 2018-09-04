package doufu;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionTest {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		ArrayList list2 = new ArrayList();
		list.add(Math.random()*100);
		list.add(Math.random()*100);
		list.add(Math.random()*100);
		list.add(Math.random()*100);
		list.add(555.0);
		list.add(Math.random()*100);
		list.add(Math.random()*100);
		list.add(Math.random()*100);
		
		list2.addAll(list);
		for (Object object : list) {
			System.out.println(object);
		}
		System.out.println(Collections.binarySearch(list, 555.0));
		System.out.println(Collections.max(list));
		System.out.println(Collections.min(list));
		System.out.println("-------------------------------");
		Collections.reverse(list2);
		for (Object object : list2) {
			System.out.println(object);
		}
		System.out.println("-------------------------------");
		Collections.rotate(list2, 2);
		for (Object object : list2) {
			System.out.println(object);
		}
		System.out.println("-------------------------------");
		Collections.sort(list2);;
		for (Object object : list2) {
			System.out.println(object);
		}
		
		
		
	}

}
