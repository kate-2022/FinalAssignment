package m5s;

import java.util.PriorityQueue;

public class ConsumerThread implements Runnable{

    int num1;
    int num2;
    int i;
	PriorityQueue pq= new PriorityQueue();
	ProducerThread thread = new ProducerThread();
	
	@Override
	public void run() {
		add();
		}
		
		
    public synchronized void add() { 	
    	pq = thread.getQuy();
    	System.out.println("ConsumerThread " +pq);
    	num1=(int)pq.poll();
    	System.out.println(num1);
    	num2=(int)pq.poll();
    	System.out.println(num2);
    	System.out.println("The sum of 2 random numbers is: "+ (num1= num1+num2));    	
    }
    
    }
