package BinaryTrees;

public class BST {

	private BinaryTreeNode<Integer> root ;
	private int size ;
	
	private static boolean isPresentHelper(BinaryTreeNode<Integer> root, int x) {
		if(root == null)
			return false;
		
		if(root.data == x) {
			return true ;
		}
		
		if (x < root.data) {
			return isPresentHelper(root.left, x) ;
		}
		else {
			return isPresentHelper(root.right, x) ;
		}
	}
	
	public boolean isPresent(int x) {
		return isPresentHelper(root , x) ;
	}
	
	public int size() {
		return size;
	}
	
	public BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(x) ;
			return newNode ;
		}
		
		if(x < root.data) {
			root.left = insertHelper(root.left, x) ;
		}
		else {
			root.right = insertHelper(root.right , x) ;
		}
		
		return root ;
	}
	
	public void insert(int x) {
		root = insertHelper(root, x) ;
	}
	
	private static int minimum(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return Integer.MAX_VALUE ;
		}
		
		int left = minimum(root.left) ;
		int right = minimum(root.right);
		
		return Math.min(root.data, Math.min(left, right)) ;
	}
	
	private static BSTDeleteReturn deleteDataHelper(BinaryTreeNode<Integer> root, int x) {
		if(root == null) {
			return new BSTDeleteReturn(null, false) ;
		}
		
		if(root.data < x) {
			BSTDeleteReturn outputRight = deleteDataHelper(root.right , x) ;
			root.right = outputRight.root ;
			outputRight.root = root ;  // changing the outputRight to return ,
			return outputRight ;   // instead of creating a new BSTDeleteReturn object 
		}
		
		if(root.data > x) {
			BSTDeleteReturn outputLeft = deleteDataHelper(root.left , x) ;
			root.left = outputLeft.root ;
			outputLeft.root = root ;  // changing the outputRight to return ,
			return outputLeft ;   // instead of creating a new BSTDeleteReturn object 
		}
		
		// o children 
		if (root.left == null && root.right == null) {
			return new BSTDeleteReturn(null, true) ;
		}
		// only left child
		if(root.left != null && root.right == null) {
			return new BSTDeleteReturn(root.left, true) ;
		}
		// only right child
		if(root.left == null && root.right != null) {
			return new BSTDeleteReturn(root.right, true) ;
		}
		
		// both children are present
		int rightMin = minimum(root.right) ;
		root.data = rightMin ;
		BSTDeleteReturn outputRight = deleteDataHelper(root.right, rightMin) ;
		root.right = outputRight.root ;
		return new BSTDeleteReturn(root, true) ;
	}
	
	public boolean deleteData(int x) {
		BSTDeleteReturn output =  deleteDataHelper(root, x) ;
		root = output.root ;
		if(output.deleted ) {
			size-- ;
		}
		return output.deleted ;
	}
	
	private static void printTreeDetailed(BinaryTreeNode<Integer> root) {
		if(root == null) {
			return ;
		}
		System.out.print(root.data + ":") ;
		if(root.left != null) {
			System.out.print("L" + root.left.data);
		}
		if(root.right != null) {
			System.out.print(", R" + root.right.data);
		}
		System.out.println();
		
		printTreeDetailed(root.left) ;
		printTreeDetailed(root.right) ;
		
	}
	
	public void printTree() {
		printTreeDetailed(root) ;
	}
	
}
