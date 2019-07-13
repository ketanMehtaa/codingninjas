public class Queueusell<T> {
    private Node<T> front;
    private Node<T> rear;
	private int size;

    public Queueusell() {
    this.front=this.rear=null;
        this.size=0;
	}
  
    public int size() {
      return size;
	}
   
	public boolean isEmpty() {
      if(size==0){
          return true;
      }
        return false;
	}
    public T front() throws QueueEmptyException {
      if(size==0){
            throw new QueueEmptyException();
		}
        return  front.data;
	}
    
    public void enqueue(T data) {       
        Node<T> temp = new Node<T>(data);
          // If queue is empty, then new node is front and rear both 
        if (this.rear == null) 
        { 
           front = rear = temp; 
           size++;
            return; 
        } 
       
        // Add the new node at the end of queue and change rear 
        this.rear.next = temp; 
        this.rear = temp;
        // i just dont understand the above 2 lines work
        this.size++;
    }

//     public T dequeue() throws QueueEmptyException {
//         if(size==0){
//             throw new QueueEmptyException();
			
//          }
//         T tempdata = front.data;
// 		front = front.next;
// 		size--;
// 		return tempdata;
// 	}
    public T dequeue() throws QueueEmptyException { 
        if(isEmpty()) {
            QueueEmptyException e = new QueueEmptyException(); 
            throw e; 
        } 
        Node<T> temp = front; 
        if(size == 1) { 
            front = null; 
            rear = null;
        }
        else {
            front = front.next; 
            temp.next = null;
        } 
        size--;
        return temp.data;
    }
}    

