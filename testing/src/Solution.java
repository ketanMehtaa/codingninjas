
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

}
* */
public class Solution {
	public static int printMiddel(LinkedListNode<Integer> head) {
        if(head==null||head.next==null){
               return head.data;
           }
        LinkedListNode<
        Integer> slow=head;
        head=head.next;
        LinkedListNode<Integer> fast=head.next;
        
        while(fast.data!=null){
            slow=slow.next;
            fast=fast.next;
            fast=fast.next;
        }
        return slow.data;
    }
}