package m5s;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		
	ProducerThread produce = new ProducerThread();
	Thread t1= new Thread(produce);
	t1.setPriority(7);
	t1.start();
	
	
	ConsumerThread consume = new ConsumerThread();
	Thread t2= new Thread(consume);
	t2.start();


	}

}
