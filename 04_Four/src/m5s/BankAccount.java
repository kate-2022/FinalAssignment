package m5s;

import java.util.Scanner;

public class BankAccount {
	
	private float balance;
	int choice;
	float newBalance;
	float withdraw;
	float deposit;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
		
	}
	
	public void bankTransaction() {

		System.out.println("Welcome to Munich branch! \nPlease choose one of the options below: \n"
				+ "Press 1 for Balance Check\n"
				+ "Press 2 for Withdrawal\n"
				+ "Press 3 for Deposit\n"
				+ "Press 4 for Exit");
		
		Scanner scan = new Scanner(System.in);
		choice= scan.nextInt();
			if(choice==1) {
			System.out.println("Your balance is: "+ balance+ "Euro.");
			System.out.println("Please choose one of the options below: \n"
					+ "Press 2 for Withdrawal\n"
					+ "Press 3 for Deposit\n"
					+ "Press 4 for Exit");
			choice= scan.nextInt();
				if (choice==2) {
					System.out.println("Please type in the amount you wish to withdraw:");
					withdraw = scan.nextFloat();
					newBalance = (balance-withdraw);
						if (newBalance>=0) {
						setBalance(newBalance);
						System.out.println("Your new balance is: " +newBalance + "Euro.");
						}
						else 
							System.out.println("Not enough money available on your account!");
								System.out.println("Please choose one of the options below: \n"
										+ "Press 3 for Deposit\n"
										+ "Press 4 for Exit");
								choice= scan.nextInt();
								if (choice==3) {
									System.out.println("Please type in the amount you wish to deposit:");
									deposit = scan.nextFloat();
									newBalance = (balance+deposit);
								setBalance(newBalance);
									System.out.println("Your new balance is: " +newBalance + "Euro.");
								}
								else if (choice==4)
									System.out.println("Thank you for your transaction, good bye!");
								else 
									System.out.println("no valid choice!");
					
				}
				else if (choice==3) {
					System.out.println("Please type in the amount you wish to deposit:");
					deposit = scan.nextFloat();
					newBalance = (balance+deposit);
				setBalance(newBalance);
					System.out.println("Your new balance is: " +newBalance + "Euro.");
				}
				else if (choice==4)
					System.out.println("Thank you for your transaction, good bye!");
				else 
					System.out.println("no valid choice!");
					
			}
		else if (choice==2) {
			System.out.println("Please type in the amount you wish to withdraw:");
			withdraw = scan.nextFloat();
			newBalance = (balance-withdraw);
				if (newBalance>=0) {
				setBalance(newBalance);
				System.out.println("Your new balance is: " +newBalance + "Euro.");
				}
				else
					System.out.println("Not enough money available on your account!");
				System.out.println("Please choose one of the options below: \n"
						+ "Press 3 for Deposit\n"
						+ "Press 4 for Exit");
				choice= scan.nextInt();
				if (choice==3) {
					System.out.println("Please type in the amount you wish to deposit:");
					deposit = scan.nextFloat();
					newBalance = (balance+deposit);
				setBalance(newBalance);
					System.out.println("Your new balance is: " +newBalance + "Euro.");
				}
				else if (choice==4)
					System.out.println("Thank you for your transaction, good bye!");
				else 
					System.out.println("no valid choice!");
				
		}
		else if (choice==3) {
			System.out.println("Please type in the amount you wish to deposit:");
			deposit = scan.nextFloat();
			newBalance = (balance+deposit);
			setBalance(newBalance);
			System.out.println("Your new balance is: " +newBalance + "Euro.");
		}
		else if (choice==4)
			System.out.println("Thank you for you transaction, good bye!");
		else 
			System.out.println("no valid choice!");


	}
	
	
	

}

