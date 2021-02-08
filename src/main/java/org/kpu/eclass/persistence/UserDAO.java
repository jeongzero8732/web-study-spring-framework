package org.kpu.eclass.persistence;

import java.util.List;

import org.kpu.eclass.domain.EvalutionVO;
import org.kpu.eclass.domain.UserVO;


public interface UserDAO {
	public void add(UserVO student) throws Exception;
	public UserVO read(String id) throws Exception;
	public UserVO login(UserVO user) throws Exception;
	public List <UserVO> readList() throws Exception;
	public void update(UserVO vo) throws Exception;
	public void update2(String id) throws Exception;
	public void update3(String id) throws Exception;
	public void delete(UserVO vo) throws Exception;
}
