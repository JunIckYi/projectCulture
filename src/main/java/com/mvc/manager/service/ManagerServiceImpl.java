package com.mvc.manager.service;




import com.mvc.manager.vo.ManagerVO;
import com.mvc.manager.dao.ManagerMapperImpl;

public class ManagerServiceImpl {	
private static ManagerServiceImpl service = null;
	
	private ManagerMapperImpl mapper = new ManagerMapperImpl();
	
	private ManagerServiceImpl() {}
	public static ManagerServiceImpl getInstance() {
		if(service == null) {
			service = new ManagerServiceImpl();
		}
		return service;
	}
	
	
	
	
	public int loginBoardManager(ManagerVO vo){
		int result = mapper.loginBoardManager(vo);
		return result;
	}
	
	public ManagerVO getLoginListManager(ManagerVO vo){
		ManagerVO result =mapper.getLoginListManager(vo);
		return result;
	}
	
	
	

}
