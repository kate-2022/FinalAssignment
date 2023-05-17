package m5s;

import java.util.Scanner;

public class Run {
	static int [] arr;
	static int size;
	static int index;
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int targetValue;
		
		System.out.println("Please type in your target value (integer): ");
		targetValue = scan.nextInt();
		
		Service service =new Service();
		arr = service.sortService();
		
		for(int elem: arr) {
			System.out.print(elem +"_");
		}
		System.out.println();
		index= service.runBinarySearchIteratively(arr,targetValue,arr[0], arr[size]);
		
		System.out.println(index);
		System.out.println(targetValue);
		System.out.println();
		
		if (index<=arr.length)
				System.out.println("Index of your target value is: " + index);
		else
			System.out.println("The target you searched for is not available!");
		scan.close();
	}

}
