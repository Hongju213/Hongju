package com.springbook.controller.user;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

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
	@ResponseBody 
     public Map<String, Object> login(UserVO vo, UserDAOMybatis userDAO, HttpSession session) {
		Map<String, Object> map = new HashMap<String, Object>();

		UserVO user = userService.getUser(vo);
		System.out.println("로그인 인증 처리...");
		
		if(user != null) { 
			session.setAttribute("userName", user.getName());
			map.put("res", "success");
		}
		else {
			map.put("res", "fail");
		}
		return map;
	}
}
