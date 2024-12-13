package com.smirnovkoss.aop.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(10)
public class SecondAspect {
	@Before("execution(public void com.smirnovkoss.aop.UniLibrary.getBook())")
	public void beforeGetBookAdvice() {
		System.out.println("beforeGetBookAdvice10: This is you Book!");
		System.out.println("----------------------------------------------------------");
	}
	
	@AfterReturning("execution(public void com.smirnovkoss.aop.UniLibrary.getBook())")
	public void afterGetBookAdvice() {
		System.out.println("afterGetBookAdvice10: This is you Book!");
		System.out.println("----------------------------------------------------------");
	}
}
