package org.kpu.eclass.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.kpu.eclass.domain.UserVO;
import org.kpu.eclass.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/user")
public class UserController {
	private static final Logger logger=LoggerFactory.getLogger(UserController.class);

	@Autowired(required=true)
	private UserService userService;

	
	@RequestMapping(value= {"/login"}, method=RequestMethod.GET)
	public String loginUserGet() throws Exception{
	//	logger.info("register URL GET method called. then fowrard member_register.jsp");
		
		return "user/login";
	}
	
	@RequestMapping(value= {"/login"}, method=RequestMethod.POST)
	public String loginUserPost(UserVO vo, HttpSession httpSession, Model model,HttpServletRequest request) throws Exception{
		//HttpSession session=req.getSession();
		UserVO login_user=userService.loginUser(vo);
		
		  if(login_user==null) {	 
			  return "/error/login_fail";			 
		  }
		 
		httpSession.setAttribute("user", login_user);
		
	//	System.out.println(login_user.getUserID()+"================="); 
	
	//	logger.info("register URL POST method called. then fowrard home.jsp");
	return "/user/success_login";
	
	}
	
	 @RequestMapping(value="/logout", method=RequestMethod.GET)
		public String logoutUserGet(HttpSession session) throws Exception{	
			session.invalidate();
			//logger.info("/modify?id=kang URL POST method called. then modifyMemberPost executed");
			return "redirect:/";	
	 }
	
	 @RequestMapping(value= {"/signup"}, method=RequestMethod.GET)
		public String signupUserGet() throws Exception{
			//logger.info("register URL GET method called. then fowrard member_register.jsp");
			return "user/signup";
		}
		
		 @RequestMapping(value= {"/signup"},method=RequestMethod.POST)
		 public String signupUserPost(@ModelAttribute("userr") UserVO vo) throws Exception {
			 
			 System.out.println("========================="+vo.getUserID()+"-------------------------");
			 UserVO id=(userService.readUser(vo.getUserID()));
			 
			 if(id==null) {
				 userService.addUser(vo); 
				
			 }else if(id.equals(vo.getUserID())) {
				 return "/error/dup_id";
			 }
			
			// logger.info(vo.toString());
			// logger.info("/register URL POST method called. then createMember method executed");
		  return "/error/signup_success";
		  }
		 
		 @RequestMapping(value="/delete", method=RequestMethod.GET)
			public String deleteUserGet(@ModelAttribute("student") UserVO vo,HttpSession session) throws Exception{	
				userService.deleteUser(vo);
				session.invalidate();
			//	logger.info("/modify?id=kang URL POST method called. then modifyMemberPost executed");
				return "redirect:/";	
		 }
	 
	 @RequestMapping(value="/modify", method=RequestMethod.GET)
	 public String modifyUserGet(Model model,HttpSession session) throws Exception {
		 
		 String id = ((UserVO)session.getAttribute("user")).getUserID();
		// System.out.println(id);
		 UserVO student =userService.readUser(id);
		// logger.info("/modify?id=kang URL GET method called. then forward member_modify.jsp");
				 
		// logger.info("------------------------"+student.toString()+ "------------------------");
		 model.addAttribute("student",student); 
		 return "user/userinfo"; 
	  }
	 
	 @RequestMapping(value="/modify", method=RequestMethod.POST) 
	 public String modifyUserPost(@ModelAttribute UserVO vo) throws Exception {	
		 
		// System.out.println("jjdfldj"+vo.getUserID()+"==========");
		 
		 userService.updateUser(vo); 
		 
		// System.out.println(vo.getUserID()+"ffff");
		 
		// logger.info("/modify?id=kang URL POST method called. then modifyMemberPost executed");
		 return "redirect:/";
	 }
	 
	 
	 @RequestMapping(value="/score", method=RequestMethod.GET)
	 public String scoreUserGet(Model model,HttpSession session) throws Exception {
		 
		 String id = ((UserVO)session.getAttribute("user")).getUserID();
		// System.out.println(id);
		 UserVO student =userService.readUser(id);
		// logger.info("/modify?id=kang URL GET method called. then forward member_modify.jsp");
				 
		// logger.info("------------------------"+student.toString()+ "------------------------");
		 model.addAttribute("student",student); 
		 return "user/score"; 
	  }
	 
	
	
}
