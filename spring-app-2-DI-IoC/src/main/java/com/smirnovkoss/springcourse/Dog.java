package com.smirnovkoss.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("singleton")
@Scope("prototype")
public class Dog implements Pet {
	
	@Override
	public void say() {
		System.out.println("Goy-Goy");
	}
	
//	@PostConstruct  ---   deleted in new version
	public void init() {
		System.out.println("init");
	}
	
//	@PreDestroy   ---   deleted in new version
	public void destroy() {
		System.out.println("destroy");
	}
}
