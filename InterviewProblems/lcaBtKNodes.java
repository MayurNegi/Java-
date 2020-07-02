package InterviewProblems;

import java.util.* ;

class BinaryTreeNode<T> {
	T data ;
	BinaryTreeNode<T> left;
	BinaryTreeNode<T> right;
}

public static void storeWidth(BinaryTreeNode<Integer> root,HashMap<Integer,Integer> widthMap, int width,HashSet<Integer> widthSet) {
	
	if(widthMap.containsKey(root.data)) {
		if(widthSet.contains(width)) {
			widthMap.put(root.data,width) ;
			widthSet.add(width);
		}	
	}
	
	storeWidth(root.left, widthMap, width-1,widthSet);
	storeWidth(root.right, widthMap, width+1,widthSet);
}

public static BinaryTreeNode<Integer> lcaBtK(BinaryTreeNode<Integer> root, ArrayList<Integer> arr) {
	
	HashMap<Integer,Integer> widthMap = new HashMap<>() ;
	HashSet<Integer> widthSet = new HashSet<>() ;
	for(int i = 0; i < arr.size(); i++)
		widthMap.put(arr.get(i), 0) ;
	
}

public class lcaBtKNodes {

}
