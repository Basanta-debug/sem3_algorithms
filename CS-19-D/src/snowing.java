
public class snowing {
	public static void main(String[] args) {
		boolean isSnowing=true;
		boolean isRaining=false;
		double temperature=15;
		
		
		if(isSnowing || isRaining || temperature < 50) {
			System.out.println("Lets stay home");	
		}
		
		else {
			System.out.println("Lets go out");
		}
		
	}
	

}
