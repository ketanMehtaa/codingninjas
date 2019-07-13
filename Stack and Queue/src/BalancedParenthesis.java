import java.util.*;

public class BalancedParenthesis {

	public static boolean checkBalanced(String exp) {
	StackUsingLL<Character> stack = new StackUsingLL<Character>();
       int i=0; 
        while(i<exp.length()){
            if(exp.charAt(i)=='['||exp.charAt(i)=='{'||exp.charAt(i)=='('){
                stack.push(exp.charAt(i));
            }
           if(exp.charAt(i)=='}'||exp.charAt(i)==']'||exp.charAt(i)==')'){
               if(stack.size()==0){
                   return false;
               }
               int k=stack.pop();
               if(k=='('){
                     if(exp.charAt(i)!=')'){
                         return false;
                     }
                }
                if(k=='{'){
                     if(exp.charAt(i)!='}'){
                         return false;
                     }
                }   
               if(k=='['){
                     if(exp.charAt(i)!=']'){
                         return false;
                     }
                }
           }
            i++;
        }
         if(stack.size()==0){
          return true;
         }
        return false;
    }
}
             


	  class StackUsingLL<T> {
			private Node<T> head;
			private int size;

			public StackUsingLL() {
				head = null;
				size = 0;	
			}

			int size(){
				return size;
			}
			boolean isEmpty(){
				return size() == 0; // head == null
			}

			T top(){
			
				return head.data;
			}

			void push(T element){
				
				Node<T> newNode = new Node<T>(element);
				newNode.next = head;
				head = newNode;
				size++;
				
			}

			T pop() {
				
				T tempdata = head.data;
				head = head.next;
				size--;
				return tempdata;
			
			}
		}

    
	