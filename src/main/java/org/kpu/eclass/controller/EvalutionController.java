package org.kpu.eclass.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kpu.eclass.domain.EvalutionVO;
import org.kpu.eclass.domain.UserVO;
import org.kpu.eclass.service.EvalutionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="/lecture")
public class EvalutionController {
	private static final Logger logger=LoggerFactory.getLogger(UserController.class);

	@Autowired
	private EvalutionService evalService;
	
	@RequestMapping(value= {"/evaluation"}, method=RequestMethod.GET)
	public String evaluationGet(Model model) throws Exception{
		//logger.info("register URL GET method called. then fowrard member_register.jsp");
		List<EvalutionVO> eval = evalService.readEvalutionList();
	//	System.out.println("---------------["+eval+"]-----------------");
	//	logger.info(" /member/list URL called. then listMember method executed");
		model.addAttribute("lecture",eval);

		return "lecture/evaluation";
	}
	
	@RequestMapping(value= {"/register"}, method=RequestMethod.GET)
	public String registerEvalutionGet() throws Exception{
		//logger.info("register URL GET method called. then fowrard member_register.jsp");
		//System.out.println("jjjjjjjjjjjjjjjjjjj");
		return "lecture/evaluation_insert";
	}
	
	 @RequestMapping(value= {"/register"},method=RequestMethod.POST)
	 public String registerEvalutionPost(@ModelAttribute("user2") EvalutionVO vo,HttpSession session,Model model) throws Exception {
		
		 String id = ((UserVO)session.getAttribute("user")).getUserID();
		 vo.setUserID(id);
		 try {
			 evalService.addEvalution(vo); 
		 }catch(Exception e) {
			 
			 System.out.println(e);
			 return "error/insert_eval_fail";
		 }

		// logger.info(vo.toString());
		// logger.info("/register URL POST method called. then createMember method executed");
	  return "redirect:/lecture/evaluation";
	  }
	 
	 @RequestMapping(value="/delete", method=RequestMethod.GET)
		public String deleteEvalGet(String evalutionID,String userID) throws Exception{	
		 evalService.deleteEvalution(evalutionID,userID);
		 System.out.println(userID+"ppppppppppppppppppppppppppppppppppppppppp");
		//System.out.println(evalutionID+"fkdjfalkdjg;kladjfkldsajfl;kdsajfa;ds");
		//	logger.info("/modify?id=kang URL POST method called. then modifyMemberPost executed");
			return "redirect:/lecture/evaluation";
	 }
	 
	 
	 @RequestMapping(value="/modify", method=RequestMethod.GET)
	 public String modifyLecGet(@RequestParam("evalutionID") String evalutionID, Model model) throws Exception {
		// System.out.println("------------------"+evalutionID+"-----------------------");
		 EvalutionVO eval =evalService.readEvalution(evalutionID);
		 
		// logger.info("/modify?id=kang URL GET method called. then forward member_modify.jsp");
		//System.out.println("----------------"+eval.getUserID()+"---------------");
		 model.addAttribute("eval",eval); 
		 return "lecture/evalution_update"; 
	  }
	 
	 @RequestMapping(value="/modify", method=RequestMethod.POST) 
	 public String modifyUserPost(@ModelAttribute EvalutionVO vo) throws Exception {	
		
		 evalService.updateEvalution(vo);
		 
		// System.out.println(vo.getUserID()+"ffff");
		 
		// logger.info("/modify?id=kang URL POST method called. then modifyMemberPost executed");
		 return "redirect:/lecture/evaluation";
	 }
	 
	 @RequestMapping(value= {"/error"}, method=RequestMethod.GET)
		public String ModifyGet() throws Exception{
		//	logger.info("register URL GET method called. then fowrard member_register.jsp");
			
			return "/error/modify_fail";
		}
	
	 
		@RequestMapping(value= {"/search"}, method=RequestMethod.POST)
		public String searchLecPost(HttpServletRequest request, HttpServletResponse response,Model model) throws Exception{
			
			//logger.info("register URL GET method called. then fowrard member_register.jsp");
			
			String content=request.getParameter("search");
			String total=request.getParameter("Lecture-div");
		//	System.out.println("999999999999999"+content+"9999999999999999");
			//System.out.println("999999999999999"+total+"9999999999999999");
			List<EvalutionVO> eval = evalService.searchEvalutionList(content);
		//	System.out.println("---------------["+eval+"]-----------------");
		//	logger.info(" /member/list URL called. then listMember method executed");
			
			
			model.addAttribute("eee",eval);

			return "lecture/evaluation_search";
		}
}