public class Solution {
    public static int cost(int input[][],int row,int col) {
        if(row==input.length-1&&col==input[0].length-1){
         int ans=input[row][col];
            return ans;
       }
       
        int total=input[row][col];
        int opt1=Integer.MAX_VALUE;
        int opt2=Integer.MAX_VALUE;
        int opt3=Integer.MAX_VALUE;
        if(row+1<input.length&&col<input[0].length)
        opt1=total+cost(input,row+1,col);
        
        if(row+1<input.length&&col+1<input[0].length)
        opt2=total+cost(input,row+1,col+1);
        
        if(row<input.length&&col+1<input[0].length)
        opt3=total+cost(input,row,col+1);
        
        int answer=Math.min(Math.min(opt1,opt2),opt3);
        return answer;
            
    }	
    
    public static int minCostPath(int input[][]) {
     return cost(input,0,0);
        
	}
}
