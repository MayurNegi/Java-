package Stacks;

public class StackUsingArray {

	private int data[] ;
	private int topIndex ;
	
	public StackUsingArray() {
		data = new int[10] ;
		topIndex = -1 ;
	}
	
	public StackUsingArray(int size) {
		data = new int[size] ;
		topIndex = -1 ;
	}
	
	public int size() {				// O(1)
		return topIndex + 1 ;
	}
	
	public boolean isEmpty() {
		if(topIndex == -1)
			return true ;
		
		else
			return false ;
	}
	
	public void push(int elem) throws StackFullExpception {
		// If stack is full
		if(topIndex == data.length - 1) {
			// Throw exception
//			StackFullExpception e = new StackFullExpception() ;
//			throw e;
//			throw new StackFullExpception() ;
			doubleCapacity() ;
		}
		data[++topIndex] = elem ;
	}
	
	private void doubleCapacity() {
		int temp[] = data ;
		data = new int[2 * temp.length] ;
		for(int i=0; i<temp.length; i++)
		{
			data[i] = temp[i] ;
		}
	}
	
	public int top() throws StackEmptyException {
		if(topIndex == -1) {
			// throw atackEmptyException
			throw new StackEmptyException() ;
		}
		return data[topIndex] ;
	}
	
	public int pop() throws StackEmptyException {
		if(topIndex == -1) {
			// throw stackEmptyException
			throw new StackEmptyException() ;
		}
		int temp = data[topIndex] ;
		topIndex-- ;
		return temp ;
	}
	
}
