package com.springbook.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springbook.Service.UserService;
import com.springbook.VO.UserVO;

@Controller
public class JoinController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/join.do", method=RequestMethod.POST)
     public String join(UserVO vo) {
	
		userService.insertUser(vo);
		return "login.jsp";
	}
}
