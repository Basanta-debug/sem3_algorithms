import java.util.Scanner;

public class result {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please ENter the marks");
		int marks=sc.nextInt();
		
		String result;
		
		if(marks<40) {
			result=" you are fail";
			
		}else if(marks> 40 && marks<70) {
			result="you have secured first divison";
		}else if(marks>70 && marks<100) {
			result="you have got distinction";
			
		}else {
			result="invalid";
		}
		System.out.println("hey "+ result);
	}

		
}
