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

	 public static BinaryTreeNode<Integer> help(int[] post,int[] in,int inS,int inE,int preS,int preE){
       if(inS > inE) 
         return null;
        
        int root=post[preE];
        BinaryTreeNode<Integer> ans=new BinaryTreeNode<Integer>(root);
        int index=-1;
        for(int i=0;i<in.length;i++){
            if(in[i]==root){
                index=i;
                break;
            }
        }
        if(index==-1){
          return null;  
        }
        int leftInS =inS;
        int leftInE =index-1;
        int leftPreS=preS;
        int leftPreE=leftPreS+leftInE-leftInS;
        
        int rightInS=index+1;
        int rightInE=inE;
        int rightPreS=leftPreE+1;
        int rightPreE=preE-1;
        // the main problem is created by leftPreE
        // the actual concept is leftpreE-leftpreS=rightpreE-rightpreS;
        ans.left= help(post, in, leftInS, leftInE, leftPreS, leftPreE);
        ans.right=help(post, in, rightInS, rightInE, rightPreS, rightPreE);
        return ans;    
    } 
	public static BinaryTreeNode<Integer> getTreeFromPostorderAndInorder(int[] post,int[] in){
        return help(post,in,0,in.length-1,0,post.length-1);
	}

}

