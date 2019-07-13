package strings;
import java.util.Scanner;
public class spiral {
		static Scanner s = new Scanner(System.in);
		public static int[][] takeInput2D(){
			int numRows = s.nextInt();
			int numCols = s.nextInt();
			int[][] input = new int[numRows][numCols];
			for(int i = 0; i < numRows; i++){
				for(int j = 0; j < numCols; j++){
					input[i][j] = s.nextInt();
				}
			}
			return input;
		}
		
		public static void main(String[] args) {
			int a[][] = takeInput2D();
		spiralPrint(a);
		}
	
	public static void spiralPrint(int matrix[][]){
	            
		int cs=0,ce=matrix[0].length,rs=0,re=matrix.length;
		int i,j;
	   	while(cs<ce&&rs<re){
		    for(j=cs; j < ce; j++) {
		   System.out.print(matrix[rs][j]+" ");
			 } rs++;
	       
		    for ( i=rs; i < re; i++) {
		  System.out.print(matrix[i][ce-1]+" ");
		
			 }  ce--;
	     
	        for (j=ce; j < cs; j--){
		    System.out.print(matrix[re-1][j]+" ");
	     
			 }re--;
			  
	        for ( i=re; i < rs; i--) {
		  System.out.print(matrix[i][cs]+" ");
		 
		 }cs++; 
			  
		  }
		  }
	   	} 	
	