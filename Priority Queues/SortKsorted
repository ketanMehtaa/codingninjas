import java.util.PriorityQueue;

public class PriorityQueueUse {


	private static void insertIntoVirtualHeap(int[] arr, int i) {
		int childIndex = i;
		int parentIndex = (childIndex - 1) / 2;
		while(childIndex > 0){
			if(arr[childIndex] < arr[parentIndex] ){
				int temp = arr[childIndex];
				arr[childIndex] = arr[parentIndex];
				arr[parentIndex] = temp;
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}else{
				return;
			}
		}

	}

	private static int removeMinFromVirtualHeap(int[] arr, int heapSize) {

		int temp = arr[0];
		arr[0] = arr[heapSize - 1];
		heapSize--;
		int index = 0;
		int leftChildIndex = 2 * index + 1;
		int rightChildIndex = 2 * index + 2;

		while(leftChildIndex < heapSize){

			int minIndex = index;
			if(arr[leftChildIndex] < arr[minIndex]){
				minIndex = leftChildIndex;
			}
			if(rightChildIndex < heapSize && arr[rightChildIndex] < arr[minIndex]){
				minIndex = rightChildIndex;
			}
			if(minIndex != index){
				int temp1 = arr[index];
				arr[index] = arr[minIndex];
				arr[minIndex]  = temp1;
				index = minIndex;
				leftChildIndex = 2 * index + 1;
				rightChildIndex = 2 * index + 2;
			}else{
				break;
			}
		}
		return temp;
	}

	public static void sortKSorted(int arr[], int k){
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		int i = 0;
		for ( ; i < k; i++){
			pq.add(arr[i]);
		}
		
		for(; i < arr.length; i++){
			arr[i - k] = pq.remove();
			pq.add(arr[i]);
		}
		
		for(int j = arr.length - k; j < arr.length; j++){
			arr[j] = pq.remove();
		}
		
	}
	
	public static void main(String[] args) {
		int arr[] = {2,4,1,9,6,8};
		int k = 3;
		sortKSorted(arr, k);
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		
//		PriorityQueue<Integer> pq = new PriorityQueue<>();
//		int arr[] = {9,1,0,4,7,3};
//		for(int i = 0; i < arr.length; i++){
//			pq.add(arr[i]);
//			if k is one then the element place is not change 
//       because the elements are within k distance to get sorted
//		}
//		
////		System.out.println(pq.element());
//		while(! pq.isEmpty()){
//			System.out.print(pq.remove() + " ");
//		}
// time complexity nlogk

	}




}
