	import java.util.*;
import java.util.Scanner;

public class runner2 {
	
	public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
		System.out.print(secondLargestElement(arr));
	}

		
		public static int secondLargestElement(int[] arr) {
	           int i,j,k=0,max=0;        
	            if(arr.length<=1){
	            return -2147483648;
	          } 
	           
	              
	               for(i=0;i<arr.length;i++) {
	            	   if(max<arr[i]) {
	            		   max=arr[i];
	            	 }
	               }  System.out.println(max);
	               for(i=0;i<arr.length;i++) {
	            	   if(max==arr[i]) {
	            		  arr[i]=0;
	            	   }
	               } for(i=0;i<arr.length;i++) {
	            	   if(max<arr[i]) {
	            		   max=arr[i];
	            	   }
	               } System.out.println(max);
	            	  
	           		return max;
	                 
	    }}
