package myproject.service;

import java.util.List;

import myproject.model.User;

public interface UserService {
	
	void saveUser(User usr);
	List<User> findAllUsers();
	void deleteUserById(int id);
	User findById(int id);
	List<User> findByName(String name);
	void updateUser(User usr);
	boolean findUser(User usr);
	

}
