package m5s;


public class Main {
	
	static SortList list1 =  new SortList();

	public static void main(String[] args) {
		
    Util utili = new Util();
    utili.scan();
    
    list1 = utili.getList();
 //   System.out.println(list1);
    
    System.out.println("Before sorting:");
    list1.display();
    System.out.println("\n+++++++++++++++");
    
    list1.sortList();
    System.out.println("After sorting:");
    list1.display2();
    

    System.out.println();

	}

}
