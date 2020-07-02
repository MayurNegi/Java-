package OOPS;

public class StudentUse {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("mayur",20 ) ;
		s1.print() ;
		
		Student s2 = new Student("tom" ,25) ;
		s2.print() ;
		
		System.out.println(Student.getNumStudent()); // should be accessed by class 
//		System.out.println(s2.numStudents);
		
	}
	
}
 