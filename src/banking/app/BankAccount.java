package banking.app;

import banking.exception.*;

public class BankAccount {
	private int accountNumber;
	private String accountHolder;
	private double balance;
	
	static final double DAILY_LIMIT=5000;

	public BankAccount(int accountNumber, String accountHolder, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getAccountHolder() {
		return accountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) throws InvalidAmountException{
		if(amount <= 0) {
			throw new InvalidAmountException("Deposit amount must be greater than 0");
		}
		balance+=amount;
		System.out.println("Deposit successfull");
		System.out.println("Current Balance is "+balance);
	}
	
	public void withdraw(double amount) throws InvalidAccountException, InvalidAmountException,
	DailyLimitExceededException,InsufficientBalanceException{
		if(amount <= 0)
			throw new InvalidAmountException("Withdraw amount must be greater than 0");
		if(amount>DAILY_LIMIT) {
			throw new DailyLimitExceededException("Daily Limit Exceeded");
		}
		if(amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		}
		
		balance-=amount;
		System.out.println("Withdraw of Rs: "+amount+" successfully Completed");
		System.out.println("Your Current Balance is "+ balance);
	}
	
	public void transfer(BankAccount receiver, double amount) throws InvalidAmountException,
	InsufficientBalanceException, DailyLimitExceededException, InvalidAccountException{
		withdraw(amount);
		receiver.balance+=amount;
		System.out.println("Transfer Successfully Completed");
	}
	
	
	public void display() {
		System.out.println("==============================");
		System.out.println("Account No : "+accountNumber +
				"\n Account Holder : "+accountHolder+
				"\n Balance Amount : "+balance);
	}
}
