package m5s;

public abstract class AbstractClass {
	
	public AbstractClass() {
	
	}
	
	/*
	 * abstract classes can have implemented and unimplemented methods/
	 * abstract classes can have non-abstract and abstract methods
	 * an abstract class can provide instance variables
	 * an abstract class can define/have a constructor
	 * an abstract class can have any visibility
	 * an abstract class inherits from Object class
	 * 
	 */
	
	public abstract void thisIsAnAbstractMethodfromAbstractClass();
	
	public void thisIsAnImplementedMethod() {
		System.out.println("Nothing else to see here..");
	}

}
