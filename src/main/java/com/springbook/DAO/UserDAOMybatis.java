package com.springbook.DAO;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springbook.VO.UserVO;


//DAO
@Repository
public class UserDAOMybatis extends SqlSessionDaoSupport{
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	// CRUD 기능의 메소드 구현
	// 회원 등록
	
	public UserVO getUser(UserVO vo) {
		System.out.println("===> Mybatis로 getUser() 기능 처리");
		return (UserVO) getSqlSession().selectOne("UserDAO.getUser", vo);
	}
	
	public void insetUser(UserVO vo) {
		System.out.println("===> Mybatis로 setUser() 기능 처리");
		getSqlSession().insert("UserDAO.insertUser", vo);
	}
	
}