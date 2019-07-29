// below is my code
// public class Solution {

//     public static int countBalancedBTs(int h){		
// 		int mod = (int)Math.pow(10, 9) + 7;
// 		return help(h, mod);
// 	}
	
//     public static int help(int height,int mod){
//          if(height==1||height==0){
//              return 1;
//          }
//         int storage[]=new int[height+1];
//         storage[0]=1;
//         storage[1]=1;
//         // int x=balancedTreesOfHeightH(height-1);
//         // int y=balancedTreesOfHeightH(height-2);
//         for(int i=2;i<=height;i++){
//             int x=storage[i-1];
//             int y=storage[i-2];
//             long res1 = (long)x * x;
//             long res2 = (long)x * y * 2; 
//             int value1 = (int)(res1 % mod);
//             int value2 = (int)(res2 % mod);
// 	    	int total  = (value1 + value2) % mod;
//           storage[i]=total;
//         }  
//         return storage[height];

// 	}
// 	public static int balancedTreesOfHeightH(int height){
//          if(height==1||height==0){
//              return 1;
//          }
//         int mod=countBalancedBTs(height);
//         return mod;

// 	}
// }
// below is the solution
public class Solution { 
    public static int balancedTreesOfHeightH(int height){ 
        if(height == 0){
            return 1; 
        }
        int storage[] = new int[height + 1];
        storage[0] = storage[1] = 1;
        int mod = (int) Math.pow(10, 9) + 7; 
        for(int i = 2; i <= height; i++){
            // Cast to long 
            long temp1 = (long) (storage[i- 1]) * storage[ i - 1];
            temp1 = temp1 % mod; 
            // Cast to long
            long temp2 = 2 * (long) (storage[i - 1]) * storage[ i - 2]; 
            temp2 = temp2 % mod;
            storage[i] = (int) (temp1 + temp2) % mod; 
        }
        return storage[height]; 
    }
}
