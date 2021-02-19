package testblob;

public class adjgraph {
	
		public static void main(String [] args) {
			
	
	
	LinkedList List =new LinkedList();
	List.addNode(10);
	List.addNode(20);
	List.addNode(30);
	List.addNode(40);
	
	List.printList();
	List.size();
	
	System.out.println("Third position data is "+ List.get(2));
	System.out.println("The total size is "+List.size());
	

}
}
