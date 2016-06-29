package com.liuyumeng.users.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.liuyumeng.users.dao.UserMapper;
import com.liuyumeng.users.model.User;

/**
 * @author 小米
 * @date 创建时间：2016年6月26日 上午8:36:59
 * @version 1.0
 * @parameter
 * @since
 * @return
 */

@Service("userService")
public class UserServiceImpl implements UserServiceI {
	
	
	private UserMapper userMapper;
	/*
	 * 需要将UserMapper的Dao注入 重写get和set
	 */
	
	
	public UserMapper getUserMapper() {
		return userMapper;
	}


	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}



	public User getUserById(int id) {
		// TODO Auto-generated method stub
		return userMapper.selectByPrimaryKey(id);
	}
}
