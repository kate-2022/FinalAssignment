package m5s;

public class SomeImplementingClass extends AbstractClass implements Interface1, Interface2{

	public SomeImplementingClass() {};
	
	/*
	 * * any class can extend just 1 class but implement as many interfaces as desired
	 * (but needs to implement the methods!)
	 */

	@Override
	public void thisIsAnotherAbstractMethod() {
		System.out.println("Whatever you like..");
		
	}

	@Override
	public void hereYouSeeAnAbstractMethod() {
		System.out.println("Just playing around!");
		
	}

	@Override
	public void thisIsAnAbstractMethodfromAbstractClass() {
		System.out.println("Do something useful here..");
		
	}


	

	

}
