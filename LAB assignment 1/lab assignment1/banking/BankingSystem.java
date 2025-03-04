package banking;


 public class BankingSystem{
	static final String storedAccountNumber="1111";
	static final String storedPin="1234";

	public static class LoginProcessor{
		public static boolean authentication(String accountNumber, String pin){

				//checking
			if (storedAccountNumber.equals(accountNumber) && storedPin.equals(pin)){
				System.out.println("Access granted");
				return true;
			}
			else{
				System.out.println("Invalid account number or pin!");
				return false;
			}
		}
	}
}