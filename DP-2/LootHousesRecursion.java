
public class Solution {
    public static int help(int arr[], int n,int i){
       if(i>=n){
           return 0;
        }
        int opt1=arr[i]+help(arr,n,i+2);
        int opt2=0;
        if(!(i+1>=n)){
        opt2=arr[i+1]+help(arr,n,i+3);
        }
            return Math.max(opt1,opt2);
    }
	public static int getMaxMoney(int arr[], int n){
      return help(arr,n,0);
	}
}
