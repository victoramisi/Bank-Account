
import java.util.ArrayList;
import java.util.Scanner;
//@SuppressWarnings("unused")
public class UserActions extends Actions {

	ArrayList<Chequings> chequingsDB = new ArrayList<Chequings>();
	ArrayList<Transactions> transactionsDB = new ArrayList<Transactions>();
	
	Scanner userInput = new Scanner(System.in);
	@Override
	public void viewTransactions(String nameOfPerson) {
		boolean historyFound = false;
		if(transactionsDB.size() > 0) {
			for(Transactions x: transactionsDB) {
				if(x.transactionName.equals(nameOfPerson)) {
					historyFound =true;
				System.out.println("Item: " + x.itemToBuy+ "| Price: " + x.itemPrice+ "| Date: " + x.TransactionDate);
				}
			}
	}else {
		System.out.println("Transaction database empty!");
	}
		
		if(historyFound==false) {
			System.out.println("Account not found!");
		}
		
	}
	//---------------------------------
	//---------------------------------
	//---------------------------------
	@Override
	public void createTransactions(String nameOfPerson, String item, int price, String date) {
		if(chequingsDB.size() > 0) {
			for(Chequings x: chequingsDB) {
				if(x.clientName.equals(nameOfPerson)) {
					Transactions transactionsOBJ = new Transactions(nameOfPerson, item,  price, date);
					transactionsDB.add(transactionsOBJ);
					x.accountBalance-= price;
					System.out.println("Transaction completed sucessfully!");
					break;
				}
			}
		
		}else {
			System.out.println("Account not found!");
		}
		
	}
	//---------------------------------
	//---------------------------------
	//---------------------------------
	@Override
	public void checkBalance(String nameOfPerson) {
	    boolean accountExist1 = false;
	    double balanceToGet = 0.0;

	    // Handle the case when chequingsDB is empty
	    if (chequingsDB.isEmpty()) {
	        System.out.println("No accounts exist yet.");
	    } else {
	        // Use case-insensitive comparison
	        for (Chequings x : chequingsDB) {
	            if (x.clientName.equalsIgnoreCase(nameOfPerson)) {
	                balanceToGet = x.accountBalance;
	                accountExist1 = true;
	                break;
	            }
	        }
	    }

	    if (!accountExist1) {
	        System.out.println("Account not found!");
	    } else {
	        System.out.println("Your account balance is: " + balanceToGet);
	    }
	}
	//---------------------------------
	//---------------------------------
	//---------------------------------

	@Override
	public void createAccount(String nameOfPerson) {
		boolean accountExist2 = false;
		for(Chequings x: chequingsDB) {
			if(x.clientName.equals(nameOfPerson)) {
				System.out.println("Account under the name (" + nameOfPerson + ") exist alrready!");
				accountExist2 = true;
				break;
			}
			
		}
		if(accountExist2 == false) {
			System.out.println("Enter your age: ");
			int clientAge = userInput.nextInt();
			System.out.println("Enter your deposit: ");
			int clientDeposit = userInput.nextInt();
			Chequings chequingsOBJ = new Chequings(nameOfPerson, clientAge,clientDeposit, clientDeposit);
			chequingsDB.add(chequingsOBJ);
			System.out.println("Account created sucessfully!!");
		}
		
	}

}
