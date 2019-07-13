import java.util.Scanner;
public class LinkedListUse {
	
	public static                 Node<Integer> takeInput()
	{
		Node<Integer> head = null, tail = null;
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		int data = s.nextInt();
				
		while(data != -1){
			Node<Integer> newNode = new Node<Integer>(data);
			if(head == null){
				head = newNode;
				tail = newNode;
			}else{
//				Node<Integer> temp = head;
//				while(temp.next != null){
//					temp = temp.next;
//				}
//				temp.next = newNode;
				tail.next = newNode;
				tail = newNode; // tail = tail.next
			}
			data = s.nextInt();
		}
		return head;
	}
	
	public static void            print(Node<Integer> head){
		
		while(head != null){
			System.out.print(head.data +" ");
			head = head.next;
		}
		System.out.println();

	}

	public static Node<Integer>   insert(Node<Integer> head, int data, int pos){
		Node<Integer> newNode = new Node<Integer>(data);
		if(pos == 0){
			newNode.next = head;
			return newNode;
		}
		int i = 0;
		Node<Integer> temp = head;
		while(i < pos - 1){
			temp = temp.next;
			i++;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}

	public static Node<Integer>   deleteIthNode(Node<Integer> head, int i){
		if(i==0){ 
          head=head.next;
          return head;        
         }
        Node<Integer> temp=head;
        int pre=0; 
        while(temp.data!=null&&pre<i-1){
             temp=temp.next;
             pre++;
         } 
        if(temp.next.next!=null){
            temp.next=temp.next.next;
            return head;
        }
        else if(temp.next.next==null){
            temp.next=null;
            return head;
        }
            return head;
    }
	
	public static int             LengthIterative(Node<Integer>head){
		int count=0;
		while(head!=null)
		{
			count++;
			head=head.next;
		}
		return count;
	}
	
	public static Node<Integer>   append(Node<Integer> head, int n) {
	    Node<Integer>temp1=head;
		Node<Integer>temp2=head;
		int length=LengthIterative(head);
		int i=0;
		while(i<length-n-1)
		{
			temp1=temp1.next;
			i++;
		}
		head=temp1.next;
		temp1.next=null;
		Node<Integer>tempHead=head;
		while(tempHead.next!=null)
		{
			tempHead=tempHead.next;
		}
		tempHead.next=temp2;
		return head;
	}
	
    public static Node<Integer>   removeDuplicates(Node<Integer> head) {
		 if(head==null||head.next==null){
	            return head;
	        }
	        @SuppressWarnings("unused")
			int i=0;
	        Node<Integer> t1=head;
	        Node<Integer> t2=head.next;
	        while(t2!=null){
	            if(!(t1.data.equals(t2.data))){
	            t1.next=t2;
	            t1=t2;
	            t2=t2.next;  
	            }
	            else {
	            t2=t2.next;
	            }
	          }
	            t1.next=null;
	            return head;
	   }
	
	public static int             printMiddel(Node<Integer> head) {
	           if(head==null){
	               return -1;
	           }
	        Node<Integer> slow=head;
	        Node<Integer> fast=head;
	        while(fast.next!=null && fast.next.next!=null){
	        	//in the above line do not compare fast.data to null.... 
	        	//, means that, not compare data with null...
	        	// both condition is important one is for even and one for odd
	            slow=slow.next;
	            fast=fast.next.next;
	        }
	        return slow.data;
	    }

	public static Node<Integer>   mergeTwoList(Node<Integer> head1, Node<Integer> head2) {
		   
        Node<Integer> h;
        Node<Integer> t;
        if(head1.data<head2.data){
            h=head1;
            t=head1;
            head1=head1.next;
        }else{
            h=head2;
            t=head2;
            head2=head2.next;
        }
       while(head1!=null && head2!=null){
            if(head1.data<head2.data){
            t.next=head1;
            head1=head1.next;
            t=t.next;                                    
            }
            else {
            t.next=head2;
            head2=head2.next;
            t=t.next; 
            }
     	}
         if(head1!=null){
             t.next=head1;
           }
         else if(head2!=null){
             t.next=head2;
         }
        return h;
          
 }
	
	public static void main(String[] args) {

		
		Node<Integer> head = takeInput();
		head = insert(head, 80, 0);
		print(head);
		
//		Node<Integer> node1 = new Node<Integer>(10);
//		Node<Integer> node2 = new Node<Integer>(20);
//		Node<Integer> node3 = new Node<Integer>(30);
//		node1.next = node2;
//		node2.next = node3;
//		Node<Integer> head = node1;
//		print(head);
//		print(head);
		

	}

}


//////////////////////////////////////////
//public class LinkedListUse {
//	
//	public static  Node<Integer> takeInput()
//	{
//		Node<Integer> head = null, tail = null;
//		@SuppressWarnings("resource")
//		Scanner s = new Scanner(System.in);
//		int data = s.nextInt();
//				
//		while(data != -1){
//			Node<Integer> newNode = new Node<Integer>(data);
//			if(head == null){
//				head = newNode;
//				tail = newNode;
//			}else{
////				Node<Integer> temp = head;
////				while(temp.next != null){
////					temp = temp.next;
////				}
//				tail.next = newNode;
//				tail = newNode; // tail = tail.next
//			}
//			data = s.nextInt();
//		}
//		return head;
//	}
//	
//	public static void print(Node<Integer> head){
//		
//		while(head != null){
//			System.out.print(head.data +" ");
//			head = head.next;
//		}
//		System.out.println();
//
//	}
//
//	
//	
//	public static void main(String[] args) {
//		
//		Node<Integer> head = takeInput();
//		print(head);
//		
////		Node<Integer> node1 = new Node<Integer>(10);
////		Node<Integer> node2 = new Node<Integer>(20);
////		Node<Integer> node3 = new Node<Integer>(30);
////		node1.next = node2;
////		node2.next = node3;
////		Node<Integer> head = node1;
////		print(head);
////		print(head);
//		
//
//	}
//
//}
//////////////////////////////////////////////////////////////

////https://www.jobreadyprogrammer.com
//// see the content from his site
//public class LinkedListUse {
//	
//	public static void print(Node<Integer> head){
//		
//		while(head != null){
//			System.out.print(head.data +" ");
//			head = head.next;
//		}
//		System.out.println();
//
//	}
//
//	public static void main(String[] args) {
//		Node<Integer> node1 = new Node<Integer>(10);
//		Node<Integer> node2 = new Node<Integer>(20);
//		Node<Integer> node3 = new Node<Integer>(30);
//		node1.next = node2;
//		node2.next = node3;
//		Node<Integer> head = node1;
//		print(head);
//		print(head);
//		
//
//	}
//
//}
 