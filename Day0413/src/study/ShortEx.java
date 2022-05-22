package study;

/* 
 * short: 2byte
 * 		      값의 범위: 양수 부: 65536
 * 			  			 -32768 ~ +32767
 * short s: 자바에서는 초기화를 하지 않으면 에러가 발생하거나 자동으로 초기값을 설정한다.(쓰레기값이 들어갈 수 있다.)
 */

public class ShortEx {

	public static void main(String[] args) {
		
		short s=0;
		System.out.println(s);
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.BYTES);
	}

}
