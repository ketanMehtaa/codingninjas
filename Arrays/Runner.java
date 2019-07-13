import java.util.Scanner;

public class Runner {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		System.out.println(removeConsecutiveDuplicates(input));
	}


		public static String removeConsecutiveDuplicates(String input) {
             char a=input.charAt(0);
             String ans =""+input.charAt(0);
			for(int i=0;i<input.length()-1;i++){
		             if(input.charAt(i)!=a) {
		            	 ans=ans+input.charAt(i);
		            	 a=input.charAt(i);
		             }
			}
			return ans;}
		}
//progrm to remove consecutives 