import java.io.*; 
import java.util.*; 
public class Solution{
	public static void help(int edges[][],boolean visited[],String ans,int start,int end){
    if(start==end){
        ans=start+" "+ans;
            System.out.print(ans);
            System.exit(0);
    }  
        visited[start]=true;
        ans=start+" "+ans;
        int n=edges.length;   
          for(int j=0;j<n;j++){
              if(edges[start][j]==1&&!visited[j]){
                 help(edges,visited,ans,j,end); 
              }
          }
    }

    //  we can not use arraylist in place of string 
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        // total number of edges e
		int e = s.nextInt();
        int edges[][]=new int[n][n];
        for(int i=0;i<e;i++){
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        int start=s.nextInt();
        int end=s.nextInt();
        String ans="";
        boolean visited[]=new boolean[edges.length];
        help(edges,visited,ans,start,end);
    }
}
