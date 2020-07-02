package LinkedList;

import java.util.* ;

public class InsertNodeRecursiely {

	public static Node<Integer> takeInput() {
		
		Node<Integer> head = null ;
		Node<Integer> tail = null ;
		
		Scanner s = new Scanner(System.in) ;
		int data = s.nextInt() ;
		
		while(data != -1)
		{
			Node<Integer> current = new Node<Integer>(data) ;
			if(head == null) {
				head = current ;
				tail = current ;
			}
			else {
				tail.next = current ;
				tail = current ;
			}
			data = s.nextInt();
		}
		return head ;
	}
	
	public static void print(Node<Integer> head) {
		 while(head != null)
		 {
			 System.out.println(head.data);
			 head = head.next ;
		 }	 
	}

	
	public static Node<Integer> insertNodeRecursive(Node<Integer> head, int data, int pos){

		if(head == null && pos > 0) {
			return head ;
		}
		
		if(pos == 0) {
			Node<Integer> newNode = new Node<Integer>(data) ;
			newNode.next = head;
			return newNode;
		}
		else {
		
		Node<Integer> smallHead= insertNodeRecursive(head.next ,data, pos - 1) ;
		
		head.next = smallHead ;
		return head;

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> head = takeInput() ;
		Node<Integer> newHead = insertNodeRecursive(head, 20 , 2) ;
		print(head) ;
	}

}
