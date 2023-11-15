import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList; 
import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
@SuppressWarnings("unused")
public class Bank {
	
	public static void main(String[] args) {
	System.out.println("1: Create account");
	System.out.println("2: View your balance");
	System.out.println("3: View your transactions");
	System.out.println("4: Make a transactions");
	System.out.println("5: Exit");
	
	@SuppressWarnings("resource")
	Scanner userChoice = new Scanner(System.in);
	String userSelection;
	String userName;
	UserActions userActionsOBJ = new UserActions();
	while(true) {
		System.out.println("Pick an option: ");
		userSelection = userChoice.nextLine();
		//---------------------------------
		//---------------------------------
		//---------------------------------
		try {
			switch(userSelection) {
			case "1":
				System.out.println("Enter your account name: ");
				userName = userChoice.nextLine();
				userActionsOBJ.createAccount(userName);
			break;
				
			case "2":
				
				System.out.println("Enter your account name: ");
				userName = userChoice.nextLine();
				userActionsOBJ.checkBalance(userName);
				break;
				
			case "3": 
				System.out.println("Enter your account name: ");
				userName = userChoice.nextLine();
				userActionsOBJ.viewTransactions(userName);
				break;
				
			case "4":
				System.out.println("Enter your account name" +"\n make sure to match you account name:" );
		
				userName = userChoice.nextLine();
				System.out.println("Enter Item to buy: ");
				String itemToBuy = userChoice.nextLine();
				System.out.println("Enter price of item: ");
				int  itemPrice = userChoice.nextInt();
				userChoice.nextLine();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
				LocalDate currentDate = LocalDate.now();
				String dateString = currentDate.atStartOfDay().format(formatter);
				userActionsOBJ.createTransactions(userName, itemToBuy, itemPrice, dateString);
			break;
			
			case "5": 
				System.out.println("Bye! ");
				System.exit(0);
			default:
				System.out.println("Invalid! ");
					
			}
		}catch(Exception e) {
			System.out.println("Please try again: "+ e);
			System.out.println("Enter integers only for numbers!");
		 
		}
		
		//---------------------------------
		//---------------------------------
		//---------------------------------
	}
	}

}
 