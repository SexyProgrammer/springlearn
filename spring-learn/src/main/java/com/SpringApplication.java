package com;


import com.jin.service.UserService;
import com.jin.service.impl.UserServiceImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@ComponentScan("com.jin.*")
public class SpringApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext =new AnnotationConfigApplicationContext(SpringApplication.class);
	  UserService userService = annotationConfigApplicationContext.getBean(UserService.class);
//      UserServiceImpl bean = annotationConfigApplicationContext.getBean(UserServiceImpl.class);
	  userService.eat("food");
	}
}
