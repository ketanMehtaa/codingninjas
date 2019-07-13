package codechef;
import java.util.*;
public class chnum {
	public static void main (String[] args) throws java.lang.Exception
	{          
		     @SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
				 int t = s.nextInt();
			while(t>0){  
				int size = s.nextInt();
				int arr[] = new int[size];
				for (int i = 0; i < size; i++) {
					arr[i] = s.nextInt();
				    
				}
				
				int i,j=0,m=0,q=0;
				for(i=0;i<size;i++){
				    if(arr[i]>0){
				        j++;
				    }
				    else if(arr[i]<0){
		     		    m++;
			    	 }
				     else{
				     q++;
     				 }
			    }
				if(j>m){
				    q=j+q;
				    System.out.print(q+" "+j);
				}else{
				    q=m+q;
				    System.out.print(q+" "+m);
				     }
		        --t;	
			}
		     
	}
}
