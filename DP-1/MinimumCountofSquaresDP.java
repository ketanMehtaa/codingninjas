// below is my code 
import java.lang.Math; 
public class Solution {
    public static int minCount(int n) {
    int storage[]=new int[n+1];
      storage[0]=0;
      if(n>0)
      storage[1]=1;
      if(n>1)
      storage[2]=2;
      if(n>2)
      storage[3]=3;
    for(int i=4;i<=n;i++){
        int num=(int)Math.sqrt(i);
        int ans=Integer.MAX_VALUE;
        while(num>0){
        int remaning=i-(num*num);
        int sum=1+storage[remaning];
        num--;
           if(ans>sum){
            ans=sum;
           }
        storage[i]=ans;            
        }
    }
    return storage[n];    
   }
}
// below is the solution
// public class Solution { 
//     public static int minCount(int n) {
//         // count[i] - represents minimum count of squares for integer n 
//         if(n <= 3) { 
//             return n; 
//         }
//         int count[]=new int[n + 1]; 
//         count[0] = 0;
//         count[1] = 1;
//         count[2] = 2;
//         count[3] = 3;
//         for(int i = 4; i <= n; i++) { 
//             int ans = i; 
//             for(int j = 1; j <= i/2; j++) {
//                 int k = i - (j * j); 
//                 if(k >= 0) 
//                     ans = Math.min(ans, count[k] + 1); 
//             }
//             count[i] = ans;
//         }
//         return count[n]; 
//     }
// }
