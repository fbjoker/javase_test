package doufu;

import javax.swing.border.EmptyBorder;

public class PayrollSystem {
	public static void main(String[] args) {
		Employee[] emp=new Employee[10];
		emp[0]=new SalariedEmployee("1001","卡卡罗特",new MyDate(1999, 7,18),2000,28,100);
		emp[1]=new HourlyEmployee("1002", "沙鲁", new MyDate(2000,6,17), 2000, 200);
		
		
		System.out.println(emp[0].earnings());
	}

}
