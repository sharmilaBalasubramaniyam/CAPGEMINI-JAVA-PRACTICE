package banking.app;

import java.util.*;
import banking.exception.*;

public class BankApp_Main {
	
	public static void main(String[] args) {
		
		Scanner ms=new Scanner(System.in);
		
		Bank bank=new Bank();
		bank.addAccount(new BankAccount(1,"Ramesh",50000));
		bank.addAccount(new BankAccount(2,"suresh",710000));
		
		try {
			System.out.println("Enter sender Account Number : ");
			int sender=ms.nextInt();
			System.out.println("Enter the receiver Account Number : ");
			int receiver=ms.nextInt();
			System.out.println("Transfer Amount");
			double amount=ms.nextDouble();
			BankAccount senderObj=bank.searchAccount(sender);
			BankAccount receiverObj=bank.searchAccount(receiver);
			
			senderObj.transfer(receiverObj, amount);
			senderObj.display();
			receiverObj.display();
		}
		catch(InvalidAmountException am) {
			System.out.println(am.getMessage());
		}
		catch(InsufficientBalanceException in) {
			System.out.println(in.getMessage());
		}
		catch(InvalidAccountException ina) {
			System.err.println(ina.getMessage());
		}
		catch(DailyLimitExceededException d) {
			System.err.println(d.getMessage());
		}
	}
}
