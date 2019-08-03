import java.util.Scanner;
import java.util.LinkedList; 
import java.util.Scanner;
import java.util.Queue;
import java.io.*; 
import java.util.*; 
public class Solution{
	public static void help(int edges[][],boolean visited[],int fv){  
        visited[fv]=true;
        int n=edges.length;   
          for(int j=0;j<n;j++){
              if(edges[fv][j]==1&&!visited[j]){
                 help(edges,visited,j); 
              }
          }
    }
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
        boolean visited[]=new boolean[edges.length];
        help(edges,visited,0);
       //now check if all elements is visited or not
        int length=visited.length;
        int i=0;
        while(i<visited.length){
            if(visited[i]!=true){
                System.out.print("false");
                System.exit(0);
            }
            i++;
        }
          System.out.print("true");
          System.exit(0);
    }
}
