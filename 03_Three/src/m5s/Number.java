package m5s;

import java.util.Scanner;
import m5s.NumNotPositiveException;

public class Number {

	int num;
	
	public String acceptNumber() 
	{		
		Scanner scan = new Scanner(System.in);
	 
		System.out.println("Please enter a positive integer number: ");
		num = scan.nextInt();
		try { if (num>=0)
			System.out.println ("The number you entered is: " +num);
		else {
			throw new NumNotPositiveException("The number should be positive!");
		}
	
		}catch (NumNotPositiveException nnpe) {
			nnpe.printStackTrace();
			
		}
		scan.close();
		return"";
	}
}
