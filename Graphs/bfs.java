import java.util.LinkedList; 
import java.util.Scanner;
import java.util.Queue; 
public class Solution{
	public static void printhelper(int edges[][],int sv,boolean visited[]){
      Queue<Integer> q = new LinkedList<>();
        q.add(sv);
        int n=edges.length;
        while(q.size()!=0){
            int nekal=q.remove();
            visited[nekal]=true;
            System.out.print(nekal+" ");
            for(int i=0;i<n;i++){
                if(edges[nekal][i]==1&&!visited[i]){
                    visited[i] =true;
                    q.add(i);
                }
            }
        }  
     }
    public static void print(int edges[][]) {
        boolean visited[]= new boolean[edges[0].length];
        //for(int i=0;i<edges.length;i++){
        //if(!visited[i])
        //Here you need to consider that you need to print BFS path starting from vertex 0 only.
                printhelper(edges,0,visited);
        
    }
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
        // total number of edges e
		int e = s.nextInt();
        int edges[][]=new int[n][n];
         
        for(int i=0;i<e;i++){
		// fv=first vertice
		// sv=second vertice
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        print(edges);
    }
}

