package testblob;

public class AdjGraphList {
	
	int vertex=4;
	LinkedList list[]=new LinkedList[vertex];
	
	
	AdjGraphList() {
		for(int i=0; i<vertex; i++) {
			list[i]=new LinkedList();
		}
	}
	public void addEdge(int source,int destination) {
		list[source].addNode(destination);
		list[destination].addNode(source);
		
	}
 
	
	public void printGraph() {
		System.out.println("printing graph");
		for( int i=0; i<vertex; i++) {
			System.out.print(i+" is connected to ");
			if(list[i].size()>0) {
				
				for(int j=0; j<list[i].size();j++) {
					System.out.print(list[i].get(j)+" ");
				}
				
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		
		AdjGraphList a=new AdjGraphList();
		a.addEdge(0, 1);
		a.addEdge(0, 2);
		a.addEdge(2, 3);
		a.printGraph();
		
		
	}
}
