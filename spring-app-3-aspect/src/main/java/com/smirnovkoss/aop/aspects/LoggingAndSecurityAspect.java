package com.smirnovkoss.aop.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(20)
public class LoggingAndSecurityAspect {
	
	
	
	
	
	
	
//	@Before("execution(public void get*())")
	@Before("execution(public void com.smirnovkoss.aop.UniLibrary.getBook())")
	public void beforeGetBookAdvice() {
		System.out.println("beforeGetBookAdvice: This is you Book!");
		System.out.println("----------------------------------------------------------");
	}
	
	@AfterReturning("execution(public void com.smirnovkoss.aop.UniLibrary.getBook())")
	public void afterGetBookAdvice() {
		System.out.println("afterGetBookAdvice: This is you Book!");
		System.out.println("----------------------------------------------------------");
	}
	
	
//	@Before("execution(public void get*(String))")
//	public void beforeGetBookAdvice() {
//		System.out.println("beforeGetBookAdvice: This is you Book!");
//	}
	
//	@Before("execution(public void get*(com.smirnovkoss.aop.Book))")
//	public void beforeGetBookAdvice() {
//		System.out.println("beforeGetBookAdvice: This is you Book!");
//	}
	
	
	

//	@Pointcut("execution(* com.smirnovkoss.aop.UniLibrary.get*())")
//	private void allGetMetods() {}
//	
//	@Before("allGetMetods()")
//	public void beforeGetBookLoggingAdvice() {
//		System.out.println("beforeGetBookLoggingAdvice: This is you Book!");
//	}
//	
//	@Before("allGetMetods()")
//	public void beforeGetBookSecurityAdvice() {
//		System.out.println("beforeGetBookSecurityAdvice: This is you security!");
//	}
	
	
	
	
	
//	@Pointcut("execution(* com.smirnovkoss.aop.UniLibrary.getBook())")
//	private void allGetMetodsFromUniLibrary() {}
//	
//	@Pointcut("execution(* com.smirnovkoss.aop.UniLibrary.return*())")
//	private void allReturnMetodsFromUniLibrary() {}
//	
//	@Pointcut("allGetMetodsFromUniLibrary || allReturnMetodsFromUniLibrary")
//	private void allGetAndReturnMetodsFromUniLibrary() {}
//	
//	
//	
//	@Before("allGetMetodsFromUniLibrary()")
//	public void beforeGetBookLoggingAdvice() {
//		System.out.println("beforeGetBookLoggingAdvice: This is you Book!");
//	}
//	
//	@Before("allReturnMetodsFromUniLibrary()")
//	public void beforeReturnBookLoggingAdvice() {
//		System.out.println("beforeReturnBookLoggingAdvice: Return!");
//	}
//	
//	@Before("allGetAndReturnMetodsFromUniLibrary()")
//	public void beforeGetAndReturnBookLoggingAdvice() {
//		System.out.println("beforeGetAndReturnBookLoggingAdvice: Return And Get!");
//	}
	
	
}
