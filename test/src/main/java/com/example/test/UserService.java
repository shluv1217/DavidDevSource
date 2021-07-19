package com.example.test;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired 
	public UserMapper mapper;

	public List<UserVO> retrieveUsers() 
	{ 
		return mapper.retrievetUsers(); 
	}

}