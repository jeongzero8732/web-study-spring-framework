package org.kpu.eclass.persistence;

import java.util.List;

import org.kpu.eclass.domain.EvalutionVO;
import org.kpu.eclass.domain.UserVO;


public interface EvalutionDAO {
	public void add(EvalutionVO vo) throws Exception;
	public EvalutionVO read(String id) throws Exception;
	public List <EvalutionVO> readList() throws Exception;
	public List <EvalutionVO> searchList(String content) throws Exception;
	public void update(EvalutionVO student) throws Exception;
	public void delete(String id) throws Exception;
}
