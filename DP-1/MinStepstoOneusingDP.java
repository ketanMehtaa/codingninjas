// this is the bottom up_______ approch which is better than recurtion 
//because we have to think more in recurtion 
public class Solution { 
    public static int countStepsTo1(int n){
        int steps[] = new int[n + 1]; 
        for(int i = 2; i <= n; i++){
            int count1,count2 = Integer.MAX_VALUE, count3 = Integer.MAX_VALUE; 
            count1 = steps[i - 1]; 
            // count1 is the steps of back element
            if(i % 2 == 0){
                count2 = steps[i / 2]; 
            }
            if(i % 3 == 0){
                count3 = steps[i / 3]; 
            }
            steps[i] = 1 + Math.min(count1, Math.min(count2, count3)); 
        }
        return steps[n]; 
    }
}
