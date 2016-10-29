package test;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("test")
public class ToDoBean {
	@Bean
	public todo getToDoSomething(){
		return new ToDoSomething();
	}
	
	
}
