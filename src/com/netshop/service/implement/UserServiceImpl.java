package com.netshop.service.implement;

import org.springframework.beans.factory.annotation.Autowired;



import com.netshop.dao.UserDao;
import com.netshop.dao.UserDao;
import com.netshop.model.User;
import com.netshop.service.UserService;

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	@Override
	public User loginCheck(User user) {
		User u  = userDao.findUserByUserName(user.getUsername());
		System.out.println("id="+u.getUserid()+",  userName="+u.getUsername()+", password="+u.getUserpassword());
		if(user.getUserpassword().equals(u.getUserpassword())){
			return u;
		}
		else{
			return null;
		}
	}

	@Override
	public boolean register(User user) {
		User u =  userDao.findUserByUserName(user.getUsername());
		if(u.getUserid()==0){
			userDao.register(user);
			return true;
		}
		else{
			System.out.println("id="+u.getUserid()+",  userName="+u.getUsername()+", password="+u.getUserpassword());
			return false;
		}
	}
}
