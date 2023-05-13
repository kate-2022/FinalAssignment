package m5s;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		int choice;
		float newBalance;
		float withdraw;
		float deposit;
		
		BankAccount account= new BankAccount();
		account.bankTransaction();
		
//    
//		System.out.println("Welcome to Munich branch! \nPlease choose one of the options below: \n"
//				+ "Press 1 for Balance Check\n"
//				+ "Press 2 for Withdrawal\n"
//				+ "Press 3 for Deposit\n"
//				+ "Press 4 for Exit");
//		
//		Scanner scan = new Scanner(System.in);
//		choice= scan.nextInt();
//			if(choice==1) {
//			System.out.println("Your balance is: "+ account.getBalance()+ "Euro.");
//			System.out.println("Please choose one of the options below: \n"
//					+ "Press 2 for Withdrawal\n"
//					+ "Press 3 for Deposit\n"
//					+ "Press 4 for Exit");
//			choice= scan.nextInt();
//				if (choice==2) {
//					System.out.println("Please type in the amount you wish to withdraw:");
//					withdraw = scan.nextFloat();
//					newBalance = (account.getBalance()-withdraw);
//						if (newBalance>=0) {
//						account.setBalance(newBalance);
//						System.out.println("Your new balance is: " +newBalance + "Euro.");
//						}
//						else 
//							System.out.println("Not enough money available on your account!");
//					
//				}
//				else if (choice==3) {
//					System.out.println("Please type in the amount you wish to deposit:");
//					deposit = scan.nextFloat();
//					newBalance = (account.getBalance()+deposit);
//					account.setBalance(newBalance);
//					System.out.println("Your new balance is: " +newBalance + "Euro.");
//				}
//				else if (choice==4)
//					System.out.println("Thank you for your transaction, good bye!");
//				else 
//					System.out.println("no valid choice!");
//					
//			}
//		else if (choice==2) {
//			System.out.println("Please type in the amount you wish to withdraw:");
//			withdraw = scan.nextFloat();
//			newBalance = (account.getBalance()-withdraw);
//				if (newBalance>=0) {
//				account.setBalance(newBalance);
//				System.out.println("Your new balance is: " +newBalance + "Euro.");
//				}
//				else
//					System.out.println("Not enough money available on your account!");
//		}
//		else if (choice==3) {
//			System.out.println("Please type in the amount you wish to deposit:");
//			deposit = scan.nextFloat();
//			newBalance = (account.getBalance()+deposit);
//			account.setBalance(newBalance);
//			System.out.println("Your new balance is: " +newBalance + "Euro.");
//		}
//		else if (choice==4)
//			System.out.println("Thank you for you transaction, good bye!");
//		else 
//			System.out.println("no valid choice!");

	}

}
