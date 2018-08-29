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

public class User {
	private String name;
	private String password;
	private String phone;
	private String email;
	
	public User() {
		super();
	}

	public User(String name, String password, String phone, String email) {
		super();
		this.name = name;
		this.password = password;
		this.phone = phone;
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", phone=" + phone + ", email=" + email + "]";
	}
	

}
