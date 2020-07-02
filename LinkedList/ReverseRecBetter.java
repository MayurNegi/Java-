package LinkedList;

import java.util.Scanner;

class DoubleNode{
	Node<Integer> head;
	Node<Integer> tail ;
	DoubleNode(){
		
	}
	DoubleNode(Node<Integer> head ,Node<Integer> tail) {
		this.head = head ;
		this.tail = tail ;
	}
}

public class ReverseRecBetter {
	
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
	
	public static DoubleNode reverseRecBetter(Node<Integer> head) {
		
		DoubleNode ans ;
		if(head == null || head.next == null) {
			ans = new DoubleNode() ;
			ans.head = head ;
			ans.tail = head ;
			return ans ;
		}
		// this double node will have head and tail of reverse 
		DoubleNode revHead = reverseRecBetter(head.next) ;
		
		revHead.tail.next = head;
		head.next = null ;
		ans = new DoubleNode() ;
		ans.head = revHead.head ;
		ans.tail = head ;
		return ans ;
	}
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput() ;
		DoubleNode revhead = reverseRecBetter(head) ;
		print(revhead.head) ;
	}

}
