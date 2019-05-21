package com.spring;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;  

@Aspect
public class TrackOperation {

	@Pointcut("execution(* Operation.*(..))")  
    public void k(){}//pointcut name  
	
	//applying pointcut on before advice
	@Before("k()")  
    public void myadvice(JoinPoint jp)  
    {  
        System.out.println("additional concern");    
    }  
}
