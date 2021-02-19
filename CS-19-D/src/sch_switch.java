import java.util.Scanner;
public class sch_switch {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Please ENter the daycode from 1 to 7");
		
		
		int dayCode= sc.nextInt();
		switch (dayCode)
		{
		case 1:
		      System.out.println( " Gym in the morning ! " );
		      break ;
		    case 2:
		      System.out.println( " Class after work ! " );
		      break ;
		    case 3:
		      System.out.println( " Meetings all day ! " );
		      break ;
		    case 4:
		      System.out.println( " Can Work from home better " );
		      break ;
		    case 5:
		      System.out.println( " Game night after work" );
		     
		      break ;
		    default :
		      System.out.println( " free " );
		}

	}
}
