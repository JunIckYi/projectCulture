package com.mvc.common.controller;

import java.util.HashMap;
import java.util.Map;

import com.mvc.manager.controller.BoardListManagerController;
import com.mvc.manager.controller.LoginBoardManagerController;
import com.mvc.manager.controller.LoginPageManagerController;



public class HandlerMapping {
	private Map<String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<>();
		
		/* 답변형 게시판 처리 */
		mappings.put("/manager/loginPageManager.go", new LoginPageManagerController());
		mappings.put("/manager/loginBoardManager.go", new LoginBoardManagerController());
		mappings.put("/manager/boardListManager.go", new BoardListManagerController());
		
		
		
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}
