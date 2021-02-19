
public class luckynumber {
	public static void main(String[] args) {
		
		//random number from 0 to almost(1)
		double randomNumber= Math.random();
		System.out.println("Initial Random Number:"+randomNumber);
		//changing range from 0- almost(10)
		randomNumber=randomNumber*10;
		System.out.println("Random number after conversion"+randomNumber);
	
		//casting to integer
		int randomInt=(int)randomNumber;
		System.out.println("Random number after casting"+randomInt);
		
		randomInt=randomInt+1;
		System.out.println("Final random number"+randomInt);
		
	}
	
	
	
	
}
