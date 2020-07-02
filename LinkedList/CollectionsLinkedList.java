package LinkedList;

import java.util.LinkedList;

public class CollectionsLinkedList {

	public static void main(String[] args) {
		
		LinkedList<Integer> list = new LinkedList<>() ; 
		// LinkedList is used for declarationf of java's own class of doubly LL containing various functions.
		list.add(10) ;
		list.add(20) ;
		list.add(30) ;
		list.add(1 , 100) ;
		list.set(0 , 60) ;
		list.remove();
		// list.remove(index) ;
		System.out.println(list.get(1));
		System.out.println(list.size());
		
		for(int i=0; i < list.size() ; i++)
		{
			System.out.print(list.get(i) + " ");
		}
	
	}

}
