package myproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import myproject.dao.UserDao;
import myproject.model.User;
@Service
@Transactional  

public class UserServiceImpl implements UserService {

	 
	 @Autowired
	 private UserDao dao;
	 
	 
	@Override
	public void saveUser(User usr) {
		
		dao.saveUser(usr);
		
	}
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		return dao.findAllUsers();
	}

	@Override
	public void deleteUserById(int id) {
		dao.deleteUsersById(id);
		
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id);
	}

	@Override
	public List<User> findByName(String name) {
		// TODO Auto-generated method stub
		return dao.findByName(name);
	}

	@Override
	public void updateUser(User usr) {
		dao.updateUser(usr);
		
	}

	@Override
	public boolean findUser(User usr) {
		// TODO Auto-generated method stub
		return dao.findUser(usr);
	}

}
