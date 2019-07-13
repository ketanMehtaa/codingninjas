package recursion;
import java.util.Scanner;

public class Printkeypadcode {
	 public static String [] help(int num){
		  if(num<=1||num>=10){
              System.exit(0);
         }
            if(num==2){
             String[] ans = {"a","b","c"};
             return ans;
         }else if(num==3){
             String[] ans = {"d","e","f"}; 
             return ans;
         }else if(num==4){
             String[] ans = {"g","h","i"}; 
             return ans;
         }else if(num==5){
             String[] ans = {"j","k","l"}; 
             return ans;
         }else if(num==6){
             String[] ans = {"m","n","o"}; 
             return ans;
         }else if(num==7){
             String[] ans = {"p","q","r","s"}; 
             return ans;
         }else if(num==8){
             String[] ans = {"t","u","v"}; 
             return ans;
         }else {
             String[] ans = {"w","x","y","z"}; 
             return ans;
         }
     }
     
    public static void keypad(int n, String[] outputSoFar){
		    if(n==0){
		        	for(int i = 0; i < outputSoFar.length; i++) {
				       System.out.println(outputSoFar[i]);
				}
		       return; 	
			}
		  
		  int k=n%10;
  	      String[] help=help(k);
  	      String ans[] = new String[help.length*outputSoFar.length];
  	      int i,j;
  	      int p=0;
  	 
  	      for(j=0;j<outputSoFar.length;j++) {
                 for(i=0;i<help.length;i++) {
  			 ans[p++]=help[i]+outputSoFar[j];
           }}
             keypad(n/10,ans);
	}
	
             
    public static void printKeypad(int n){
                 int k=n%10;
               keypad(n/10,help(k));               
           }


    	
    	public static void main(String[] args) {
    		@SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
    		int input = s.nextInt();
    		printKeypad(input);
    	}
    }

	

