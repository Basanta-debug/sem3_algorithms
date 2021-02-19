import java.util.Scanner;
public class schedule {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please ENter the daycode");
		
		
		int dayCode= sc.nextInt();
		String work;
		
		if(dayCode==1) {
			work="Gym in the morning";
			
		}else if(dayCode==2) {
			work="Class after work";
			
		}else if(dayCode==3) {
			work="Meetings all day";}
		
		else if(dayCode==4) {
			work="Work from home";
		}else if(dayCode==5) {
			work="Game night after work";}
	
		else {
			work="free";
		}
	  
		System.out.println("You have  :" + work);
		}
	}
