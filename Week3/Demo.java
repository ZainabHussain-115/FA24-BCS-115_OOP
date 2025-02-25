import java.util.Scanner;
class Demo{

public static void main (String[] args){
	String nameinput;
	String passwordinput;

	Scanner scan=new Scanner(System.in);

	System.out.print("Enter your name: ");
	nameinput=scan.next();
	
	System.out.print("Enter your password: ");
	passwordinput=scan.next();

	Userinfo user1=new Userinfo();

//checking

	if(nameinput.equals(user1.getName())){
		if(passwordinput.equals(user1.getPassword())){
			System.out.println("Correct");
			}
		else{
			System.out.println("Incorrect");
			}
	}
	else{
	System.out.println("Incorrect");
	}
		


	
}
}