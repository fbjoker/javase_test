package doufu;
/*1、声明一个用户类：包含属性：用户名和密码、电话、邮箱
2、声明一个用户管理类UserService类，包含User[] all
提供：void addUser(User user){
	//如果all数组满了，抛出对应的异常
	//如果用户名已存在，抛出对应的异常

	}
	User login(String username, String password){
		//如果用户名不存在，报用户名不存在异常
		//如果用户名或密码错误，报用户名或密码错误异常
		//正确就返回用户信息
	}
3、自定义异常类型，自己设计
4、测试类	
在测试类中处理各种异常*/
public class UserService {
	private static final int MAX=5;
	private User[] user=new User[MAX] ;
	private int total=0;
	
	public UserService() {
		super();
	}

	public UserService(User[] user) {
		super();
		this.user = user;
	}
	
	void addUser(User user)throws IdisExist,Outofarry{
		for (int i = 0; i < total; i++) {
			if(this.user[i].getName().equals(user.getName())){
				throw new IdisExist("用户已存在！");
			}
		}
		
		if(total<MAX){
			this.user[total++]=user;
			System.out.println(this.user[total-1].toString());
		}else{
			throw new Outofarry("数组满了哦！");
		}
		
	}
	User login(String username, String password) throws IdisNull,Passwordwrong{
		//如果用户名不存在，报用户名不存在异常
		//如果用户名或密码错误，报用户名或密码错误异常
		//正确就返回用户信息
		boolean flag=true;
		User u=null;
		for (int i = 0; i < total; i++) {
			//System.out.println(this.user.length);
			//System.out.println(username);
			//System.out.println(password);
			
			if(this.user[i].getName().equals(username)){
				flag=false;
				u=this.user[i];
			}
		}
		//System.out.println(u.getPassword());
		if(flag){
			throw new IdisNull("没有找到用户");
		}
		
		if(!u.getPassword().equals(password)){
			throw new Passwordwrong("密码错误");
		}
		System.out.println("登录成功！！");
		return u;
		
	}

}
