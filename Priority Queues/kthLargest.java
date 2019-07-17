import java.util.*;
public class Solution {

	public static int kthLargest(int arr[], int k) {
		int i=0;
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>(Collections.reverseOrder());
        for(i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        for(int j=0;j<k-1;j++){
           pq.remove();
        }
        return pq.remove();
	}
}
// below is the solution which is be
// import java.util.PriorityQueue;
// public class Solution { 
//     public static int kthLargest(int arr[], int k) {
//         PriorityQueue<Integer> pq = new PriorityQueue<Integer>(); 
//         for(int i = 0; i < k; i++) {
//             pq.add(arr[i]);
//         }
//         for(int i = k; i < arr.length; i++) {
//             if(arr[i] > pq.peek()) { 
//                 pq.poll(); 
//                 pq.add(arr[i]); 
//             }
//         }
//         return pq.peek(); 
//     }
// }
