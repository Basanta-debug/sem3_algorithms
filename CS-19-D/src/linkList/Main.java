package linkList;


public class Main {
	
	public static void main(String[] args) {
	
			linklist list=  new linklist();
		
		list.insert(10);
		list.insert(20);
		list.insert(30);
		
		list.insertAtStart(8686);
		list.insert(758);
		list.insertAtPos(2,554);
		list.delete(3);
		
		
		list.display();
	}
}