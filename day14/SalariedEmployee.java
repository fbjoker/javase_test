package doufu;

/*定义SalariedEmployee类继承Employee类，实现按月计算工资的员工处理。该类包括：
private成员变量monthlySalary；//月薪
private 成员变量 workingDay;//本月出勤天数
private 成员变量 totalDays;//本月总工作日天数，除了周末和假期
实现父类的抽象方法earnings(),该方法返回月薪*出勤天数/本月总工作日；
toString()方法输出员工类型信息及员工的name，number,birthday。*/

public class SalariedEmployee extends Employee {
	private int monthlySalary; //月薪
	private int workingDay;//本月出勤天数
	private int totalDays;//本月总工作日天数，除了周末和假期
		
	public SalariedEmployee() {
		super();
	}

	

	public SalariedEmployee(String number, String name, MyDate birthday, int monthlySalary, int workingDay,
			int totalDays) {
		super(number, name, birthday);
		this.monthlySalary = monthlySalary;
		this.workingDay = workingDay;
		this.totalDays = totalDays;
	}



	public int getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public int getWorkingDay() {
		return workingDay;
	}

	public void setWorkingDay(int workingDay) {
		this.workingDay = workingDay;
	}

	public int getTotalDays() {
		return totalDays;
	}

	public void setTotalDays(int totalDays) {
		this.totalDays = totalDays;
	}
	
	/*实现父类的抽象方法earnings(),该方法返回月薪*出勤天数/本月总工作日；
	toString()方法输出员工类型信息及员工的name，number,birthday。*/
	@Override
	public double earnings() {		

		return monthlySalary*workingDay/totalDays;
	}
	
	
	/*toString()方法输出员工类型信息及员工的name，number,birthday。*/
	@Override
	public String toString() {
		
		return super.toString();
	}
	
	

}
