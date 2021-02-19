package array_in_java;

public class weekTemp {
	public static void main(String[] args) {
		double temp[]= {45.5,66,78.5,32.8,56};
		int avg = (int) calAvg(temp);
		System.out.println("Average week temperature is "  +avg);
	}
	
	
	
	public static double calAvg(double temp[]) {
		
		int size =temp.length;
		double total=0;
		for (int i=0; i<size; i++) {
		
			total+=temp[i];
		}
	
		return total/size;
	}
}

