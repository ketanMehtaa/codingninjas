import java.util.Stack;

public class Solution {
    public static Stack<Integer> reverse(Stack<Integer> s1,Stack<Integer> s2) {
        Stack<Integer> ketan= new Stack();   
        if(s1.isEmpty()){
               return ketan;
           }
        int k=s1.pop();
        reverse(s1,s2);
        int j;   
        while(!s1.isEmpty()){
              j=s1.pop();
               s2.push(j);
           }
               s2.push(k);
         while(!s2.isEmpty()){
              j=s2.pop();
               s1.push(j);
           }
        return s1;
	}
        
	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
           reverse(s1,s2);
        }
}
