import java.time.LocalDate;
import java.text.SimpleDateFormat;
@SuppressWarnings("unused")
public class Transactions {

	String itemToBuy;
	double itemPrice;
	String transactionName;
	LocalDate currentDate = LocalDate.now();
	String TransactionDate;
	
	
	public Transactions(String accountName, String item, double price, String date) {
		itemToBuy = item;
		itemPrice = price;
	    TransactionDate = date;
	    transactionName = accountName;
	}


	
	

}
