import java.util.Scanner;

public class TreeUse {
	
	public static void               preorder(TreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		for (int i = 0; i < root.children.size(); i++) {
			preorder(root.children.get(i));
		}
	}
	
	public static void               printAtK(TreeNode<Integer> root, int k) {
		if (k < 0) {
			return;
		}
		if (k == 0) {
			System.out.println(root.data);
			return;
		}
		for (int i = 0; i < root.children.size(); i++) {
			printAtK(root.children.get(i), k - 1);
		}
	}
	
	public static boolean            checkIfContainsX(TreeNode<Integer> root, int x){
        if(root==null){
            return false;
        }
	      if(root.data==x){
            return true;
        }
  for(int i=0;i<root.children.size();i++){
      if(checkIfContainsX(root.children.get(i),x)){
          return true;
      }
  }
  return false;
}

	public static void               postOrder(TreeNode<Integer> root){
		   if(root==null){
	           return ;
	       }
	        for(int i=0;i<root.children.size();i++){
	            postOrder(root.children.get(i));
	        }
	       System.out.print(root.data+" ");
	    }
	
	public static int                numNodeGreater(TreeNode<Integer> root,int x){
        if(root==null){
            return 0;
        }         
    int count=0;
    if(root.data>x){
        count++;
    }
    int i;
    for(i=0;i<root.children.size();i++){
        count=count+numNodeGreater(root.children.get(i), x);
    }
    return count;
}
   
	public static int                max(TreeNode<Integer> root){
        int maxsum=root.data;
          for(int i = 0;i<root.children.size();i++){
           maxsum=maxsum+root.children.get(i).data;
            }
          return maxsum;
  }
   
    public static TreeNode<Integer>  maxSumNode(TreeNode<Integer> root){
       if(root==null){
         return null;
       }
      int rootsum=max(root);
      TreeNode<Integer> max=root;
      TreeNode<Integer> child;
      int childsum;
      for(int i=0;i<root.children.size();i++){
          child=maxSumNode(root.children.get(i));
          childsum=max(root.children.get(i));
          if(childsum>rootsum){
              max=child;
          }   
       }
       return max;
  }

