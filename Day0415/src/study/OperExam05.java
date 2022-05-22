package study;

/*
	비트연산 (이진수로 바꾼다.)
	& ex) 2&5 ▶0010(2) 
              	  	  0101(2)
              	      0000(2) ▶ 답은 0
	| ex) 2|5 ▶ 0010(2)
			         0101(2)
			         0111(2) ▶ 답은 7
	A   B  &&  ||  
	0   0   0		0
	0	 1   0  	1
	1	 0   0 	1
	1	 1   1	 	1
*/

public class OperExam05 {

	public static void main(String[] args) {
		
		int a = 2 & 5;
		int b = 2 | 5;
		System.out.println("bit 연산 결과 : "+a);
		System.out.println("bit 연산 결과 : "+b);

	}

}
