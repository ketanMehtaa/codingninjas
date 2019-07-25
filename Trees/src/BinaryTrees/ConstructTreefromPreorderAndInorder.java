public class Solution {
    static int preindex = 0; 
      public static BinaryTreeNode<Integer> help(int[] pre,int[] in,int ins,int ine){
       if (ins > ine) 
         return null;
        int root=pre[preindex++];
        BinaryTreeNode<Integer> ans=new BinaryTreeNode<Integer>(root);
        int index=-1;
        for(int i=0;i<in.length;i++){
            if(in[i]==root){
                index=i;
                break;
            }
        }
// if root is not present
        if(index==-1){
          return null;  
        } 
/* If this node has no children then return */
         if (ins==ine){
            return ans; 
         }
             ans.left =help(pre,in,ins,index-1);
             ans.right=help(pre,in,index+1,ine);
        return ans;    
    } 
        
	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,int[] in){
        return help(pre,in,0,in.length-1);
	}
}
// Time Complexity: O(n^2). Worst case occurs when tree is
// left skewed. Example Preorder and Inorder traversals for
// worst case are {A, B, C, D} and {D, C, B, A}.
// Efficient Approach : 
// We can optimize the above solution using hashing (unordered_map in C++ or HashMap in Java). We store indexes of inorder traversal in a hash table. So that search can be done O(1) time.
// filter_none
