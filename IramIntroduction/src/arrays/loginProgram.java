package arrays;
import java.util.Scanner;

public class loginProgram {
	static Scanner input = new Scanner(System.in);
	
	public static String waitForEntry(){
		return input.nextLine();
	}
	// 1 point for private or inaccessible
	// 1 point for declaration of data types (String)
	private static String username = "test_user";
	private static String password = "test";
	
	//1 point correct method header
	public static void main(String[] args) {
		//1 point user has one chance to enter name
		if(correctUser()){
			askPassword();
		}
		else{
			System.out.println("Contact Support");
		}

	}
	public static void askPassword(){
		boolean inLoop = true;
		int remainingTries = 3;
		//1 point using a loop
		while(inLoop){
			System.out.println("Enter your password");
			String entry = waitForEntry();
			if(entry.equals(password)){
				System.out.println("You are in");
				inLoop = false;
			}
			else{
				remainingTries--;
				if(remainingTries == 0){
					System.out.println("invalid password");
					inLoop = false;
				}
				else{
					System.out.println("You have"+ remainingTries+ "left");
				}
			}
			
		}
	}
	public static boolean correctUser(){
		System.out.println("Enter username");
		//1 point using .equals
		if(waitForEntry().equals(username)){
			return true;
		}
		return false;
	}

}
