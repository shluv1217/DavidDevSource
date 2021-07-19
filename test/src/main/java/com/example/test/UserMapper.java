package com.example.test;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;



@Repository
@Mapper
public interface UserMapper {
	
	List<UserVO> retrievetUsers();
	
}