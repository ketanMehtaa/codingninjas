
public class Solution {
    public static int helpp(int arr[], int n,int i){
        int storage[]=new int[arr.length+1];
        
        for(int j=0;j<storage.length;j++){
            storage[j]=-1;
        }
        return help(arr,n,0,storage);
    }
    public static int help(int arr[], int n,int i,int storage[]){
        if(i>=n){
           return 0;
        }
        if(storage[i]!=-1){
            return storage[i];
        }
        int opt1=arr[i]+help(arr,n,i+2,storage);
        int opt2=0;
        if(!(i+1>=n)){
        opt2=arr[i+1]+help(arr,n,i+3,storage);
        }
        storage[i]=Math.max(opt1,opt2);
        return storage[i];
    }
	public static int getMaxMoney(int arr[], int n){
      return helpp(arr,n,0);
	}
}
