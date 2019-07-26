// below is the linkedhashmap implementation
// in your hashmap numbers are in general way thus they wont return the number with 
// maximum frequency and occur first , u better be use Linked
// hashmap which actually stored the elements as per the required order
import java.util.*; 
public class Solution {
   public static int maxFrequencyNumber(int[] arr){
	LinkedHashMap<Integer, Integer> max = new LinkedHashMap<>();
        for(int i=0;i<arr.length;i++){
          if(max.containsKey(arr[i])){
            max.put(arr[i],max.get(arr[i])+1);
          }else{
            max.put(arr[i],1);
           }
        }
       int max1=0;
       int k=-1;
       
       Iterator <Integer> it=max.keySet().iterator();
       while(it.hasNext()){
           int i=it.next();
           if(max1<max.get(i)){
               max1=max.get(i);
               k=i;
           }
       }
       return k;
   }
}
