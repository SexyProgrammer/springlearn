package com.jin.service.impl;

import com.jin.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
	@Override
	public void eat(String name) {
		System.out.println("吃了"+name);
	}
}
