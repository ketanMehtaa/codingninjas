package codechef;
import java.util.*;
import java.lang.*;
import java.io.*;

class jj{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner s = new Scanner(System.in);
		    int t = s.nextInt();
			while(t>0){  
				int total=s.nextInt();	
				String str=s.nextLine(); 
	            int count=0;
	            int ptotal=0;
	            int atotal=0;
	            int i=0;
	            
				for(i=0;i<total-4;i++) {
					if(str.charAt(i)=='P'&&str.charAt(i+1)=='P') {
						if(str.charAt(i+2)=='A') {
							if(str.charAt(i+3)=='P'&&str.charAt(i+4)=='P') {
							     count++;
							     i=i+3;
							}
						}
					}
				}
				char k;
				for(i=0;i<total;i++) {
					k=str.charAt(i);
					if(k=='P'){
						ptotal++;
					}else atotal++;
				}
				int out=0;
				int percent=(ptotal/total)*100;
				if(percent>=75) {
					System.out.println(0);
				}else {
					while(percent<75) {
						if(count>0) {
							percent=((ptotal+1)/total)*100;
						    count--;
						    out++;
						}
					}
				       System.out.println(out);
				}
				
		        --t;	
		       }
		     
	}
}

