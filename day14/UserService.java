package doufu;

import java.util.Arrays;

/*3、声明一个管理类UserService，实现IUserService接口。
并且有一个User[]数组，管理所有用户对象*/
public class UserService implements IUserService{
	User[] user;
	int total=0;

	public UserService() {
		super();
	}

	public UserService(User[] user) {
		super();
		this.user = user;
	}
	

	public User[] getUser() {
		return user;
	}

	public void setUser(User[] user) {
		this.user = user;
	}
	

	@Override
	public String toString() {
		return "UserService [user=" + Arrays.toString(user) + "]";
	}

	@Override
	public User login(String username, String password) {
		User u=new User();
		u.setUsername(username);
		u.setPassword(password);
		return u;
	}

	@Override
	public boolean regist(User user) {
		
		this.user[total]=user;
		total++;
		return false;
	}
	

}
