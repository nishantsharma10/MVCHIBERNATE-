package myproject.dao;

import java.util.List;

import myproject.model.User;

public interface UserDao {
	
	void saveUser(User usr);
	List<User> findAllUsers();
	void deleteUsersById(int id);
	User findById(int id);
	List<User> findByName(String name);
	void updateUser(User usr);
	boolean findUser(User usr);

}
