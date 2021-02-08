package org.kpu.eclass.service;

import java.util.List;

import org.kpu.eclass.controller.UserController;
import org.kpu.eclass.domain.EvalutionVO;
import org.kpu.eclass.domain.UserVO;
import org.kpu.eclass.persistence.EvalutionDAO;
import org.kpu.eclass.persistence.UserDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class EvalutionServiceImpl implements EvalutionService{
	
	@Autowired
	private EvalutionDAO evalutionDAO;
	
	@Autowired
	public UserDAO userDAO;
	
	private static final Logger logger=LoggerFactory.getLogger(UserController.class);
	
	public EvalutionVO readEvalution(String id) throws Exception{
		return evalutionDAO.read(id);
	}
	
	public List<EvalutionVO> readEvalutionList() throws Exception{
		return evalutionDAO.readList();
	}
	public List<EvalutionVO> searchEvalutionList(String content) throws Exception{
		return evalutionDAO.searchList(content);
	}
	public void updateEvalution(EvalutionVO student) throws Exception{
		evalutionDAO.update(student);
	}
	public void deleteEvalution(String id,String id2) throws Exception{
		evalutionDAO.delete(id);
		userDAO.update3(id2);
	//	userDAO.update3()
	}
	
	@Transactional ( propagation=Propagation.REQUIRED, isolation=Isolation.READ_COMMITTED, timeout=10 )
	public void addEvalution(EvalutionVO vo) throws Exception{
	
		evalutionDAO.add(vo);

		String id=vo.getUserID();
		
		userDAO.update2(id);
		
		
		System.out.println("TRANSACTION 처리 완료");
		
	
	}
}
