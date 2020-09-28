package com.jin.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserProxy {

	@Before(value = "execution(* com.jin.service..*.*(..))")
	public void dosomething(){
		System.out.println("代理");
	}

}
