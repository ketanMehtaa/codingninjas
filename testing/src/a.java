import binarysearchtree.BinaryTreeNode;

public class a {

	private BinaryTreeNode<Integer> root;
	
	private BinaryTreeNode<Integer> insertData(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
			return newNode;
		}
		if (root.data > data) {
			root.left = insertData(data, root.left);
		} else {
			root.right = insertData(data, root.right);
		}
		return root;
	}
	
	public void insertData(int data) {
		root = insertData(data, root);
	}
	
	public void deleteData(int data) {
		root = deleteData(data, root);
	}
	
	private BinaryTreeNode<Integer> deleteData(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			return null;
		}
		if (data < root.data) {
			root.left = deleteData(data, root.left);
			return root;
		} else if (data > root.data) {
			root.right = deleteData(data, root.right);
			return root;
		} else {
			if (root.left == null && root.right == null) {
				return null;
			} else if (root.left == null) {
				return root.right;
			} else if (root.right == null) {
				return root.left;
			} else {
				BinaryTreeNode<Integer> minNode = root.right;
				while (minNode.left != null) {
					minNode = minNode.left;
				}
				root.data = minNode.data;
				root.right = deleteData(minNode.data, root.right);
				return root;
			}
		}
		
	}

	private void printTree(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		String toBePrinted = root.data + "";
		if (root.left != null) {
			toBePrinted += "L:" + root.left.data + ",";
		}
		
		if (root.right != null) {
			toBePrinted += "R:" + root.right.data;
		}
		System.out.println(toBePrinted);
		printTree(root.left);
		printTree(root.right);
	}
	
	public void printTree() {
		printTree(root);
	}
	
	private boolean hasDataHelper(int data, BinaryTreeNode<Integer> root) {
		if (root == null) {
			return false;
		}
		
		if (root.data == data) {
			return true;
		} else if (data > root.data) {
			// call right
			return hasDataHelper(data, root.right);
		} else {
			// call left
			return hasDataHelper(data, root.left);
		}
	}
	
	public boolean hasData(int data) {
		return hasDataHelper(data, root);
	}
}
