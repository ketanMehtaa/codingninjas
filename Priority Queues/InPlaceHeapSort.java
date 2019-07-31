public class Solution {

	public static void insert(int input[],int childindex){
	int parentIndex = (childindex - 1)/2;
	 while(childindex > 0){
		if(input[childindex] < input[parentIndex]){
			int temp = input[childindex];
			input[childindex]=input[parentIndex];
            input[parentIndex]=temp;
			childindex = parentIndex;
			parentIndex = (childindex - 1) / 2;
		}
        else{
			return;
		}	
     }
	}

    public static void inplaceHeapSort(int input[]) {
		int i=0;
        // the input index is converted to heap means the element on the top is smallest of all
        while(i<input.length){
            insert(input,i);
            i++;
        }
        
        int j=input.length-1;
        while(j>0){
          // now we just swap last element and the first element ;
            int tem=input[0];
            input[0]=input[j];
            input[j]=tem;
	    	// now we visualise that the array is now decreased by one because in the last place 
            // our smallest element is there //\
            // and now we do heapyfy process but the last emement is not incruded;
            int index = 0;
	    	int minIndex = index;
	    	int leftChildIndex = 1;
	    	int rightChildIndex = 2;
    
	        	while(leftChildIndex < j){
        
	        		if(input[leftChildIndex] < input[minIndex]){
	        			minIndex = leftChildIndex;
	        		}
	        		if(rightChildIndex < j && input[rightChildIndex] < input[minIndex]){
	        			minIndex = rightChildIndex;
		        	}
		        	if(minIndex == index){
		        		break;
		        	}else{
                    int temp1 = input[index];
                    input[index]=input[minIndex];
                    input[minIndex]=temp1;
			    	index = minIndex;
			    	leftChildIndex = 2 * index + 1;
			    	rightChildIndex = 2 * index + 2;
			}
		}
    j--;
            
        }   
	}
}
