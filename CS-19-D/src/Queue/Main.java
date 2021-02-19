package Queue;

public class Main {
	public static void main(String[] args) {
		
		Queue num=new Queue();
		
		num.enqueue(10);
		num.enqueue(20);
		num.enqueue(30);
		num.enqueue(10);
		num.enqueue(20);
		num.enqueue(30);
		num.enqueue(30);
		//num.dequeue();
		num.display();
	}
}
