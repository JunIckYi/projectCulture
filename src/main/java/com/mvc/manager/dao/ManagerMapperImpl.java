package com.mvc.manager.dao;


import com.mvc.manager.vo.ManagerVO;
import mybatis.SqlSessionTemplate;
import org.apache.ibatis.session.SqlSession;

public class ManagerMapperImpl implements ManagerMapper {	
	private SqlSession session;
	
	public ManagerMapperImpl() {
		session = SqlSessionTemplate.getSqlSession();
	}
	
	public int loginBoardManager(ManagerVO vo){
		return session.selectOne("loginBoardManager", vo);
	}
	
	public ManagerVO getLoginListManager(ManagerVO vo) {		
		return session.selectOne("getLoginListManager", vo);
	}

}
