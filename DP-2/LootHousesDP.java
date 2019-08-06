// in this approach we will go from last element to first 
// example
// 5 2 6 3 4 5
// first we add 3+5 and add it to storage at 3 place
// now we add and repate
public class Solution {
    public static int help(int arr[], int n,int i){
        int storage[]=new int[arr.length];
        storage[i]=arr[arr.length-1];
        storage[i-1]=arr[arr.length-2];
        storage[i-2]=arr[arr.length-3]+storage[i];        
        i=i-3;
        while(i>-1){
        storage[i]=arr[i]+Math.max(storage[i+2],storage[i+3]);
            i--;
        }    
        return Math.max(storage[0],storage[1]);   
    }          
	public static int getMaxMoney(int arr[], int n){
      return help(arr,n,arr.length-1);
	}
}
