package LinkedList;

import java.util.* ;

public class LinkedListUse {

	public static Node<Integer> createLinkedList() {
		
		Node<Integer> n1 = new Node<>(10) ;
		Node<Integer> n2 = new Node<>(20) ;
		Node<Integer> n3 = new Node<>(30) ;
		Node<Integer> n4 = new Node<>(40) ;
		n1.next = n2 ;
		n2.next = n3;
		n3.next = n4;
		return n1 ;
	}
	
	public static Node<Integer> takeInput() {
		
		Scanner s = new Scanner(System.in) ;
		int data = s.nextInt() ;
		Node <Integer> head = null;
	
		while( data != -1)
		{
			Node<Integer> currentNode = new Node<Integer>(data) ;
			if(head == null) {
				head = currentNode;
			}
			else {
				Node<Integer> tail = head ;
				while(tail.next != null) {
					tail = tail.next ;
				}
				tail.next = currentNode ;
			}
			data = s.nextInt() ;
		}
		return head ;
	}
	
public static Node<Integer> takeInput2() {
		
		Scanner s = new Scanner(System.in) ;
		int data = s.nextInt() ;
		Node <Integer> head = null;
		Node<Integer> tail = null ;
		
		while( data != -1)
		{
			Node<Integer> currentNode = new Node<Integer>(data) ;
			if(head == null) {
				head = currentNode;
			}
			else {
				tail.next = currentNode ;
				tail = currentNode ;
			}
			
			data = s.nextInt() ;
		}
		return head ;
	}
	
	public static void increment(Node<Integer> head) {
		 while(head != null)
		 {
			 head.data++ ;			 
		 }
	}
	
	public static void print(Node<Integer> head) {
//		System.out.println(head.data) ;
//		System.out.println(head.next) ; // 2nd element address
//		System.out.println(head.next.data) ; // pointing to data of 2nd element address data
//		System.out.println(head.next.next.data) ;
		
		 while(head != null)
		 {
			 System.out.println(head.data);
			 head = head.next ;
		 }	 
	}

	public static Node<Integer> removeDuplicates(Node<Integer> head) {
        
        if(head == null){
            return null ;
        }
        
        Node<Integer> current = head ;
        while(current.next != null)
        {
            if(current.data == current.next.data) {
                Node<Integer> nextNode = current.next.next ;
                current.next = nextNode ;
            } 
            else{
                current = current.next ;
            }
        }
        return head ;
    }
	
	  public static Node<Integer> reverse(Node<Integer> head) {
	        
	        Node<Integer> prev = null , next = null , current = head ;
	        while(current != null )
	        {
	            next = current.next ;
	            current.next = prev ;
	            prev = current ;
	            current = next ;
	        }
	        return prev;
	    } 
	
	public static void main(String[] args) {
		
		Node<Integer> head = takeInput() ;
		head = reverse(head) ;
		print(head) ;
//		Node<Integer> n1 = new Node<>(10) ;
//		System.out.println(n1.data);
//		System.out.println(n1.next); 
		
	}

}
