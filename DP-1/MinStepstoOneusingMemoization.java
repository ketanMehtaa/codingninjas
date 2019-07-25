// memoization is used here ___________________
// it is basically top down approch 
// means if i calculated one result than it will store and 
//if it will reqired again then the saved value is taken
// // we do not calculate it again 
// Pros in Memoization:
// Doesn’t attempt to solve all sub problems.
// Pros in Tabulation:
// Can be done iteratively so less stack space.
// Memory can be efficiently used , Unnecessary states can be discarded.
import java.lang.*;
public class Solution {
    public static int min(int n){
		int storage[] = new int[n+3];
		for(int i = 0; i <= n; i++){
			storage[i] = -1;
		}
        storage[1]=0;
        storage[2]=1;
		return min(n, storage);
	}
    public static int min(int n, int storage[]){
		if(n == 1 ){
			return 0;
		}
		if(storage[n] != -1){
			return storage[n];
		}
        int opt1=Integer.MAX_VALUE;
        int opt2=Integer.MAX_VALUE;
        int opt3=Integer.MAX_VALUE;
        int opt4=Integer.MAX_VALUE;

        if(n%3==0){
         opt1=1+min(n/3,storage);
            storage[n]=opt1;  
            return storage[n];
        }
        else{
            int a=n-1;
            int b=n-2;
            opt2 = 1+min(a,storage);
            
            if(b%3==0){
                opt3=2+min(b,storage);
            }
            if(n%2==0){
                opt4=1+min(n/2,storage);            
            }
            int ans=Math.min(Math.min(opt2, opt3), opt4);    
            storage[n]=ans;
            }
            return storage[n];
    }
	    
	
    public static int countStepsTo1(int n){
		return min(n);
	}
	
}
