import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.*;
public class Solution {

	public static ArrayList<Integer> kLargest(int input[], int k) {
	  PriorityQueue<Integer> pq = new PriorityQueue<>();
      ArrayList<Integer> ans=new ArrayList<Integer>();
		int i = 0;
		for ( ; i <k ; i++){
			pq.add(input[i]);
		}
		for(; i < input.length; i++){
			 int num=pq.element();
             if(num<input[i]){
                 pq.remove();
                 pq.add(input[i]);
             }
		}
        while(!pq.isEmpty()){
            ans.add(pq.remove());
        }
        return ans;
		
	}
}
Sample Input :
13
2 12 9 16 10 5 3 20 25 11 1 8 6 
4
Sample Output :
12
16
20
25
