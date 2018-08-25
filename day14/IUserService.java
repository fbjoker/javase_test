package doufu;
/*2、声明一个IUserService接口，有抽象方法：
User login(String username, String password)
boolean regist(User user)*/
public interface IUserService {
	User login(String username, String password);
	boolean regist(User user);

}
