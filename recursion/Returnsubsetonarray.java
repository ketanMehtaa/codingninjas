package recursion;
import java.util.Scanner;
public class Returnsubsetonarray {
 	public static int[][] subsets(int input[]){
		return subsets(input, 0);
	}
 	private static int[][] subsets(int input[] , int start) 
	{
		
		if(start >= input.length)
		{
			int ans[][] = new int[1][0];
			return ans;
		}
	     int i,j,k,p;
	     int arr[]=new int[input.length-1];
	     for(i=0;i<input.length-1;i++) {
	    	 arr[i]=input[i+1];
	     }
	     
	     int help[][]=subsets(arr);
	     int smallans[][]=new int[help.length*2][];
	     
	     for(i=0;i<help.length;i++) {
	    	 for(j=0;i<help[0].length;j++) {
	    	   smallans[i][j]=help[i][j];
	         }
	     }
	      
	     for(k=i; k<smallans.length; k++) {
	    		 smallans[k][0]=input[0];
	    	 }
        for(k=i; k<smallans.length; k++) {
        	for(p=0; p<help[0].length+1; p++) {
		        smallans[k][p+1]=help[k-i][p];
	        }
         }
   
		   return smallans;
	  }
		public static int[] takeInput() {
			@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
			int size = s.nextInt();
			int arr[] = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = s.nextInt();
			}
			return arr;
		}
		
		public static void main(String[] args) {
			int[] input = takeInput();
			int output[][] = subsets(input);
			for(int i = 0; i < output.length; i++) {
				for(int j = 0; j < output[i].length; j++) {
					System.out.print(output[i][j] + " ");
				}
				System.out.println();
			}
		}
}
