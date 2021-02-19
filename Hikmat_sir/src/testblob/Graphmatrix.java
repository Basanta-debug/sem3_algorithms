package testblob;

public class Graphmatrix {
	
	int size=4;
	int matrix[][]= new int [size][size];
	
	
	public void addEdge(int source, int destination) {
		matrix[source][destination]=1;
		matrix[destination][source]=1;
		
		
		
		
	}
	public void printMatrix() {
		System.out.println("Printing matrix");
		for(int i =0;i<size;i++) {
			
			for(int j =0;j<size;j++) {
				
					
				System.out.print(matrix[i][j]+" ");
			}
			
			System.out.println();
		}
			
			
		
			
	}
	public void printGraph() {
		for(int i=0; i<size; i++) {
			System.out.print(i+"is connected to");
			
			for( int j=0; j<size;j++) {
				
				if( matrix[i][j]>0){
					System.out.print(j+"");
					
				}
				
			}
			System.out.println();
		}
	}
	public static void main (String[] args) {
		Graphmatrix g=new Graphmatrix();
		g.addEdge(0,1);
		g.addEdge(0, 3);
		g.addEdge(1, 2);
		g.addEdge(2, 3);
		g.printMatrix();
		g.printGraph();
		
		
	}
}
