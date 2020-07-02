package InterviewProblems;

import java.util.*;

public class EmployeeChild {

	class Employee{
		char name;
		ArrayList<Tube> tubes;
	}
	
	class Tube{
		int time;
		int child;
	}
	
	public static int totalTime(Employee root) {
		
		if(root == null) {
			return 0;
		}
		
		int maxTime = 0;
		for(int i = 0; i < root.tubes.size(); i++)
		{
			int childTime = totalTime(root.tubes.get(i).child);
			int currTime = root.tubes.get(i).time + childTime;
			if(currTime > maxTime) {
				maxTime = currTime;
			}
		}
		return maxTime;
		
	}
	
	public static void main(String[] args) {
		
		
		
	}

}
