package m5s;
import java.util.Random;
import java.util.PriorityQueue;

public class ProducerThread implements Runnable{
	
	static int num;
	int i;
	static PriorityQueue quy= new PriorityQueue();
	Random rand = new Random();
    
	@Override
	public void run() {
         random();
		}
		
	
	public synchronized void random() {
		do {
			num = rand.nextInt(100);
			quy.add(num);	
			i++;
			}while (i<10);
			System.out.println("ProducerThread"+ quy);		
	}
	
	public int getNum() {
		return num;
	}
	
	public int getI() {
		return i;
	}
	
	public PriorityQueue getQuy() {
		return quy;
	}
	
}
