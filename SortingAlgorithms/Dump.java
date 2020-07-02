package SortingAlgorithms;


class Node<T> {
	  T data;
	  Node<T> next;
	  Node(T data){
	    this.data = data;
	  }
	}

public class Dump {
    public static void main (String[] args) {
        Node<Integer> list=new Node<Integer>();
        for(int i=2;i<=5;i++)
        {
            list.add(i*i);
        }
        System.out.print(list.poll()+" "+list.poll());
    }
		
}
