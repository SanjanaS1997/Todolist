package com.spiders.app.service;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spiders.app.dao.UserDaoI;
import com.spiders.app.dto.UserDto;


@Service
public abstract class UserServiceImpl implements UserServiceI {
	
	@Autowired
	UserDaoI dao;
	
	/*@Override
	public Serializable saveUser(UserDto user) {
		return dao.saveUser(user);
	}*/

/*@Override
	public void updateTask(UserDto user) {
		dao.updateTask(user);
	}
*/
	
	public void deleteTask(UserDto user) {
		dao.deleteTask(user);
	}

	/*@Override
	public UserDto findUser(String loginId) {
		return dao.findUser(loginId);
	

	@Override
	public UserDto findUser(long userId) {
		return dao.findUser(userId);
	}
*/
/*	public List<UserDto> getAllTaskById(int id) {
		return dao.getAllTaskById(id);
	}
*/	

}
