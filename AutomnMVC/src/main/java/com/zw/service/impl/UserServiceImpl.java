package com.zw.service.impl;

import com.zw.annotation.Service;
import com.zw.service.UserService;

@Service("userServiceImpl")
public class UserServiceImpl implements UserService{

	public String query(String name, String age) {
		return "{name="+name+",age="+age+"}";
	}

	public String insert(String param) {
		return  "insert successful.....";
	}

	public String update(String param) {
		return "update successful.....";
	}

}
