package binarysearchtree;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class BinaryTreeUse {

	public static void printTree(BinaryTreeNode<Integer> root) {
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
	
	public static BinaryTreeNode<Integer> takeInput(Scanner s) {
		int rootData;
		System.out.println("Enter root data");
		rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		root.left = takeInput(s);
		root.right = takeInput(s);
		return root;
	}
	
	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner s = new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter root data");
		int rootData = s.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> front;
			try {
				front = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter left child of " + front.data);
			int leftChild = s.nextInt();
			if (leftChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftChild);
				pendingNodes.enqueue(child);
				front.left = child;
			}
			
			System.out.println("Enter right child of " + front.data);
			int rightChild = s.nextInt();
			if (rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);
				front.right = child;
			}
		}
		return root;
	}
	
	public static int countNodes(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int ans = 1;
		ans += countNodes(root.left);
		ans += countNodes(root.right);
		return ans;
	}
	
	public static void mirror(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		mirror(root.left);
		mirror(root.right);
		BinaryTreeNode<Integer> temp = root.left;
		root.left = root.right;
		root.right = temp;
		return;
	}
	
	public static int diameter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		
		int option1 = height(root.left) + height(root.right);
		int option2 = diameter(root.left);
		int option3 = diameter(root.right);
		return Math.max(option1, Math.max(option2, option3));
	}
	
	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		}
		int lh = height(root.left);
		int rh = height(root.right);
		return 1 + Math.max(lh, rh);
	}

	public static Pair<Integer, Integer> heightDiameter(BinaryTreeNode<Integer> root) {
		if (root == null) {
			Pair<Integer,Integer> output = new Pair<>();
			output.first = 0;
			output.second = 0;
			return output;
		}
		Pair<Integer, Integer> lo = heightDiameter(root.left);
		Pair<Integer, Integer> ro = heightDiameter(root.right);
		int height = 1 + Math.max(lo.first, ro.first);
		int option1 = lo.first + ro.first;
		int option2 = lo.second;
		int option3 = ro.second;
		int diameter = Math.max(option1, Math.max(option2, option3));		
		Pair<Integer,Integer> output = new Pair<>();
		output.first = height;
		output.second = diameter;
		return output;
	}
	
	public static void inorder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		inorder(root.left);
		System.out.print(root.data + " ");
		inorder(root.right);
	}
	
	public static BinaryTreeNode<Integer> buildTreeHelper(int in[], int pre[], int inS, int inE, int preS, int preE) {
		if (inS > inE) {
			return null;
		}
		int rootData = pre[preS];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		int rootInIndex = -1;
		for (int i = inS; i <= inE; i++) {
			if (in[i] == rootData) {
				rootInIndex = i;
				break;
			}
		}
		if (rootInIndex == -1) {
			return null;
		}
		
		int leftInS = inS;
		int leftInE = rootInIndex - 1;
		int leftPreS = preS + 1;
		int leftPreE = leftInE - leftInS + leftPreS;
		int rightInS = rootInIndex + 1;
		int rightInE = inE;
		int rightPreS = leftPreE + 1;
		int rightPreE = preE;
		root.left = buildTreeHelper(in, pre, leftInS, leftInE, leftPreS, leftPreE);
		root.right = buildTreeHelper(in, pre, rightInS, rightInE, rightPreS, rightPreE);
		return root;
	}
	
	public static BinaryTreeNode<Integer> buildTree(int in[], int pre[]) {
		return buildTreeHelper(in, pre, 0, in.length - 1, 0, pre.length -1);
	}
	
	public static BinaryTreeNode<Integer> searchInBST(BinaryTreeNode<Integer> root, int q) {
		if (root == null) {
			return null;
		}
		if (root.data == q) {
			return root;
		} else if (root.data > q) {
			return searchInBST(root.left, q);
		} else {
			return searchInBST(root.right, q);
		}
	}
	
	public static void printBetweenK1K2(BinaryTreeNode<Integer> root, int k1, int k2) {
		if (root == null) {
			return;
		}
		if (root.data >= k1 && root.data <= k2) {
			System.out.println(root.data);
		}
		
		if (root.data > k1) {
			printBetweenK1K2(root.left, k1, k2);
		}
		
		if (root.data <= k2) {
			printBetweenK1K2(root.right, k1, k2);
		}
		
	}
	
	public static int minimum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MAX_VALUE;
		}
		return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
	}
	
	public static int maximum(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
	}
	
	public static boolean isBST(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		int leftMax = maximum(root.left);
		int rightMin = minimum(root.right);
		if (root.data <= leftMax) {
			return false;
		}
		
		if (root.data > rightMin) {
			return false;
		}
		boolean isLeftBST = isBST(root.left);
		boolean isRightBST = isBST(root.right);
		if (isLeftBST && isRightBST) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Pair<Boolean, Pair<Integer, Integer>> isBST2(BinaryTreeNode<Integer> root) {
		if (root == null) {
			Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
			output.first = true;
			output.second = new Pair<Integer, Integer>();
			output.second.first = Integer.MAX_VALUE;
			output.second.second = Integer.MIN_VALUE;
			return output;
		}
		Pair<Boolean, Pair<Integer, Integer>> leftOutput = isBST2(root.left);
		Pair<Boolean, Pair<Integer, Integer>> rightOutput = isBST2(root.right);
		int min = Math.min(root.data, Math.min(leftOutput.second.first, rightOutput.second.first));
		int max = Math.max(root.data, Math.max(leftOutput.second.second, rightOutput.second.second));
		boolean isBST = (root.data > leftOutput.second.second) 
				&& (root.data <= rightOutput.second.first)
				&& leftOutput.first && rightOutput.first;
		Pair<Boolean, Pair<Integer, Integer>> output = new Pair<Boolean, Pair<Integer, Integer>>();
		output.first = isBST;
		output.second = new Pair<Integer, Integer>();
		output.second.first = min;
		output.second.second = max;
		return output;
	}
	
	public static boolean isBST3(BinaryTreeNode<Integer> root, int min, int max) {
		if (root == null) {
			return true;
		}
		if (root.data < min || root.data > max) {
			return false;
		}
		boolean isLeftOk = isBST3(root.left, min, root.data - 1);
		boolean isRightOk = isBST3(root.right, root.data, max);
		return isLeftOk && isRightOk;
	}
	
	public static ArrayList<Integer> getRootToNodePath(BinaryTreeNode<Integer> root, int data) {
		if (root == null) {
			return null;
		}
		
		if (root.data == data) {
			ArrayList<Integer> output = new ArrayList<>();
			output.add(root.data);
			return output;
		}
		
		ArrayList<Integer> leftOutput = getRootToNodePath(root.left, data);
		if (leftOutput != null) {
			leftOutput.add(root.data);
			return leftOutput;
		}
		
		ArrayList<Integer> rightOutput = getRootToNodePath(root.right, data);
		if (rightOutput != null) {
			rightOutput.add(root.data);
			return rightOutput;
		} else {
			return null;
		}
		
	}
	
	public static void main(String[] args) {
//		BinaryTreeNode<Integer> root = takeInputLevelWise();
//		printTree(root);
		BinarySearchTree bst = new BinarySearchTree();
		bst.insertData(10);
		bst.insertData(20);
		bst.insertData(5);
		bst.insertData(15);
		bst.insertData(3);
		bst.insertData(7);
		bst.printTree();
		bst.deleteData(10);
		bst.printTree();
	}
}
