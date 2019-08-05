import java.util.*;
public class Solution {
    public static int help(String s1, String s2){		
    if(s1.length() == 0){
			return s2.length();
		}
		if(s2.length() == 0){
			return s1.length();
		}
	// abs and empty then other length 
        if(s1.charAt(0)==s2.charAt(0)){
            return help(s1.substring(1),s2.substring(1));
        }
        //insertion
        int opt1=help(s1,s1.charAt(0)+s2);
        //delition
        int opt2=help(s1,s2.substring(1));
        //substitution
        int opt3=help(s1,s1.charAt(0)+s2.substring(1));
        
        int answer=1+Math.min(opt1,Math.min(opt3,opt2));
        return answer;
        
    }
//    both the method are same just the above method is same
//    public static int editDistances(String s, String t){
// 		if(s.length() == 0){
// 			return t.length();
// 		}
// 		if(t.length() == 0){
// 			return s.length();
// 		}
		
// 		if(s.charAt(0) == t.charAt(0)){
// 			return editDistance(s.substring(1), t.substring(1));
// 		}else{
// 			// insert
// 			int op1 = editDistance(s, t.substring(1));
// 			// delete 
// 			int op2 = editDistance(s.substring(1), t);
// 			//substitute
// 			int op3 = editDistance(s.substring(1), t.substring(1));
// 			return 1 + Math.min(op1, Math.min(op2, op3));
// 		}
// 	}
    public static int editDistance(String s1, String s2){		
        return help(s1,s2);
        // return editDistances(s1,s2);
    }
}
