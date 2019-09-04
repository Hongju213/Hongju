package com.springbook.Service;

import com.springbook.VO.UserVO;

public interface UserService {
	// CRUD의 구현
	// 회원 등록
	public UserVO getUser(UserVO vo);
	
	void insertUser(UserVO vo);
}
