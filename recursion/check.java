//a then bb ten a a
package recursion;
import java.util.Scanner;
public class check {
public static boolean check(String input) {
          if(input.length()==0){
               return true;
               }    
          if(input.charAt(0)=='a'){
        	  return check(input.substring(1));
             }  
          if(input.charAt(0)=='b' &&input.charAt(1)=='b'){
	        	 return  check(input.substring(2));
	           }    
	       return false;
	        
}
	    
		public static boolean checkAB(String input) {
			if(input.charAt(0)!='a'){
	            return false;
	        }
		      return check(input);
	    }
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(checkAB(input));
	}

}