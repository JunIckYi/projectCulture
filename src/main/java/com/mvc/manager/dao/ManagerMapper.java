package com.mvc.manager.dao;

import java.util.List;
import org.apache.ibatis.session.SqlSession;

import com.mvc.manager.vo.ManagerVO;

public interface ManagerMapper {
	
	public int loginBoardManager(ManagerVO vo);	
	public ManagerVO getLoginListManager(ManagerVO vo);
}
