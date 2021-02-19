
public class Control {
	public static void main(String[] args){
		
		//if statement
		
		boolean isGreen = false;
		if(isGreen) {
			System.out.println("you can drive");
		}
		
		//variable scope
		
		if(isGreen){
			double bikespeed= 50.5; //in km
			System.out.println("you can drive");
			System.out.println("you bike sepped is:"+bikespeed);
		}
	
	
	//if-else statement
	
	if(isGreen) {
		System.out.println("you can drive");
		
		
	}else {

		System.out.println("Please Stop");

		}
	}
	

}
