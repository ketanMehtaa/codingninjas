import java.lang.*;
    public class Solution {
	public static int help(int num,int count){
        if(num==1){
            return count;
        }
        int opt1=Integer.MAX_VALUE;
        int opt2=Integer.MAX_VALUE;
        int opt3=Integer.MAX_VALUE;

        if(num%3==0){
           opt1=help(num/3,count+1); 
        }
       
        if(num%2==0){
            opt2= help(num/2,count+1);
        }
            opt3=help(--num,count+1);
        // option 3 is always run because if we do not use opt3 then 
        // our program will fail for the value of 11
        
        int a=Math.min(opt3,opt2);
        return Math.min(a,opt1);
        }
	public static int countStepsTo1(int n){
        
        int count=0;
        return help(n,count);
	}
}
