import java.util.*; 
public class Solution {
	public static int maxFrequencyNumber(int[] arr){
	  HashMap<Integer, Integer> max = new HashMap<>();
        for(int i=0;i<arr.length;i++){
        if(max.containsKey(arr[i])){
            max.put(arr[i],max.get(arr[i])+1);
          }else{
            max.put(arr[i],1);
           }
        }
    
       int ma = 0,
       ans = Integer.MIN_VALUE;
       for(int i : arr) {
           if(max.get(i) > ma) { 
               ma = max.get(i);
               ans = i;
           }
       }
       return ans;
    }
}
