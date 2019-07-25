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
        if(index==-1){
          return null;  
        } 
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
