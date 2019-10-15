/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		BinarySearchTree bst=new BinarySearchTree();
		for(int i=0;i<n;i++){
		    String arr=br.readLine();
		    StringTokenizer st=new StringTokenizer(arr," ");
		    char c=st.nextToken().charAt(0);
		    int key=Integer.parseInt(st.nextToken());
		    if(c=='i')
		        bst.insert(key,1);
		    else if(c=='d')
		        bst.delete(key);
		}
	}
}
class Node{
    int data;
    int pos;
    Node left,right;
    Node(int data,int pos){
        this.data=data;
        this.pos=pos;
        left=right=null;
    }
}
class BinarySearchTree{
    Node root;
    BinarySearchTree(){
        root=null;
    }
    void insert(int key,int pos){
        root=insertKey(root,key,pos);
    }
    Node insertKey(Node root,int key,int pos){
        if(root==null){
            root=new Node(key,pos);
            System.out.println(pos);
            return root;
        }
        if(key<=root.data){
            root.left=insertKey(root.left,key,2*pos);
        }else if(key>root.data){
            root.right=insertKey(root.right,key,2*pos+1);
        }
        return root;
    }
    void delete(int key){
        root=deleteKey(root,key);
    }
    Node deleteKey(Node root,int key){
        if(root.data==key){
            System.out.println(root.pos);
            if(root.right==null)
                return root.left;
            else if(root.left==null)
                return root.right;
            
            root.data=min(root.right);
            root.right=deleteKey(root.right,root.data);
        }else if(key<=root.data)
        root.left=deleteKey(root.left,key);
        else if(key>root.data)
        root.right=deleteKey(root.right,key);
        return root;
    }
   int min(Node root){
        Node node=root;
        while(node.left!=null){
            node=node.left;
        }
        return node.data;
    }
}
