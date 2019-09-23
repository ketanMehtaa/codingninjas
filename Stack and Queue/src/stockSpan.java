//made by ketan mehta
import java.util.*;
public class Solution {

	public static int[] stockSpan(int[] price) {
        Stack<Integer> index = new Stack<>();
        int i=0;
        int peek=0;
        int arr[]=new int[price.length];
        while(i<price.length){
           if(index.empty()){
               index.push(i);
               arr[i]=1;
           }else{
               peek=index.peek();
               if(price[peek]>=price[i]){
                  index.push(i);
                  arr[i]=1;
               }else{
                  peek=index.peek(); 
                  while(price[peek]<price[i]&&((!(index.empty()))&&price[peek]!=price[i])){
                      index.pop();
                      if(!(index.empty())){
                      peek=index.peek();
                      }
                  }
                    if(index.empty()){
                        arr[i]=i+1 ;
                    }
                    else
                   {
                      arr[i]=i-index.peek();
                    }
            // Push this element to stack 
            index.push(i); 
               }
           }
          i++;
        }
        return arr;
	}
}
// import java.util.Stack ;

// public class Solution {

// 	public static int[] stockSpan(int[] price)
//     {
// 		Stack<Integer> st = new Stack<>(); 
//         st.push(0); 
//         int S[] = new int[price.length];
//         S[0] = 1; 
//         int x= 0 ;
  
//         for (int i = 1; i < price.length ; i++) 
//         { 
  
//             // Pop elements from stack while stack is not 
//             // empty and top of stack is smaller than 
//             // price[i] 
//             while (!st.empty() && price[st.peek()] < price[i]) 
//                    x= st.pop(); 
  
//             // If stack becomes empty, then price[i] is 
//             // greater than all elements on left of it, i.e., 
//             // price[0], price[1], ..price[i-1]. Else price[i] 
//             // is greater than elements after top of stack 
//             if(st.empty())
//             {
//                 if(price[x]==price[i])
//                     S[i]=1 ;
//                 else
//                     S[i]=i+1 ;
//             }
//             else
//             {
//                 S[i]=i-st.peek();
//             }
  
//             // Push this element to stack 
//             st.push(i); 
//         }
//         return S ;
//     }
// }
