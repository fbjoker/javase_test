package doufu;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectTest {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		
		Class c=Student.class;
		 Student zz=(Student) c.newInstance();
		System.out.println(zz);
		Field field = c.getDeclaredField("name");
		
		 field.set(zz,"卡卡罗特");
		Object object = field.get(zz);
		System.out.println(object);
		
		Method method = c.getDeclaredMethod("info", String.class,double.class,int.class);
		method.setAccessible(true);
		Object info = method.invoke(zz, "invoke",2002,808);
		System.out.println(info);
		
		
		System.out.println("----------------------------");
		
		Class boy=Boy.class;
		Constructor con=boy.getDeclaredConstructor(String.class);
		con.setAccessible(true);
		Boy b1=(Boy) con.newInstance("18号");
		System.out.println(b1.getName());
		System.out.println(b1);
		
		//c.
		
	}

}

class Boy{
	String name;
	

	private Boy() {
		super();
	}


	private  Boy(String str) {
		super();
		this.name = str;
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	private String info(String a,double d,int c){
		return a+d+c;
	}


	@Override
	public String toString() {
		return "Boy [str=" + name + "]";
	}
	
	

}

class Student{
	String name;
	

	public Student() {
		super();
	}



	public Student(String str) {
		super();
		this.name = str;
	}
	private String info(String a,double d,int c){
		return a+d+c;
	}


	@Override
	public String toString() {
		return "Student [str=" + name + "]";
	}
	
	
}
