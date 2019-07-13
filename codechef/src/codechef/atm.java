package codechef;
import java.util.*;
import java.lang.*;
import java.io.*;

public class atm{
		public static void main (String[] args) throws java.lang.Exception
		{     Scanner s=new Scanner(System.in);
		      int amount = s.nextInt();
		      float tamount = s.nextFloat();
		      if(amount-0.50<tamount&&amount%5==0){
		          System.out.println(tamount-amount-0.50);
		      }
		          else{
		                  System.out.println(tamount);
		          }
		    
		}
	}
