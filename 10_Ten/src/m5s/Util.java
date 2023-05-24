package m5s;

import java.util.Scanner;


public class Util {

	    Integer amount;
		Integer num;
		static	SortList list = new SortList();

		

		Scanner scan = new Scanner(System.in);
	    
	    public void scan() 
	    {
	    
		System.out.println("Please choose how many different integer numbers you want to enter: ");
		amount = scan.nextInt();
		System.out.println("Please type in the integer numbers of your choice - no duplicates!-  always followed by return:");
		for (int i=0; i<amount; i++ ) {
		  num = scan.nextInt();
		  list.addNode(num);
		}

	    }
	    

		public Integer getNum() {
	    	return num;
	    }
	    
	    public void setNum(Integer num) {
	    	this.num = num;
	    }
	    
	    public static SortList getList() {
	    	return list;
	    }
	    public static void setList(SortList list) {
	    	Util.list = list;
	    }
	
}