
public class QueueUse {

	public static void main(String[] args) {
		QueueUsingArray queue = new QueueUsingArray(3);
		for(int i = 1; i <= 5; i++){
			try {
				queue.enqueue(i);
			} catch (QueueFullException e) {
				
			}
		}
		
		
		while(! queue.isEmpty()){
			try {
				System.out.println(queue.dequeue());
			} catch (QueueEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
