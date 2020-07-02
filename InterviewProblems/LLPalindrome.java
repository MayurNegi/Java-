package InterviewProblems;

class Node<T>  {
	T data;
	Node<T> next;
}

public class LLPalindrome {

	public static Node<Integer> checkPalindrome(Node<Integer> head, Node<Integer> reverseHead) {
	
		// returning null case is our delimiter
		if(head == null) {
			return reverseHead ;
		}
		
		Node<Integer> head1 = checkPalindrome(head.next, reverseHead);
		
		if(head1 != null) {
			return null ;
		}
		
		if(head.data.equals(head1.data)) {
			if(head == reverseHead) {
				return head ;
			}
			return head1.next ;
		}else {
			return null ;
		}
	}
	
	public static void main(String args[]) {
		
		Node<Integer> ans = checkPalindrome(head, head);
		if(ans == null) {
			System.out.println("false");
		}else {
			System.out.println("true");
		}
		
	}
	
}
