
/*
 class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;
	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
} */
public class Solution {
	public static void deleteAlternateNodes(LinkedListNode<Integer> head) {
         while(head.next!=null){
             if(head.next.next!=null){
             head.next=head.next.next;
             head=head.next;
             }else{
                 head.next=null;
             }
         }
	}
}
// Delete alternate nodes
// Send Feedback
// Given a linked list, delete all alternate nodes in the list. That means given Linked List is -
// 10 20 30 40 50 60 
// you need to delete nodes - 20, 40 and 60
// Note : Head of the list will remain same. Don't need to print or return anything.
// Input Constraints:
// 1 <= Length of Linked List <=10^6.
// Input format :
// Linked list elements (separated by space and terminated by -1)
// Output Format :
// Updated linked list elements 
// Sample Input :
// 1 2 3 4 5 -1
// Sample Output :
// 1 3 5
