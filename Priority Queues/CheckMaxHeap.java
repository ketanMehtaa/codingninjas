public class Solution {

	public static boolean checkMaxHeap(int arr[]) {

         int parent=0;
         int child1=1;
         int child2=2;
         while(child1<arr.length){
             if(arr[parent]<arr[child1]){
                 return false;
             }
            if((child2<arr.length)&&(arr[parent]<arr[child2])){
             // if((child2<arr.length)&&(arr[parent]<arr[child2])){
             // if((arr[parent]<arr[child2])&&(child2<arr.length)){
             // above both line have different meaning 
             // the first condition that will run will be  before the && and
            // the second condition will run after first..
                 return false;
               }
             
             parent++;
             child1=2*parent+1;
             child2=2*parent+2;
         }
        return true;
	}
}
