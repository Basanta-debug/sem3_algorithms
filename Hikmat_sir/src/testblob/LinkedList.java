
package testblob;

public class LinkedList {
	public static  class Node{
		int data;
		Node next; ////variable having class type stores its address
	
		
		Node (int data){
			
			
			this.data=data;
			this.next=null;
		}
	
	
	}
	Node head=null;
	Node tail= null;
	
	public void addNode( int data) {
		Node newnode= new Node(data);
			if(head==null) {
				head= newnode;
				tail=head;
				
			}
			else {tail.next=newnode;
			tail=newnode;
			
			
			
			}	
	}
	
	public void printList() {
		Node current= head;
		while(current!=null) {
			System.out.println(current.data);
			current = current.next;
		}
	}
	
	
	public int size() {
		int count=0;
		Node current=head;
		while(current!=null) {
			count++;
			current=current.next;
			
			
		}
		return count;
	}
	public int get(int i) {
		Node current = head;
		for(int j=0; j<i; j++) {
			
		current=current.next;
		}
		return current.data;
	}
	
}
