package test;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AddMethod {
	@DeclareParents(
			value="test.ToDoSomething+",
			defaultImpl=test.NewToDoImpl.class)
	public NewToDo newToDo;

}
