package doufu;
/*1、声明一个用户类：User，有属性：username,password,email,tel
2、声明一个IUserService接口，有抽象方法：
	User login(String username, String password)
	boolean regist(User user)
	
3、声明一个管理类UserService，实现IUserService接口。
并且有一个User[]数组，管理所有用户对象
4、在测试类中，从键盘输入信息，进行注册和登录*/
public class User {
	private String username;
	private String password;
	private String email;
	private String tel;
	
	public User() {
		super();
	}

	public User(String username, String password, String email, String tel) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.tel = tel;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", email=" + email + ", tel=" + tel + "]";
	}
	

}
