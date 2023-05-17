package m5s;

public class ThreadDemo {

	public static void main(String[] args) {
		
	EvenThread even = new EvenThread();
	Thread t1= new Thread(even);
	t1.start();
	
	OddThread oddy = new OddThread();
	Thread t2= new Thread(oddy);
	t2.start();

	}

}
