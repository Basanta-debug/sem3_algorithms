package Queue;


public class Queue {
		int queue[]=new int[6];
		int front;
		int rear;
		int size;
		
		//enqueue
		
		public void enqueue(int value) {
			if(!isFull()) {
				queue[rear]=value;
				rear=rear+1;
				size=size+1;
				
			}else {
				System.out.println("Queue is full");
			}
			
			
		}
		
		///dequeue
		public void dequeue() {
			if(!isEmpty()) {
				
			
			//System.out.println(queue[front]+"is deleted");
			front=front+1;
			size=size-1;}
			else {
				System.out.println("Queue is empty");
			}
				
			}
			
		
		
		
		
		public boolean isEmpty() {
			return size==0;
			
		}
		
		public boolean isFull() {
			return size==queue.length;
			
		}
		
		
		public void display() {
			System.out.println("Size:"+size);
			System.out.println("Front:"+front);
			System.out.println("Rear:"+rear);
			System.out.print("Element in my queue:");
			
			
			for(int i=0; i<size; i++) {
				
				System.out.print(queue[front+i]+" ");
			}
			
		}
}
