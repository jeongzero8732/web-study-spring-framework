package org.kpu.eclass.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kpu.eclass.domain.EvalutionVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EvalutionDAOImpl implements EvalutionDAO{

	@Autowired
	private SqlSession sqlSession;
	
	private static final String namespace = "org.kpu.eclass.mapper.EvalutionMapper";

	public EvalutionVO read(String id) throws Exception {
	
		EvalutionVO vo = sqlSession.selectOne(namespace+".selectByid", id);
		return vo;   
	}
 
	public List<EvalutionVO> readList() throws Exception {
		List<EvalutionVO> studentlist = new ArrayList<EvalutionVO>();
		studentlist = sqlSession.selectList(namespace + ".selectAll");
		return studentlist;
	}
	
	public List<EvalutionVO> searchList(String content) throws Exception {
		List<EvalutionVO> studentlist = new ArrayList<EvalutionVO>();
	//	System.out.println("yyyyyyyyyyyyyyyyyyyyy"+content+"yyyyyyyyyyyyyyyyyyyyy");
		//System.out.println("yyyyyyyyyyyyyyyyyyyyy"+total+"yyyyyyyyyyyyyyyyyyyyy");
		studentlist = sqlSession.selectList(namespace + ".searchAll",content);
		return studentlist;
	}
	
	public void add(EvalutionVO vo) throws Exception {
		sqlSession.insert(namespace + ".insert", vo);
	}

	public void delete(String evalutionID) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace + ".delete", evalutionID);
	}

	public void update(EvalutionVO student) throws Exception {
		// TODO Auto-generated method stub
	    sqlSession.update(namespace + ".update", student);
	}
	
}
