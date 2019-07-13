public class sss {
	public static int length(LinkedListNode<Integer> head){
       int count=0;
        while(head!=null){
            head=head.next;
            count++;
        }
		return count;
	}  
	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head ){
          if(head==null||head.next==null){
              return head;
          }
        int lengt=length(head);
        int i=0;
        LinkedListNode<Integer> prev=null,curr=head;
        while(i<lengt){
            while(curr.next!=null){
             LinkedListNode<Integer> next=curr.next;
                if(curr.data>next.data){
                    if(prev==null){
                        curr.next=next.next;
                        next.next=curr;
                        head=next;
                        next=prev;
                    }else{
                        prev.next=curr.next;
                        curr.next=next.next;
                        next.next=curr;
                        prev=next;
                    }
                }else{
                    prev=curr;
                    curr=next;
                    next=next.next;
                }
            }
        } return head;
	}
}
