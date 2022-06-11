package myproject.dao;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myproject.model.User;
@Repository
public class UserDaoImpl implements UserDao{
	
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void saveUser(User usr) {
		// TODO Auto-generated method stub
	
		getSession().persist(usr);

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> findAllUsers() {
		// TODO Auto-generated method stub
		Criteria criteria=getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}

	@Override
	public void deleteUsersById(int id) {
		// Native SQL Support
		
		Query query=getSession().createSQLQuery("delete from User where userId= id");
		query.setInteger("userId",id);
		query.executeUpdate();
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		Criteria criteria=getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userId", id));
		return (User) criteria.uniqueResult();
	}
	@Override
	public List<User> findByName(String name) {
		// TODO Auto-generated method stub
		Criteria criteria=getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("name", name));
		return (List<User>) criteria.list();
	}

	@Override
	public void updateUser(User usr) {
		getSession().update(usr);
		
	}

	@Override
	public boolean findUser(User usr) {
		Criteria criteria=getSession().createCriteria(User.class);
		criteria.add(Restrictions.eq("userId", usr.getUserId()));
		criteria.add(Restrictions.eq("password",usr.getPassword()));
		usr=(User) criteria.uniqueResult();
		if(usr==null)
		return false;
		else {
			return false;
		}
	}

}
