package doufu;

import java.util.Arrays;
import java.util.Date;

/*1、练习
（1）声明一个员工类型Employee，包含属性：eid编号，ename姓名，
	hiredate入职日期（java.util.Date类型，可以查看API），
	salary薪资
（2）声明一个员工数组，长度为4，创建四个员工对象
（3）分别按照，
A:自然排序规则，按照编号升序排列
B:定制排序规则，按照薪资从高到低排序
C：定制排序规则，按照入职日期，从早到晚排序*/
public class TestEmployee {
	public static void main(String[] args) {
		Employee[] e=new Employee[4];
		
		e[0]= new Employee("1001","卡卡罗特",new Date(2000,2,2),5000);
		e[1]= new Employee("1002","贝吉塔",new Date(2010,2,2),1000);
		e[2]= new Employee("1003","莱恩",new Date(2009,2,2),3000);
		e[3]= new Employee("1004","行者",new Date(2015,2,2),9000);
		
		
		EmployeeComparatorid aci = new EmployeeComparatorid();
		Arrays.sort(e,aci);
		for (Employee employee : e) {
			System.out.println(employee.toString());
		}
		
		System.out.println("-------------------------------------");
		EmployeeComparator ac = new EmployeeComparator();
		Arrays.sort(e,ac);
		for (Employee employee : e) {
			System.out.println(employee.toString());
		}
		
		System.out.println("-------------------------------------");
		EmployeeComparator2 ac2 = new EmployeeComparator2();
		Arrays.sort(e,ac2);
		for (Employee employee : e) {
			System.out.println(employee.toString());
		}
		
		
	}
	
	

}
