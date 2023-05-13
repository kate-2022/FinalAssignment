package m5s;

public class NumNotPositiveException extends Exception{
	
	String message;
	
	public NumNotPositiveException(String note) {
		message = note;
		System.out.println(message);
	}
	
	

}
