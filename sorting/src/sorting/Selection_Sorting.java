package sorting;

import java.util.Scanner;
public class Selection_Sorting{
   // it work on the brute force approach 
	  @SuppressWarnings("resource")
	public static void main (String args[]) {
		  System.out.println("enter the numbers ");
		Scanner sw=new Scanner(System.in);
		int n=sw.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sw.nextInt();
		}
	        int i,j;
	        int min;
	        for(i=0;i<n-1;i++) {
	        	min=i;
	        	for(j=i+1;j<n;j++) {
	        	if(arr[j]<arr[min])   	
	        	{  min=j;       
	        	
	        	}
	        	
	        	 int temp = arr[min]; 
	             arr[min] = arr[i]; 
	             arr[i] = temp;  
	       }}
	        for(i=0;i<n;i++) {
	        System.out.println(arr[i]);
	        }
	     
	  
	  }
	  
	  
}
