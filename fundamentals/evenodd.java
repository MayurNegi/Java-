package fundamentals;

import java.util.Scanner;

public class evenodd {
	
	public static void main(String args[]) {
	int a;
	Scanner s = new Scanner(System.in);
	a = s.nextInt();
	
	if(a%2 == 0) {
		System.out.println("number is even");
		
	}
	else
	{
		System.out.println( "odd");
	}

}
}
