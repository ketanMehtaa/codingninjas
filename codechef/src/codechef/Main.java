package codechef;
import java.util.Scanner;
import java.lang.Math; 
        public class Main {
        public static void main(String[] args) {
	    @SuppressWarnings("resource")
		Scanner k = new Scanner(System.in);
	    int n=k.nextInt();
	    while(n>0){
	      int num=k.nextInt();
	      int count=0;
	      int x=1;
	      while(num>0){
	          if(((num/((int)Math.pow(2,x)))!=0)&&x<13){
	              x++;
	          }
	          else
	            {
	              num=num-(int)Math.pow(2,x-1);
	              x=1;
	              count++;
	          }
	        }
	        System.out.println(count);
	 
	 n--;}
	    
	}}