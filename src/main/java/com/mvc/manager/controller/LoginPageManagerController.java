package com.mvc.manager.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.manager.service.ManagerServiceImpl;
import com.mvc.manager.vo.ManagerVO;
import com.mvc.common.controller.Controller;

public class LoginPageManagerController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		return "/manager/loginPageManager";
	}

}
