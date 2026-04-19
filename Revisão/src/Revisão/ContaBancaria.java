package Revisão;

public class ContaBancaria {
	
	private double balance = 1000; 
	protected String holder = "Marcos";
	
	public double getBalance() {return balance;} //It'll return the account holder's balance
	
	public void setCredit(double amount) {balance = balance + amount;} //It'll credit the value to the account holder's balance
	
	public void setDebit(double amount) { //It'll debit the value to the account holder's balance
		if (amount <= balance) balance = balance - amount; //Condition for when the balance is sufficient
		else System.out.println("INSUFFICIENT BALANCE"); //Condition for when the balance isn't sufficient
	}
		
}
