package strings;
import java.util.*;
public class solution1 {

		private static Scanner s;


		public static void main(String[] args) {
			s = new Scanner(System.in);
			String input1 = s.next();
			String input2 = s.next();
		isPermutation(input1, input2);
		}
	

	public static void isPermutation(String input1, String input2) {
           
		StringBuffer k = new StringBuffer(input1.length()); 
             k.append(input1);
             System.out.println(k);
          for(int i=0;i<input1.length();i++){
        	  for(int j=0;j<input1.length();j++){
        	    if(input1.charAt(i)==k.charAt(j)){
                k.deleteCharAt(j); }
        
        	  }
	  System.out.println(k);
          }

}}
//this method is good i think
//	public class solution {
//
//		public static boolean isPermutation(String input1, String input2) {
//		     if(input1.length()!=input2.length()){
//		         return false;
//		         }
//	         return input1.equals(input2);
//		}
//	}
