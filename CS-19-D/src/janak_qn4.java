import java.util.Scanner;
public class janak_qn4 {
	
	public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Please Enter the Registration number");
	
	int regn=sc.nextInt();
	
	System.out.print("Enter model number- ");  
	int model= sc.nextInt();  
	System.out.print("Enter the price of car- ");  
	int price= sc.nextInt();
	System.out.print("Enter the make of car- ");  
	int make= sc.nextInt();
	
	System.out.println("Registration number- "+regn);
	System.out.println("Model number- "+ model);
	System.out.println("Price is- "+ price);
	System.out.println("Make of car - "+make);
	
	

}
}