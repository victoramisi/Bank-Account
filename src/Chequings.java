
import java.util.Scanner;
@SuppressWarnings("unused")
/*
 * This class will contain methods
 * and properties for the Cheq account*/
public class Chequings {
	

	//Create a monthly fee that is unchangeable
	final double monthlyFee = 3.95;
	
	//Create the first attributes for the client
	String clientName;
	int clientAge;
	int initialDeposit;
	double accountBalance;
	
	//Method to get the monthly fee
	public double getFee() {
		return monthlyFee;
	}
	
	//construtor to instantiate the object
	public Chequings(String name, int age, int deposit, int balance) {
		clientName = name;
		clientAge = age;
		initialDeposit = deposit;
		balance = initialDeposit;
		accountBalance = balance;
	}




}
