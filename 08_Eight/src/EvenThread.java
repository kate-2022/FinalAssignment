
public class EvenThread implements Runnable{
	

	int num;
	
	@Override
	public void run() {
		
		for (int i=1; i<=10; i++) {
			if (i % 2==0)
				num=i;
		System.out.println(num);
		}
		
	}

	
}
