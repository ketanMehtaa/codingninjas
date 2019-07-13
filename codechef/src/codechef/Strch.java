package codechef;
import java.util.Scanner;
public class Strch {
	public static void main (String[] args) throws java.lang.Exception{           
	     
		Scanner s = new Scanner(System.in);
	     int t = s.nextInt();
         while(t>0){ 	
         int a=s.nextInt();
	         String str = s.next();
	         char check = s.next().charAt(0);
	         int j,i=0;
	         int max=0;
	         for(i=0;i<str.length();i++){
	            for(j=i;j<str.length();j++){
	             	if (str.substring(i,j+1).indexOf(check) != -1 ) {
	                   max=max+1;
	        	       
	             	}
	             	}
        }System.out.println(max);
        --t;  
        }
  }}
