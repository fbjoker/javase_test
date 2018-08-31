package doufu;

import java.util.Scanner;

public class Login {
	public static void main(String[] args) {
		int count=0;
		Scanner input=new Scanner(System.in);
		while(true){
			if(count>=3){
				System.out.println("登录次数超限，已冻结");
				System.exit(0);
			}
			System.out.println("请输入账号：");
			String name=input.next();
			System.out.println("请输入密码：");
			String password=input.next();
			if(name.equals("admin")&&password.equals("admin")){
				
				System.out.println("登录成功");
				break;
			}else{
				System.out.println("账号密码有误");
				count++;
				System.out.println("剩余登录次数："+(3-count));
			}
			
			
		}
	}

}