    public static boolean            checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){ 
      if(root1 == null && root2 == null) 
          return true;
      if(root1 == null || root2 == null){ 
          return false;
      }
      if(!root1.data.equals(root2.data))
      { return false; }
      if(root1.children.size() != root2.children.size())
      { return false; } 
      for(int i = 0; i < root1.children.size(); i++){ 
          if(!checkIdentical(root1.children.get(i), root2.children.get(i))){ 
              return false; 
          }
      }
      return true;
  }
 
    public static TreeNode<Integer>  findNextLargerNode(TreeNode<Integer> root, int n){
		if(root==null){
          return null;
      }
      int rootdata=Integer.MIN_VALUE;        
      TreeNode<Integer> ansnode=null;
      if(root.data>n){
          rootdata=root.data;
          ansnode=root;
      }
      for(int i=0;i<root.children.size();i++){
          TreeNode<Integer> childnode=findNextLargerNode(root.children.get(i),n);
          if(childnode!=null  )
          {
              int childdata=childnode.data;
              if(childdata>n && (childdata<rootdata || rootdata==Integer.MIN_VALUE)){
                 ansnode=childnode;   
                 rootdata=childdata;
              }
          }
      }
      return ansnode;
	}
	
    public static void               replaceWithDepthValue(TreeNode<Integer> root){
	    if(root == null) {
	        return;
	    } 
	    QueueUsingLL<TreeNode<Integer>> q = new QueueUsingLL<TreeNode<Integer>>();
	    TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE); 
	    q.enqueue(root); 
	    q.enqueue(nullNode); 
	    root.data=0;
	    int ans=1;    
	    while(q.size()!=1) {
	        TreeNode<Integer> temp= null; 
	        try { 
	            temp = q.dequeue(); 
	        }
	        catch (QueueEmptyException e){}
	        
	        if(temp==nullNode) { 
	            ans++;
	            q.enqueue(nullNode); 
	          } 
	        for(int i = 0;i<temp.children.size();++i) {
	            temp.children.get(i).data=ans; 
	            q.enqueue(temp.children.get(i)); 
	        }
	    }
	    }
	
    public static int                largest(TreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		
		int ans = root.data;
		for (int i = 0; i < root.children.size(); i++) {	
			int childLargest = largest(root.children.get(i));
			if (childLargest > ans) {
				ans = childLargest;
			}
		}
		return ans;
	}
	
	public static int                countLeafNodes(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
        if(root.children.size()==0){
            return 1;
        }
        int i;
        int count=0;
        for(i=0;i<root.children.size();i++){
           count=count+countLeafNodes(root.children.get(i));
        }
        return count;
	}

	public static int                sumOfAllNode(TreeNode<Integer> root){
        if(root==null){
            return 0;
        }
      int count=root.data;
      int childs=root.children.size();
      int i;
        for(i=0;i<childs;i++){
            count+=sumOfAllNode(root.children.get(i));
    }
    return count;
   }
	
	public static int                height(TreeNode<Integer> root){
        if(root==null){
              return 0;
              }
          int i;
          int max=0;
          int childheight=0;
          for(i=0;i<root.children.size();i++){
           
              childheight=height(root.children.get(i));
          
              if(max<childheight){
              max=childheight;
              } 
          }
        return max+1;
    }

    public static int                numNodes(TreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int count = 1;
		for (int i = 0; i < root.children.size(); i++) {
			count += numNodes(root.children.get(i));
		}
		return count;
	}
	
	public static TreeNode<Integer>  takeInput(Scanner s) {
		int n;
		System.out.println("Enter next node data");
		n = s.nextInt();
		TreeNode<Integer> root = new TreeNode<Integer>(n);
		System.out.println("Enter number of children for " + n);
		int childCount = s.nextInt();
		for (int i = 0; i < childCount; i++) {
			TreeNode<Integer> child = takeInput(s);
			root.children.add(child);
		}
		return root;
	}
	
	public static void               print(TreeNode<Integer> root) {
		String s = root.data + ":";
		for (int i = 0; i < root.children.size(); i++) {
			s = s + root.children.get(i).data + ",";
		}
		System.out.println(s);
		for (int i = 0; i < root.children.size(); i++) {
			print(root.children.get(i));
		}
	}
	 
    public static void               printLevelWise(TreeNode<Integer> root){ 
		    if(root == null) {
		        return;
		    } 
		    QueueUsingLL<TreeNode<Integer>> q = new QueueUsingLL<TreeNode<Integer>>();
		    TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE); 
		    q.enqueue(root); 
		    q.enqueue(nullNode); 
		    System.out.println(root.data); 
		    while(q.size()!=1) {
		        TreeNode<Integer> temp= null; 
		        try { 
		            temp = q.dequeue(); 
		        }
		        catch (QueueEmptyException e)
		        {}
		        if(temp==nullNode) { 
		            q.enqueue(nullNode); 
		            System.out.println();
		          } 
		        for(int i = 0;i<temp.children.size();++i) {
		            System.out.print(temp.children.get(i).data+" "); 
		            q.enqueue(temp.children.get(i)); 
		        }
		    }
		}
	
    public static TreeNode<Integer>  takeInputLevelWise() {
		@SuppressWarnings("resource")
		Scanner s= new Scanner(System.in);
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		QueueUsingLL<TreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		TreeNode<Integer> root = new TreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			try {
				TreeNode<Integer> frontNode = pendingNodes.dequeue();
				System.out.println("Enter num of children of " + frontNode.data);
				int numChildren = s.nextInt();
				for (int i = 0; i < numChildren; i++) {
					System.out.println("Enter " + (i + 1) + "th child of " + frontNode.data);
					int child = s.nextInt();
					TreeNode<Integer> childNode = new TreeNode<Integer>(child);
					frontNode.children.add(childNode);
					pendingNodes.enqueue(childNode);
				}
			} catch (QueueEmptyException e) {
				// Shouldn't come here
				return null;
			}
		}
		return root;
	}
	
	public static void main(String[] args) {
//		Scanner s= new Scanner(System.in);
//		
//		TreeNode<Integer> root = takeInput(s);
//		TreeNode<Integer> root = takeInputLevelWise();
//		print(root);
//		System.out.println(largest(root));
//		System.out.println(numNodes(root));
//		//printAtK(root, 2);
//		preorder(root);
//		System.out.println();
	}
}
