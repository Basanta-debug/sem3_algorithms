package assignment;
import java.util.Scanner;

public class binarytodec {
	public static void main(String [] args){
	     int j;
	     Scanner in = new Scanner(System.in);
	     System.out.println("Enter Binery Index Size: ");
	     j = in.nextInt();
	     int []ConValue = new int[j];
	     System.out.println("Enter a Binary value to convert:");
	     for(int i=0; i<ConValue.length; i++){
	       ConValue [i] = in.nextInt();
	       
	       System.out.println("the decimal is"+ConValue[i].);
	     }
	    
	}
}


