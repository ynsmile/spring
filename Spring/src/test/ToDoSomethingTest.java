package test;

import org.aspectj.apache.bcel.classfile.ClassParser;
import org.junit.Test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ToDoSomethingTest {


	@Test
	public void test() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		todo t = (todo) ctx.getBean("doSomenthing");
		t.toDoSomething();
		t.show();
//		NewToDo d = (NewToDo) t;
//		d.showMethod();
	}

}
