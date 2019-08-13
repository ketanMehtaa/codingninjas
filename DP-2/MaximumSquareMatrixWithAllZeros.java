// find tht largest
import java.util.*;
public class Solution {
	public static int findMaxSquareWithAllZeros(int[][] input){
      int storage[][]=new int[input.length][input[0].length];
        int ans=0; 
        for(int i=0;i<input.length;i++){
            if(input[i][0]==0){
                storage[i][0]=1;
                ans=1;
            }
            else storage[i][0]=0;
        }
        for(int i=0;i<input[0].length;i++){
            if(input[0][i]==0){
                 storage[0][i]=1;
                 ans=1;
            }
            else storage[0][i]=0;
        } 
       
        for(int i=1;i<input.length;i++){
            for(int j=1;j<input[0].length;j++){
                if(input[i][j]==1){
                  storage[i][j]=0;
                }else{
                  storage[i][j]=Math.min(storage[i-1][j-1],Math.min(storage[i-1][j],storage[i][j-1]))+1;
                  if(ans<storage[i][j]){
                      ans=storage[i][j];
                  }
                }
            }
        } 
         return ans;
    }
}   
