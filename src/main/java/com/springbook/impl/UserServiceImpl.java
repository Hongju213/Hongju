package com.springbook.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springbook.DAO.UserDAOMybatis;
import com.springbook.Service.UserService;
import com.springbook.VO.UserVO;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAOMybatis userDAO;

	public void setUserDAO(UserDAOMybatis userDAO) {
		this.userDAO = userDAO;
	}

	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
}
