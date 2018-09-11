package com.doufu.test;

import java.util.ArrayList;
import java.util.Optional;
import java.util.TreeSet;

import org.junit.Test;

public class LambdaDemo1 {
	public static void main(String[] args) {
		//new Thread(System.out::println).start();
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.forEach(System.out::println);
		System.out.println("----------------");
		
		TreeSet<String> treeSet = new TreeSet<>((a1,a2)->a1.compareTo(a2));
		treeSet.add("asf");
		treeSet.add("ssf");
		treeSet.add("fasf");
		treeSet.add("zsf");                                                                                                                                                 
		treeSet.add("badf");
		treeSet.forEach(System.out::println);
		
		Optional<ArrayList<Integer>> of = Optional.of(list);
		ArrayList<Integer> arrayList = of.get();
		arrayList.forEach(System.out::println);
		System.out.println("-------------------");
		
		
	}
	@Test
	public void test2(){
		Optional<String> opt = Optional.ofNullable(null);
		String string = opt.get();//把原来的空指针异常转成为NoSuchElementException，目的更快定位问题
		System.out.println(string);
	}
	
	@Test
	public void test7(){
		Optional<Employee> opt = Optional.of(new Employee("张三",8000));
		
		//如果当前容器中的对象是非空的，我们就给他的薪资+2000
		//Function<T,U>: U apply(T t)
		Optional<Employee> map = opt.map(t -> {t.setSalary(t.getSalary()+2000); return t;});
		
		Employee employee = map.get();
		System.out.println(employee);
	}

}
