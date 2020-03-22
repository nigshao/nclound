package com.example.client.service;

import com.example.common.User;
import org.springframework.stereotype.Service;

@Service
public class FeignServiceImpl implements FeignSrvice{



	@Override
	public User updateUser(User user) {
		user = new User();
		user.setName("走到服务降级逻辑");
		user.setAge(0);
		return user;
	}

	@Override
	public Object getPower() {
		return null;
	}


}
