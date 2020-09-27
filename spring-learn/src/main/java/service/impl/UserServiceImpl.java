package service.impl;

import service.UserService;

public class UserServiceImpl implements UserService {
	@Override
	public void eat(String name) {
		System.out.println("吃了"+name);
	}
}
