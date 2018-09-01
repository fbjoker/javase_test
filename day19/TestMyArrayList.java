package doufu;

public class TestMyArrayList {

	public static void main(String[] args) {
		//1、创建容器
		MyArrayList list = new MyArrayList();
		
		System.out.println("初始容量：" + list.capacity());
		
		//2、装对象，装元素
		list.add("张三");
		list.add("李四");
		list.add("王五");
		
		for (int i = 0; i <25; i++) {
			list.add(i);
		}
		
		list.add(0, "柴林燕");
		
		System.out.println("元素的个数：" + list.size());
		System.out.println("现在容量：" + list.capacity());
		
		Object[] array = list.toArray();
		for (Object object : array) {
			System.out.println(object);
		}
		
		System.out.println(list.get(2));
		System.out.println(list.contains("2"));
		list.remove(10);
		System.out.println(list);
		list.remove("王五");
		System.out.println(list);
		list.set(2, "world");
		System.out.println(list);
	}

}
