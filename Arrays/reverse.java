	import java.util.Scanner;
public class reverse {

			public  void main(String[] args) {
				@SuppressWarnings("resource")
				Scanner s = new Scanner(System.in);
				String input = s.nextLine();
				System.out.println(reverseEachWord(input));
			}
		
			public static String reverseEachWord(String input) {
				String a="";
		        int i =0;
		        int start=0;
		        int end=0;
		        int j=0;
		        for(i=0;i<input.length();i++){
		               if(input.charAt(i) == ' '){
		                    end=i;
		                  for(j=0;j<i;j++){
		                a=a +input.substring(end,start);  
		                  }
		                   
		            start=end+1;}
		          
		        }
			   return a;}
		}
