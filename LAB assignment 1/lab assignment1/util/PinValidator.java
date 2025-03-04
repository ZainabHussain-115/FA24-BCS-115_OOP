package util;
import banking.BankingSystem;
public class PinValidator{
	public class Rules{
	BankingSystem bankingSystem=new BankingSystem();
		public boolean isValid(String pin){
			if (pin.length() == 4 && pin.matches("\\d+"))
				return true;

			else{
				System.out.println("Invalid pin format! (0000)");
				return false;
			}
				
		}
	}


}