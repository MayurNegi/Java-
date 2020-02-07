package fundamentals;

//import java.util.Scanner;

public class dump {
	
	
	public static void main(String args[]) 
	{ 
	    String str1 = new String ("I love coding"); 
	    String str2 = "I love coding"; 
	    boolean check=(str1=="I love coding");
	    System.out.println((str1 == str2) + " " + str1.equals(str2)+" " + check); 
	}
		


	
//	public static void main(String[] args) {
//		// Write your code here
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		int i = 2;
//		while (i < n) {
//			if (n % i == 0) {
//				System.out.print(i);
//			}
//			i = i + 1;
//		}
//
//	}
}
//		public static void main(String args[]) {
//			int a = 10;
//			while (a > 5) {
//				int b = 1;
//				System.out.print(b + " ");
//				a--;
//			}
//		}
//}

// public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//
//		int n = s.nextInt();
//
//		int div = 2;
//		// boolean isprime = true ;
//		while (div < n / 2) {
//
//			if (n % div == 0) {
//				System.out.println("composite");
//				return;
//			}
//			div = div+1 ;
//		}
//		System.out.println("prime");
//	}
