package array_in_java;
import java.util.Arrays;
import java.util.Scanner;

public class use_Array {
	public static void main(String[] args) {
		//take input from user asking size//
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		
		//create the array defining the memory location//
		int random[]=new int[n];
		
		//insert data into array//
		
		for(int i=0; i<random.length; i++) {
			System.out.println("insert the random data on position:"+i);
			random[i]=sc.nextInt();
			
		}
		
		//display the array//
		System.out.println("your data"+Arrays.toString(random));
	}
}
