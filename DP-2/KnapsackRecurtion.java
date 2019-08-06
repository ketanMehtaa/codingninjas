public class Solution {
	public static int help(int[] weight,int value[],int index,int maxweight, int n){
     if(maxweight==0||n<=index){
        return 0;
     }  
        
     if(weight[index]>maxweight){
          return help(weight,value,1+index,maxweight,n);
      }
     int opt1 = value[index]+help(weight,value,++index,maxweight-weight[index],n);
     int opt2 = help(weight,value,++index,maxweight,n);
      return Math.max(opt1,opt2);  
        
    }	
	public static int knapsack(int[] weight,int value[],int maxWeight, int n){
         return help(weight,value,0,maxWeight,n);
	}
}
