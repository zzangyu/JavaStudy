package Array_ArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Student2 {

		private String name;
		private int[] marks;

		public Student2(String name, int... marks) { // 배열의 길이가 달라도 컴파일이 됨, 무조건 int...은 마지막에 와야됨
			this.name = name;
			this.marks = marks;
		
		}

		public int getNumberOfMarks() {
			return marks.length;
		}

		public int getTotalSumOfMarks() {
			int sum = 0;
			for(int mark : marks) {
				sum += mark;
			}
			return sum;
		}

		public int getMaximumMark() {
			int  maximum = Integer.MIN_VALUE;
			for(int mark : marks) {
				if(mark>maximum) {
				maximum = mark;
				}
			}
			return maximum;
			
		}

		public int getMinimumMark() {
			int minimum = Integer.MAX_VALUE;
			for(int mark : marks) {
				if(mark<minimum) {
				minimum = mark;
				}
			}
			return minimum;
		}	

		public BigDecimal getAverageMarks() {
			int sum = getTotalSumOfMarks();
			int number = getNumberOfMarks();
			return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
		}
	
		
}
