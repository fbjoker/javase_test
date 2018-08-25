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
		for(int i=0;i<total;i++){
			if(user[i].getUsername().equals(username)&&user[i].getPassword().equals(password)){
				return user[i];
			}
			
		}
		return null;
	}

	@Override
	public boolean regist(User user) {
		for(int i=0;i<total;i++){
			if(this.user[i].getUsername().equals(user.getUsername())){
				System.out.println("输入的用户名有误");
				return false;
			}
		}
		if(total>=all.length){
			//报错或者扩容
			//扩容,all指向新的数组
			all = Arrays.copyOf(all, all.length*2);
		}
		this.user[total++]=user;
		
		return true;
	}
	

}
