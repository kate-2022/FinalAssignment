package m5s;

import java.util.Scanner;

public class Run {
	static int [] arr;
	static int size;
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int targetValue;
		
		System.out.println("Please type in your target value (integer): ");
		targetValue = scan.nextInt();
		
		Service service =new Service();
		
		arr = service.sortService();
		for(int elem: arr) {
			System.out.print(elem +",");
		}
		System.out.println();
		service.runBinarySearchIteratively(arr,targetValue,arr[0], arr[size]);
		
		
		scan.close();
	}

}
