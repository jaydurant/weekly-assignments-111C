import java.util.*;
public class PercentGrade {
	private static final int  GRADE_NUMBER = 5;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float grade = 0;
		int count = 0;
		while(count < GRADE_NUMBER) {
			System.out.println("Enter Grade " + (count + 1) );
			grade += input.nextFloat();
			count++;
		}
		
		float gradeAverage = grade / 5;

		if(gradeAverage >= 90 ) 
			System.out.println("Grade " + gradeAverage + " - E");
		else if(gradeAverage >= 80) 
			System.out.println("Grade " + gradeAverage + " - A");
		else if(gradeAverage >= 70) 
			System.out.println("Grade " + gradeAverage + " - B");
		else if(gradeAverage >= 60) 
			System.out.println("Grade " + gradeAverage + " - C");
		
		else if(gradeAverage >= 50) 
			System.out.println("Grade " + gradeAverage + " - D");
		else 
			System.out.println("Grade " + gradeAverage + " - F");
		
	}

}
