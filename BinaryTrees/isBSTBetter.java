package BinaryTrees;


public class isBSTBetter {

	public static isBSTReturn isBST2(BinaryTreeNode<Integer> root) {
		
		if(root == null) {
			isBSTReturn ans = new isBSTReturn(Integer.MIN_VALUE, Integer.MAX_VALUE, true) ;
			return ans ;
		}
		
		isBSTReturn leftAns = isBST2(root.left) ;
		isBSTReturn rightAns = isBST2(root.right) ;
	
		int min = Math.min(root.data, Math.min(leftAns.min, rightAns.min)) ;
		int max = Math.min(root.data, Math.max(leftAns.max, rightAns.max)) ;
	    boolean isBST = true ;  	
		
	    if(leftAns.max >= root.data) {
	    	isBST = false ;
	    }
	    
	    if(rightAns.min < root.data) {
	    	isBST = false ;
	    }
	    
	    if(!leftAns.isBST) {
	    	isBST = false ;
	    }
	    
	    if(!rightAns.isBST) {
	    	isBST = false ;
	    }
	    
	    isBSTReturn ans = new isBSTReturn(min, max, isBST) ;
	    return ans ;
	}
	
	public static boolean isBST3(BinaryTreeNode<Integer> root , int minLimit, int maxLimit) {
		
		if(root == null) {
			return true ;
		}
		
		if(root.data < minLimit || root.data > maxLimit) {
			return false ;
		}
		
		boolean isLeft = isBST3(root.left, minLimit, root.data - 1) ;
		boolean isRight = isBST3(root.right, root.data, maxLimit) ;
		
		return isLeft && isRight ;
		
	}
	
	public static void main(String[] args) {
		
		

	}

}
