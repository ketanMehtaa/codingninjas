//triple sum;
import java.util.Scanner;

public class runner1 {
	static Scanner s = new Scanner(System.in);
	public static int[] takeInput() {
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] input = takeInput();
		int x = s.nextInt();
		runner1.tripletSum(input, x);
	}
	  public static void tripletSum(int[] input, int x){
      		   int i,j,k,sum=0,max,max1,min,min1;
  	        for(i=0;i<input.length;i++) 
  	        {        
  	         	for(j=i+1;j<input.length;j++)
  	         	 {
  	         		for(k=j+1;j<input.length;j++) {
  	         	              if(x==input[i]+input[j]+input[k]) {
  	         	            	 max=input[i]<input[j]?input[j]:input[i];
  	         	            	 max1=max<input[k]?input[k]:max;
  	         	            	 min=input[i]>input[j]?input[j]:input[i];
  	         	            	 min1=min>input[k]?input[j]:input[i];
                          System.out.println();
               	    }
  	         	 
  	         	}
	
	  }
  }
}}