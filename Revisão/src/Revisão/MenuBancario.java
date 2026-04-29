package Revisão;

import java.util.Scanner;

public class MenuBancario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContaBancaria conta_bancaria = new ContaBancaria(); 
		
		int option = 0;
		
		do {
			System.out.println("MENU");
			System.out.println("\n");
			System.out.println("1 - Credit");
			System.out.println("2 - Debit");
			System.out.println("3 - Check balance");
			System.out.println("4 - Close the system");
			System.out.println("\n");
			System.out.println("Choose one of the options above: ");
			option = sc.nextInt();
			System.out.println();
			
			switch(option) {
			case 1:
				System.out.println("Enter the amount for credit: ");
				double credit = sc.nextDouble();
				conta_bancaria.setCredit(credit);
				System.out.println("--------------");
			break;
				
			case 2: 
				System.out.println("Enter the amount for debit:");
				double debit = sc.nextDouble();
				conta_bancaria.setDebit(debit);
				System.out.println("--------------");
			break;
			case 3: System.out.println("Current Balance: " + conta_bancaria.getBalance()); System.out.println("\"--------------\""); break;
			case 4: System.out.println("Closing the system..."); System.out.println("--------------"); break;
			default: System.out.println("Invalid option."); System.out.println("--------------");;
			
			} 
		} while (option != 4); 
	}
}