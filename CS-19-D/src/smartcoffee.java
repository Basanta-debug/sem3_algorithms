import java.util.Scanner;

public class smartcoffee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please ENter the Passcode");
		
		int passcode=sc.nextInt();
		String coffeeType;
		
		if(passcode==555) {
			coffeeType="Milk Coffee";
		}else if(passcode==312) {
			coffeeType="Black Coffee";
		}else if(passcode==629) {
			coffeeType="Vanila Latte";
			
		}else {
			coffeeType="Unknown";
		}
		
		System.out.println("Your Drink is :" + coffeeType);

	
		
			
			
	}
}
