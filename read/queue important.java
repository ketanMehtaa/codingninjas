Queue Interface In Java
The Queue interface is available in java.util package and extends the Collection interface. The queue collection is used to hold the elements about to be processed and provides various operations like the insertion, removal etc. It is an ordered list of objects with its use limited to insert elements at the end of the list and deleting elements from the start of list i.e. it follows the FIFO or the First-In-First-Out principle. Being an interface the queue needs a concrete class for the declaration and the most common classes are the PriorityQueue and LinkedList in Java.It is to be noted that both the implementations are not thread safe. PriorityBlockingQueue is one alternative implementation if thread safe implementation is needed. Few important characteristics of Queue are:

The Queue is used to insert elements at the end of the queue and removes from the beginning of the queue. It follows FIFO concept.
The Java Queue supports all methods of Collection interface including insertion, deletion etc.
LinkedList, ArrayBlockingQueue and PriorityQueue are the most frequently used implementations.
If any null operation is performed on BlockingQueues, NullPointerException is thrown.


BlockingQueues have thread-safe implementations.
The Queues which are available in java.util package are Unbounded Queues
The Queues which are available in java.util.concurrent package are the Bounded Queues.
All Queues except the Deques supports insertion and removal at the tail and head of the queue respectively. The Deques support element insertion and removal at both ends.
Methods in Queue:

add()- This method is used to add elements at the tail of queue. More specifically, at the last of linked-list if it is used, or according to the priority in case of priority queue implementation.
peek()- This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
element()- This method is similar to peek(). It throws NoSuchElementException when the queue is empty.
remove()- This method removes and returns the head of the queue. It throws NoSuchElementException when the queue is empty.
poll()- This method removes and returns the head of the queue. It returns null if the queue is empty.
size()- This method return the no. of elements in the queue.


Since it is a subtype of Collections class, it inherits all the methods of it namely size(), isEmpty(), contains() etc.
Below is a simple Java program to demonstrate these methods:

filter_none
edit
play_arrow

brightness_4
// Java orogram to demonstrate working of Queue 
// interface in Java 
import java.util.LinkedList; 
import java.util.Queue; 
  
public class QueueExample 
{ 
  public static void main(String[] args) 
  { 
    Queue<Integer> q = new LinkedList<>(); 
  
    // Adds elements {0, 1, 2, 3, 4} to queue 
    for (int i=0; i<5; i++) 
     q.add(i); 
  
    // Display contents of the queue. 
    System.out.println("Elements of queue-"+q); 
  
    // To remove the head of queue. 
    int removedele = q.remove(); 
    System.out.println("removed element-" + removedele); 
  
    System.out.println(q); 
  
    // To view the head of queue 
    int head = q.peek(); 
    System.out.println("head of queue-" + head); 
  
    // Rest all methods of collection interface, 
    // Like size and contains can be used with this 
    // implementation. 
    int size = q.size(); 
    System.out.println("Size of queue-" + size); 
  } 
} 
Output:
Elements of queue-[0, 1, 2, 3, 4]
removed element-0
[1, 2, 3, 4]
head of queue-1
Size of queue-4
