package test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class aspectClass {
	@Pointcut("execution(* test.ToDoSomething.*(..))")
	public void toDo(){}
	@Before("toDo()")
	public void toDoSomethingBefore(){
		System.out.println("doing someThing before");
	}
	@After("toDo()")
	public void toDoSomethingAfter(){
		System.out.println("doing something after");
	}
	@AfterReturning(returning="g",pointcut="toDo()")
	public void showSuccess(Object g){
		System.out.println("success return"+g);
	}
	@Around("execution(* test.ToDoSomething.toDoSomething(..))")
	public void doSomethingAround(ProceedingJoinPoint jp) throws Throwable{
		System.out.println("around before");
		jp.proceed();
		System.out.println("around After");
		
	}

}
