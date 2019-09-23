//the above approch passes all the test cases but not works fine 
import java.util.Stack;
import java.lang.Math;
public class Solution {
   public static int countBracketReversals(String input){
	
       int i=0,count1=0,count2=0,count3=0;
       Stack<Character> k=new Stack();
       if(input.length()%2!=0){
           return -1;
       }
       while(input.length()>i)
       {
           if(input.charAt(i)=='{'){
           k.push(input.charAt(i));
               count1++;
           }
           else if(input.charAt(i)=='}')
           {
                if(k.size()==0)
                {
                   count3=count3+2;  
                    k.push(input.charAt(i));
                 }
             if(k.peek() == '{'){
               k.pop();
               count2++;
               }
               else if(k.peek()!='{'){
                    k.push(input.charAt(i));
                    count3++;
               }
            }
            i++;
       }
            return (Math.abs((count1-count2)/2)+count3);
       //https://www.tutorialspoint.com/java/lang/math_abs_int.htm
    //maths.abs is used to get an absolute value 
	}
}
//below is the provided solution
// import java.util.Stack; 
// public class Solution { 
//     // Function returns -1 if brackets can't be balanced 
//     public static int countBracketReversals(String input){ 
//         if(input.length() == 0){ 
//             return 0; 
//         }
//         if(input.length() % 2 != 0){
//             return -1; 
//             // reversal isn't possible
//         } 
//         Stack<Character> stack = new Stack<>();
//         for(int i = 0; i < input.length(); i++){
//             char currentChar = input.charAt(i); 
//             if(currentChar == '{'){ 
//                 stack.push(currentChar); 
//             }
//             else{
//                 // pop if there is a balanced pair 
//                 if(!stack.isEmpty() && stack.peek() == '{'){ 
//                     stack.pop(); 
//                 }
//                 else{ stack.push(currentChar); 
//                     } 
//             } 
//         } 
//         int count = 0;
//         // only unbalanced brackets are there in stack now 
//         while(!stack.isEmpty()){ 
//             char char1 = stack.pop();
//             char char2 = stack.pop();
//             // i.e  char1 = } and char2 = { then we need to reverse both of them 
//             if(char1 != char2){ count += 2; }
//             // if both char1 and char2 are same i.e either the are {{ or }}, then we need only 1 reversal 
//             else{ count += 1;}
//         } return count;
//     } 
// }
