Java Break Statement with Labeled For Loop
We can use break statement with a label. This feature is introduced since JDK 1.5. So, we can break any loop in Java now whether it is outer loop or inner.

Example:

//Java Program to illustrate the use of continue statement  
//with label inside an inner loop to break outer loop  
public class BreakExample3 {  
public static void main(String[] args) {  
            aa:  
            for(int i=1;i<=3;i++){    
                    bb:  
                    for(int j=1;j<=3;j++){    
                        if(i==2&&j==2){    
                            //using break statement with label  
                            break aa;    
                        }    
                        System.out.println(i+" "+j);    
                    }    
            }    
}  
}  
Output:

1 1
1 2
1 3
2 1
