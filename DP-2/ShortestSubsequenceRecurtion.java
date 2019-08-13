import java.util.*;
public class solution{
    public int help(String s,String v){
        if (s.length() == 0) 
        return 1000000000; 

        if (v.length() <= 0) 
         return 1; 
  
        int k; 
        
        for (k=0; k < v.length(); k++) 
          if (v.charAt(k)==s.charAt(0)) 
            break; 

         if(k==v.length()) 
           return 1; 
        
        int opt1=help(s.substring(1),v);  
        int opt2=1+help(s.substring(1),v.substring(k+1));
        return Math.min(opt1,opt2);
} 
        
    
    public int solve(String S,String V){
         return help(S,V);
    }
}
