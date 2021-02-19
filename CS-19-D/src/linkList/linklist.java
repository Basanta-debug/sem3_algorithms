package linkList;

public class linklist {
		Node head;
		
		public void insert(int value) {
			
			Node newNode=new Node();
			newNode.data=value;
			newNode.next=null;
			
			
			if(head==null) {
				head=newNode;
			}
			else {
				Node n= head;
				while(n.next!=null) {
					n=n.next;
				}
				n.next=newNode;
			}
			
		
				
			}
		
		

public void insertAtPos(int ind, int value) {
			Node newNode=new Node();
			newNode.data=value;
			newNode.next=null;
			
			
			if(ind==0) {
				insertAtStart(value);
			}else {
				Node n=head;
				 
				for(int i=0;i<ind-1;i++) {
					n=n.next;
				}
				
				newNode.next=n.next;
				n.next=newNode;
			}
			
			
		}
	

public void delete(int ind) {
	if(ind==0) {
		head=head.next;
		
	}else {
		Node n=head;
		Node delete;
		for(int i=0; i<ind-1;i++) {
			n=n.next;
			
			
		}
		delete=n.next;
		n.next=delete.next;
		delete.next=null;
	}
}
		
public void insertAtStart(int value) {
	Node newNode=new Node();
	newNode.data=value;
	newNode.next=null;
	
	
	newNode.next=head;
	head=newNode;
}
		
		
			
		public void display() {
			Node n =head;
			while(n.next!=null) {
				System.out.println(n.data);
				n=n.next;
		
			
	}
			System.out.println(n.data);
		}
			
		}

