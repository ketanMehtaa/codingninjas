package sorting;
import java.util.*;
public class Bubble_Sorting {
    
	  @SuppressWarnings("resource")
	public static void main (String args[]) {
		  System.out.println("enter the numbers ");
		Scanner sw=new Scanner(System.in);
		int n=sw.nextInt();
		int arr[]=new int[n];
		for(int i=1;i<n;i++) {
			arr[i]=sw.nextInt();
		}
	        int i,j,k;
	        
	        for(i=1;i<n-1;i++) {
	        	for(j=1;j<n-i;j++) {
	        		
	        		if(arr[j]>arr[j+1]) {
	        		  	k=arr[j+1];
	        		    arr[j+1]=arr[j];
	        		    arr[j]=k;
	        		}
	        	}
	        }
	        for(i=1;i<n;i++) {
	        System.out.println(arr[i]);
	        }
	     
	  
	  }
	  
	  
}
