package m5s;

public interface Interface1 {
	/*
	 * interfaces do not contain implemented methods
	 * all methods of an interface are abstract!
	 * an interface can´t provide instance variables
	 * an interface can´t have a constructor!
	 * visibility of an interface must be public or default(non)
	 */
	
	public abstract void hereYouSeeAnAbstractMethod();
	
	void thisIsAnotherAbstractMethod();

}
