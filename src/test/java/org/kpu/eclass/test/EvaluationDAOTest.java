package org.kpu.eclass.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.kpu.eclass.domain.EvalutionVO;
import org.kpu.eclass.domain.UserVO;
import org.kpu.eclass.persistence.EvalutionDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class EvaluationDAOTest {

		@Autowired
		private EvalutionDAO dao;
		private static Logger logger = LoggerFactory.getLogger(EvaluationDAOTest.class);
		
		@Test
		public void testReadByid() throws Exception{
			EvalutionVO vo;
			vo=dao.read("1");
			logger.info(vo.toString());
		}
		
		@Test
		public void testReadList() throws Exception{
			List<EvalutionVO> voList;
			voList=dao.readList();
			for(EvalutionVO svo : voList) {
				logger.info(svo.toString());
			}
		}
		
		@Test
		public void testinsert() throws Exception{
			List<EvalutionVO> voList;
			voList=dao.readList();
			for(EvalutionVO svo : voList) {
				logger.info(svo.toString());
			}
		}
		
		@Test
		public void testdelete() throws Exception{
			List<EvalutionVO> voList;
			voList=dao.readList();
			for(EvalutionVO svo : voList) {
				logger.info(svo.toString());
			}
		}

}