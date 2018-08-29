package doufu;

import java.util.Scanner;

public class TestUser {
	public static void main(String[] args) {
		
		Scanner input =new Scanner(System.in);
		UserService us= new UserService();
		while(true){
			System.out.println("---------测试系统---------");
			System.out.println("\t1.注    册");
			System.out.println("\t2.登    录");
			System.out.println("\t3.退    出");
			System.out.println("请选择：");
			int select= input.nextInt();
			switch(select){
			case 1:
				System.out.println("姓名：");
				String name=input.next();
				System.out.println("密码：");
				String password=input.next();
				System.out.println("电话：");
				String phone=input.next();
				System.out.println("邮箱：");
				String email=input.next();
				try {
					us.addUser(new User(name, password, phone, email));
				} catch (Exception e1) {
					System.out.println(e1.getMessage());
				} 
				break;
			case 2:
				System.out.println("姓名：");
				String username=input.next();
				System.out.println("密码：");
				String p=input.next();
				
				try {
					us.login(username, p);
				} catch (IdisNull e) {
					System.out.println(e.getMessage());
				} catch (Passwordwrong e) {
					System.out.println(e.getMessage());
				}
				break;
			case 3:
				System.out.println("确认退出(Y/N)");
				char comfrom=input.next().charAt(0);
				if(comfrom=='y'||comfrom=='Y'){
					return;
				}
				
			
			}
		}
		
	}
	
	public void add(User user){
		this.add(user);
	}

}
