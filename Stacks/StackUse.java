package Stacks;

public class StackUse {

	public static void main(String[] args) throws StackEmptyException, StackFullExpception {
		
		StackUsingArray stack = new StackUsingArray() ;
		int arr[] = {1 ,3 ,5 ,7,9} ;
		
		for(int i=0; i < arr.length; i++)
		{
			stack.push(arr[i]);
		}
		
		while(!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
//		stack.push(10) ;
//		System.out.println(stack.top());
//		stack.pop();
//		
	}

}
