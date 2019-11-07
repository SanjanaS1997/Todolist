package com.spiders.app.service;

import java.io.Serializable;
import java.util.List;

import com.spiders.app.dto.UserDto;

public interface UserServiceI {
	

	//public Serializable saveUser(UserDto user);
	
	public void deletetask(UserDto user);
	public UserDto getalltask(int id);
	//public UserDto findUser(long userId);
	//public List<UserDto> findAllUserByAdminId(long adminId);
	void updateTask(UserDto user);
	void deleteTask(UserDto user);

}
