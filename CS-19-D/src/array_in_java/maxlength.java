package array_in_java;

public class maxlength {
	public static void main(String[] args) {
	
		String names[]= {"Manchester united","manchester city","liverpool","westham united"};
		String result=longestname(names);
		System.out.println("the longest name is"+ result);
		
	
	
	
	
	}
	
	public static String longestname(String names[]) {
		int size=names.length;
		String max=names[0];
		for (int i=1;i<size;i++) {
			if (names[0].length()>max.length()) {
				max=names[i];
			}
		}
	
		return max;
	}
	
	
	
}
