public class Dequeue {
    
    static final int MAX = 10; 
    int  arr[]; 
    int  front; 
    int  rear; 
    int  size; 
      
    public Dequeue(int size){ 
        arr = new int[MAX]; 
        front = -1; 
        rear = 0; 
        this.size = size; 
    } 
   
    // Checks whether Deque is full or not. 
    boolean isFull() 
    { 
        return ((front == 0 && rear == size-1)|| 
            front == rear+1); 
    } 
   
    // Checks whether Deque is empty or not. 
    boolean isEmpty () 
    { 
        return (front == -1); 
    } 
   
    // Inserts an element at front 
    void insertFront(int key) 
    { 
        // check whether Deque if  full or not 
        if (isFull()) 
        { 
            System.out.println("-1");  
            return; 
        } 
   
        // If queue is initially empty 
        if (front == -1) 
        { 
            front = 0; 
            rear = 0; 
        } 
          
        // front is at first position of queue 
        else if (front == 0) 
            front = size - 1 ; 
   
        else // decrement front end by '1' 
            front = front-1; 
   
        // insert current element into Deque 
        arr[front] = key ; 
    } 
   
    // function to inset element at rear end 
    // of Deque. 
    void insertRear(int key) 
    { 
        if (isFull()) 
        { 
            System.out.println("-1"); 
            return; 
        } 
   
        // If queue is initially empty 
        if (front == -1) 
        { 
            front = 0; 
            rear = 0; 
        } 
   
        // rear is at last position of queue 
        else if (rear == size-1) 
            rear = 0; 
   
        // increment rear end by '1' 
        else
            rear = rear+1; 
          
        // insert current element into Deque 
        arr[rear] = key ; 
    } 
   
    // Deletes element at front end of Deque 
    void deleteFront() 
    { 
        // check whether Deque is empty or not 
        if (isEmpty()) 
        { 
            System.out.println("-1"); 
            return ; 
        } 
   
        // Deque has only one element 
        if (front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 
        else
            // back to initial position 
            if (front == size -1) 
                front = 0; 
   
            else // increment front by '1' to remove current 
                // front value from Deque 
                front = front+1; 
    } 
   
    // Delete element at rear end of Deque 
    void deleteRear() 
    { 
        if (isEmpty()) 
        { 
            System.out.println("-1"); 
            return ; 
        } 
   
        // Deque has only one element 
        if (front == rear) 
        { 
            front = -1; 
            rear = -1; 
        } 
        else if (rear == 0) 
            rear = size-1; 
        else
            rear = rear-1; 
    } 
   
    // Returns front element of Deque 
    int getFront() 
    { 
        // check whether Deque is empty or not 
        if (isEmpty()) 
        { 
            return -1 ; 
        } 
        return arr[front]; 
    } 
   
    // function return rear element of Deque 
    int getRear() 
    { 
        // check whether Deque is empty or not 
        if(isEmpty() || rear < 0) 
        { 
            return -1 ; 
        } 
        return arr[rear]; 
    }
}
// Dequeue
// Send Feedback
// You need to implement a class for Dequeue i.e. for double ended queue. In this queue, elements can be inserted and deleted from both the ends.
// You don't need to double the capacity.
// You need to implement the following functions -
// 1. constructor
// You need to create the appropriate constructor. Size for the queue passed is 10.
// 2. insertFront -
// This function takes an element as input and insert the element at the front of queue. Insert the element only if queue is not full. And if queue is full, print -1 and return.
// 3. insertRear -
// This function takes an element as input and insert the element at the end of queue. Insert the element only if queue is not full. And if queue is full, print -1 and return.
// 4. deleteFront -
// This function removes an element from the front of queue. Print -1 if queue is empty.
// 5. deleteRear -
// This function removes an element from the end of queue. Print -1 if queue is empty.
// 6. getFront -
// Returns the element which is at front of the queue. Return -1 if queue is empty.
// 7. getRear -
// Returns the element which is at end of the queue. Return -1 if queue is empty.
