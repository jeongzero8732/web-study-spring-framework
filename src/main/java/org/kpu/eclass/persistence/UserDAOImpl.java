package org.kpu.eclass.persistence;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.kpu.eclass.domain.EvalutionVO;
import org.kpu.eclass.domain.UserVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

 @Component
 public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private SqlSession sqlSession;
										
	private static final String namespace = "org.kpu.eclass.mapper.UserMapper";

	public UserVO read(String id) throws Exception {
	
		UserVO vo = sqlSession.selectOne(namespace+".selectByid", id);
		return vo;   
	}
 
	public List<UserVO> readList() throws Exception {
		List<UserVO> userlist = new ArrayList<UserVO>();
		userlist = sqlSession.selectList(namespace + ".selectAll");
		return userlist;
	}
	
	public void add(UserVO vo) throws Exception {
		sqlSession.insert(namespace + ".insert", vo);
	}
	
	public UserVO login(UserVO vo) throws Exception {
		return sqlSession.selectOne(namespace + ".login", vo);
	}

	public void delete(UserVO vo) throws Exception {
		// TODO Auto-generated method stub
		sqlSession.delete(namespace + ".delete", vo);
	}

	public void update(UserVO vo) throws Exception {
		// TODO Auto-generated method stub
	    sqlSession.update(namespace + ".update", vo);
	   // System.out.println("jaeho"+vo.getUserID());
	}
	
	public void update2(String id) throws Exception {
		// TODO Auto-generated method stub
	    //System.out.println("777777777777777777777777777777777777");
	    sqlSession.update(namespace + ".update2",id);
	   // System.out.println("777777777777777777777777777777777777");
	    //System.out.println("mmmmmmmmmmmmmmmmm"+student.getUserID());
	}
	
	public void update3(String id) throws Exception {
		// TODO Auto-generated method stub
	   // System.out.println("777777777777777777777777777777777777");
	    sqlSession.update(namespace + ".update3",id);
	   // System.out.println("777777777777777777777777777777777777");
	    //System.out.println("mmmmmmmmmmmmmmmmm"+student.getUserID());
	}
}
