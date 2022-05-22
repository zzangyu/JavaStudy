package Array_ArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;
		
		for(int mark:marks) {
			this.marks.add(mark);
		}
	
	}

	public int getNumberOfMarks() {
		return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for(int mark : marks) {
			sum += mark;
		}
		return sum;
	}

	public int getMaximumMark() {
//		int  maximum = Integer.MIN_VALUE;
//		for(int mark : marks) {
//			if(mark>maximum) {
//			maximum = mark;
//			}
//		}
		
		return Collections.max(marks); 
		
	}

	public int getMinimumMark() {
//		int minimum = Integer.MAX_VALUE;
//		for(int mark : marks) {
//			if(mark<minimum) {
//			minimum = mark;
//			}
//		}
		return Collections.min(marks);
	}	

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();
		return new BigDecimal(sum).divide(new BigDecimal(number), 5, RoundingMode.UP);
	}
	
	public String toString() {
		return name+marks;
	}
	
}
