package org.kpu.eclass.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.kpu.eclass.domain.EvalutionVO;
import org.kpu.eclass.domain.UserVO;
import org.kpu.eclass.service.EvalutionService;
import org.kpu.eclass.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;


public class SessionInterceptor extends HandlerInterceptorAdapter {

	@Autowired(required=true)
	private EvalutionService evalService;
	
	@Override
	public boolean preHandle (HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{

		HttpSession httpSession=request.getSession(false);
		
		
		if(httpSession.getAttribute("user")==null) {
			System.out.println("no session");
			response.sendRedirect("http://localhost:8080/eclass/user/login/");
			return false;
		}
		
		System.out.println("session123123");
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception{
		
		
//		
//		  HttpSession httpSession=request.getSession();
//		  
//		  Object userVO=modelAndView.getModel().get("user");
		  
//		  ModelMap modelMap=modelAndView.getModelMap(); // Object
//		  userVO=modelMap.get("user"); 
//		  UserVO userVO=(UserVO)request.getAttribute("user");
		  
		 // System.out.println(userVO);
//		  
//		  System.out.println("123123123");
//		  if(userVO!=null) {
//			  
//			  request.getSession().setAttribute("login", userVO);
//			  
//			  httpSession.setAttribute(LOGIN, userVO);
//			  System.out.println("new login"); response.sendRedirect("/"); }
//		  
//		  	  System.out.println("1aaaaaaa"+LOGIN);
//		  	  System.out.println("postHandle executed.");
//		  }
		 
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception{
		System.out.println("afterCompletion executed.");
	}
}
