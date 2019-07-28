public class Solution {

/*	Binary Tree Node class
 * 
 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k,String ans) {
          if(k==root.data){      
              if(root.right==null&&root.left==null){
                 System.out.println(ans+" "+root.data);
                 return; 
              }else{
                  return;
              }
          }
         
        if(root.left!=null){
          if(ans=="")
            rootToLeafPathsSumToK(root.left ,k-root.data,ans+root.data);
           else{ 
            rootToLeafPathsSumToK(root.left ,k-root.data,ans+" "+root.data);
           }
        }
        if(root.right!=null){  
            if(ans=="")
            rootToLeafPathsSumToK(root.right ,k-root.data,ans+root.data);
           else{ 
            rootToLeafPathsSumToK(root.right ,k-root.data,ans+" "+root.data);
           }
        }
    }
    public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
		rootToLeafPathsSumToK(root,k,"");
	}
}
// // below is the solution 
// import java.util.ArrayList;
// public class Solution {
//     public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, ArrayList<Integer> path, int k) {
//             if(root == null) { 
//                 return;
//             } 
//             k -= root.data; 
//             path.add(root.data);
//             if(root.left == null && root.right == null) { 
//                 if(k == 0) {
//                     for(int i : path) { 
//                         System.out.print(i + " "); 
//                     }
//                     System.out.println();
//                 }
//                 path.remove(path.size() - 1);
//                 return;
//             }
//             rootToLeafPathsSumToK(root.left, path, k); 
//             rootToLeafPathsSumToK(root.right, path, k); 
//             path.remove(path.size() - 1); 
//         }
//   public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
//             ArrayList<Integer> path = new ArrayList<Integer>(); 
//             rootToLeafPathsSumToK(root, path, k); 
//     }
// }
