//
public class variable {
	public static void main(String [] args){
		//truncation
		double div = 5.0/2;
		System.out.println(div);
		
		//double casting
		
		int x=5;
		int y=2;
		
		double nextDiv = x/y;
		System.out.println(nextDiv);
		
		double castNext = (double)x/y;
		System.out.println("value after double casting:"+ castNext);
	
		//int casting
		
		double current=19;
		double rate=2.5;
		
		double futureWorth= current*rate;
		System.out.println("value before int  casting:"+ futureWorth);
		
		int futureWorthInt=(int)futureWorth;
		System.out.println("value after int casting:"+ futureWorthInt);
	}
}
