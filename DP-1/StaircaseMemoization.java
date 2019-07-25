public class Solution{
   public static long ans(int n){
    	long storage[] = new long[n+1];
		for(int i = 0; i <= n; i++){
			storage[i] = -1;
		}
        return ans(n,storage);
    }
    public static long ans(int n,long storage[]){
     if(n==0){
         storage[n]=0;
         return storage[n];
     }if(n==1){
         storage[1]=1;
         return storage[n];
     }if(n==2){
         storage[n]=2;
         return storage[n]; 
     }if(n==3){
         storage[n]=4;
         return storage[n]; 
     }
        if(storage[n]!=-1){
          return storage[n];
      }
        long opt1=0;
        long opt2=0;
        long opt3=0;
          opt1=ans(n-1);
          opt2=ans(n-2);
          opt3=ans(n-3);
        long answer=opt1+opt2+opt3;  
        storage[n]=answer;
         return storage[n];         
    }
    public static long staircase(int n){
        return ans(n);   
    
    }
}  
