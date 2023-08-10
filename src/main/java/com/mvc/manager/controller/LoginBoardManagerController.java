package com.mvc.manager.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mvc.common.controller.Controller;
import com.mvc.manager.service.ManagerServiceImpl;
import com.mvc.manager.vo.ManagerVO;

public class LoginBoardManagerController implements Controller {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		String path=null;
		HttpSession session = null;
		// 1. VO객체에 데이터 바인딩
		ManagerVO vo = new ManagerVO();
		vo.setMgId(request.getParameter("mgid"));
		vo.setMgPw(request.getParameter("mgpw"));
		
		// 2. Service 객체의 메서드 호출
		ManagerServiceImpl service = ManagerServiceImpl.getInstance();
		int result = service.loginBoardManager(vo);		
		
		

		
		if(result == 1) {			
			path="/manager/boardListManager.go";
			
			ManagerVO data = service.getLoginListManager(vo);
			session = request.getSession(true);
			session.setAttribute("data", data);
			
			
		} else if (result == 0) {			
			path= "/common/resultData";
		}
		
		return path ;
	}

}
