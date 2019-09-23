/********** Given Queue Class **************
// You can directly use these functions

class Queue<T> {

	public int size();

	public boolean isEmpty();

	public T front();

	public void enqueue(T element);

	public T dequeue();
}

**********************************/



public class Solution {

	public static void reverseQueue(Queue<Integer> q) {
		if(q.isEmpty()){
            //q.size()<=1
            return;
        }
        int top=q.dequeue();
           reverseQueue(q);
          q.enqueue(top);
	}
}
