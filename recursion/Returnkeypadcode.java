package recursion;
import java.util.Scanner;

public class Returnkeypadcode {
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


	public static String[] keypad(int n){
    	if(n==0){
           String ans[] = {""};
		      return ans;
    	   }
          int k=n%10;
		  String smallAns[] = keypad(n/10);
    	  String[] help=help(k);
    	  String ans[] = new String[help.length*smallAns.length];
    	  int i,j;
    	  int p=0;
    	 
    	      for(j=0;j<smallAns.length;j++) {
                   for(i=0;i<help.length;i++) {
    			 ans[p++]=smallAns [j]+help[i];
    		 }
    	  }
    	  return ans;
    }
    
    public static void main(String[] args) {
     @SuppressWarnings("resource")
	Scanner s = new Scanner(System.in);
	  int input = s.nextInt();
	  String output[] = keypad(input);
	for(int i = 0; i < output.length; i++) {
		System.out.println(output[i]);
		}
	}
	
}
