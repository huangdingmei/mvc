package com.netshop.service;

import com.netshop.model.User;

public interface UserService {
	public boolean register(User user);
	public User loginCheck(User user);
}
