package org.kpu.eclass.aop;

import java.util.Arrays;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAspect {

	private static final Logger logger=LoggerFactory.getLogger(UserAspect.class);

	@Around("execution(* org.kpu.eclass.controller..*Controller.*(..)) || execution(* org.kpu.eclass.service..*Impl.*(..)) || execution(* org.kpu.eclass.persistence..*Impl.*(..))")
	
	public Object logPrint(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
		
		long start =System.currentTimeMillis();
		
		Object result=proceedingJoinPoint.proceed();
		
		String type=proceedingJoinPoint.getSignature().getDeclaringTypeName();
		String name="";
		
		if(type.contains("Controlloer")) {
			name="Controlloer : ";
		}else if(type.contains("Service")) {
			name="Service : ";
		}else if(type.contains("DAO")) {
			name="Persistence : ";
		}
		
		long end=System.currentTimeMillis();
		
		logger.info(name+type+"."+proceedingJoinPoint.getSignature().getName()+"( )");
		logger.info("Argument/Parameter : " + Arrays.toString(proceedingJoinPoint.getArgs()));
		logger.info("Runninng Time : " + (end-start));
		logger.info("--------------------------------------------------------------------");
		
		return result;
	}
}
