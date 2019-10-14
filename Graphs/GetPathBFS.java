import java.util.*;
public class Solution{
     public static void getpath(int edges[][],int start,int end,boolean visited[],HashMap<Integer, Integer> map){
        Queue<Integer> q = new LinkedList<>();
        q.add(start); 
        int n=edges.length;
        int e=0;
        while(q.size()!=0)
        {
            int nekal=q.remove();
            visited[nekal]=true;
            //
            for(int i=0;i<n;i++)
            {
                if(edges[nekal][i]==1&&!visited[i])
                {
                    map.put(i,nekal);
                    visited[i]=true;
                    q.add(i);
                    if(i==end)
                    {
                      e=1;    
                    }
                    if(e==1)
                    {
                        break;
                    }
                }
              if(e==1)
              {
                break;
              } 
            }
        }
         if(e==1)
         {
             int last=map.get(end);
             System.out.print(end+" ");
             while(last!=end)
             {
                 System.out.print(last+" ");
                 if(map.get(last)!=null)
                 last=map.get(last);
                 else {
                     break;
                 }
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
		// fv=first vertice
		// start=second vertice
            int fv=s.nextInt();
            int sv=s.nextInt();
            edges[fv][sv]=1;
            edges[sv][fv]=1;
        }
        int start=s.nextInt();
        int end=s.nextInt();    
         HashMap<Integer, Integer> max = new HashMap<>();
        boolean visited[]= new boolean[edges[0].length];
        getpath(edges,start,end,visited,max);
    }
}
