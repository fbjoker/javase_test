package doufu;

import java.util.Arrays;

/*
 * 
 */
public class TestMyLinkedList {
	public static void main(String[] args) {
		MyLinkedList my = new MyLinkedList();
		
		my.add(1);
		my.add(2);
		my.add(3);
		
		Object[] array = my.toArray();
		System.out.println("元素：" + Arrays.toString(array));
		System.out.println("-------------------------------");
		my.remove(2);
		array = my.toArray();
		System.out.println("元素：" + Arrays.toString(array));
		
	}
}
