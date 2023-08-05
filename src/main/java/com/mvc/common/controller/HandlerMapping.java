package com.mvc.common.controller;

import java.util.HashMap;
import java.util.Map;



public class HandlerMapping {
	private Map<String, Controller> mappings;
	
	public HandlerMapping() {
		mappings = new HashMap<>();
		
		/* 답변형 게시판 처리 */
//		mappings.put("/board/getBoardList.do", new GetBoardListController());
		

		
	}
	
	public Controller getController(String path) {
		return mappings.get(path);
	}
}
