package org.kpu.eclass.service;

import java.util.List;
import org.kpu.eclass.domain.EvalutionVO;

public interface EvalutionService {
	public EvalutionVO readEvalution(String id) throws Exception;
	public void addEvalution(EvalutionVO vo) throws Exception;
	public List<EvalutionVO> readEvalutionList() throws Exception;
	public List<EvalutionVO> searchEvalutionList(String content) throws Exception;
	public void updateEvalution(EvalutionVO student) throws Exception;
	public void deleteEvalution(String id,String id2)  throws Exception;
}
