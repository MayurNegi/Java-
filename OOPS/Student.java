package OOPS;

public class Student {
	
	public String name ;
	final int rollNumber ;
	final static double CONVERSIONFACTOR = 0.95 ; // static has only one copy of memory for every object
	// final does not let to change its value ever again
	private static int numStudents ; // static belong to class.it is shared by all objects'
	
	public Student(String name , int num) {
		this.name = name;
		rollNumber = num ;
		numStudents++ ;
	}
	
	public static int getNumStudent() {
//		System.out.println(rollNumber); // not static properties can not be used in static constructors.
		return numStudents;
	}
	
	public void print(){
		System.out.println( name +" "+ rollNumber);
	}
	
}
