package recursion;
import java.util.Scanner;
public class Binarysearch {
		
	public static int binarySearch(int input[], int start,int end,int x) {
        if(end>=start) {
       int mid = start+(end-start)/2;
       if(input[mid]==x){
           return mid;
        }
       if(input[mid]>x)
       return binarySearch(input,start,mid-1,x);
       return binarySearch(input,mid+1,end,x);
      
      }
       return -1;
     	
   }
       public static int binarySearch(int input[], int element) {
      int k= binarySearch(input,0,input.length,element);               
         return k;
       }

	static Scanner s = new Scanner(System.in);
		public static int[] takeInput() {
			int size = s.nextInt();
			int arr[] = new int[size];
			for (int i = 0; i < size; i++) {
				arr[i] = s.nextInt();
			}
			return arr;
		}
		
		public static void main(String[] args) {
			int[] input = takeInput();
			int element = s.nextInt();
			System.out.println(binarySearch(input, element));
		}
	}
