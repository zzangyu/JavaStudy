package Array_ArrayList;

import java.math.BigDecimal;


public class StudentRunner2 {

	public static void main(String[] args) {

		Student2 student = new Student2 ("Ranga", 97, 98, 99);
		Student2 student1 = new Student2 ("Adam", 98, 99);
		Student2 student2 = new Student2 ("Eve", 97, 98, 99, 70);
		
		
		int number = student.getNumberOfMarks();
		System.out.println("number of marks: "+number);
		
		int sum = student.getTotalSumOfMarks();
		System.out.println("Total sum of makrs: "+sum);
		
		int maximumMark = student.getMaximumMark();
		System.out.println("MaximumMark of marks: "+maximumMark);
		
		int minimumMark = student.getMinimumMark();
		System.out.println("MinimumMark of marks: "+minimumMark);
		
		BigDecimal average = student.getAverageMarks();
		System.out.println("average: "+average);
		
		int[] mark = {1, 2, 3};
		int[] newmark = {mark.length+1};
		// 뭐.. 이렇게 해야된대요..
	
		
	}

}
