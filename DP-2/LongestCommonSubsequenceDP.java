public class LCS {
    public static int lcsM(String s, String t, int[][] storage) {
		int m = s.length();
		int n = t.length();
		int storage[][] = new int[s.length() + 1][t.length() + 1];
		for(int i=0;i<=m;i++){
           storage[i][0]=0;
        }
        for(int i=0;i<=n;i++){
           storage[0][i]=0;
        }
          for(int i=1;i<=m;i++){
             for(int j=1;j<=n;j++){
                if(s.charAt(m-i)==t.charAt(n-j)){
                   storage[i][j]=1+storage[i-1][j-1];
                }else{
                   storage[i][j]=Math.max(storage[i][j-1],storage[i-1][j]);
                 }
             }
          }
         return storage[m][n];
    }
 }
        
  
