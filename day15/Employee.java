package doufu;

import java.text.Collator;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;

/*1、练习
（1）声明一个员工类型Employee，包含属性：eid编号，ename姓名，
	hiredate入职日期（java.util.Date类型，可以查看API），
	salary薪资
（2）声明一个员工数组，长度为4，创建四个员工对象
（3）分别按照，
A:自然排序规则，按照编号升序排列
B:定制排序规则，按照薪资从高到低排序
C：定制排序规则，按照入职日期，从早到晚排序*/
public class Employee implements Comparable{
	private String eid;
	private String ename;
	private Date hiredate;
	private double salary;
	
	
	public Employee() {
		super();
	}


	public Employee(String eid, String ename, Date hiredate, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.hiredate = hiredate;
		this.salary = salary;
	}


	public String getEid() {
		return eid;
	}


	public void setEid(String eid) {
		this.eid = eid;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public Date getHiredate() {
		return hiredate;
	}


	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", hiredate=" + hiredate + ", salary=" + salary + "]";
	}


	@Override
	public int compareTo(Object o) {
		Employee e=(Employee) o;
		
		return (int)(this.getSalary()-e.getSalary());
	}
	
	
	

}

class EmployeeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee stu1 = (Employee) o1;
		Employee stu2 = (Employee) o2;
		
		
		Collator collator = Collator.getInstance(Locale.CHINA);
		//System.out.println(stu1.getEname());
		return collator.compare(stu1.getEname(), stu2.getEname());
	}
}
class EmployeeComparatorid implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		Employee stu1 = (Employee) o1;
		Employee stu2 = (Employee) o2;
		
		
		Collator collator = Collator.getInstance(Locale.CHINA);
		//System.out.println(stu1.getEname());
		return collator.compare(stu1.getEid(), stu2.getEid());
	}
}

class EmployeeComparator2 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee stu1 = (Employee) o1;
		Employee stu2 = (Employee) o2;
		
		if(stu1.getSalary()>stu2.getSalary()){
			return 1;
		}else if(stu1.getSalary()<stu2.getSalary()){
			return -1;
		}
		return 0;
	}
}

class EmployeeComparator3 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		Employee stu1 = (Employee) o1;
		Employee stu2 = (Employee) o2;
		
		
		return stu1.getHiredate().compareTo(stu1.getHiredate());
	}

}
