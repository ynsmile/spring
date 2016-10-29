package test;

public class ToDoSomething implements todo {

	@Override
	public void toDoSomething() {
		System.out.println("I am doing something now");
		
	}

	@Override
	public String show() {
		String g = "hello";
		System.out.println(g+"g");
		return g;
	}

}
