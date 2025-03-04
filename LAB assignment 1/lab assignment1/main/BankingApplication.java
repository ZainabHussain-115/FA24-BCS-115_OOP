package main;
import banking.BankingSystem;
import util.PinValidator;
import java.io.Console;
public class BankingApplication{
	public static void main (String [] args){
		Console console = System.console();
		System.out.print("Enter your account number: ");
		String checkaccount=new String(console.readLine());
		System.out.print("Enter your account pin: ");
		String checkpin=new String (console.readLine());

		PinValidator pinValidator=new PinValidator();
		PinValidator.Rules rule= pinValidator. new Rules();
		rule.isValid(checkpin);
		
		BankingSystem bankingSystem=new BankingSystem();
		BankingSystem.LoginProcessor t1= new BankingSystem.LoginProcessor();
		t1.authentication(checkaccount,checkpin);

		
	}
}