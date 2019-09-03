package com.springbook.controller.user;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.DAO.UserDAOMybatis;
import com.springbook.Service.UserService;
import com.springbook.VO.UserVO;

@Controller
public class LoginController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login.do", method=RequestMethod.GET)
	public String loginView(@ModelAttribute("user") UserVO vo) {
		System.out.println("로그인 화면으로 이동");
		vo.setId("test");
		vo.setPassword("1234");
		return "login.jsp";
	}
	
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
     public String login(UserVO vo, UserDAOMybatis userDAO, HttpSession session) {
	
		/* public String login(UserVO vo, Model model) { */	
		
		// 예외처리
		if(vo.getId() == null || vo.getId().equals("")) {
			throw new IllegalArgumentException("아이디는 반드시 입력하셔야 합니다.");
		}
	
		UserVO user = userService.getUser(vo);
		System.out.println("로그인 인증 처리...");
		if(user != null) { 
			session.setAttribute("userName", user.getName());
			return "getBoardList.do";
		}
		else return "login.jsp";
	}
}
