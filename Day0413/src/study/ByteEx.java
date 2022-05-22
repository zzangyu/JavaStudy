package study;

public class ByteEx {

/* 
 * byte: 1byte 자료형 (-128~127, 256개)
 */
	
	public static void main(String[] args) {
		byte bb = 127; //127다음은 -로 간다.   -129는 안된다 (범위 안에 안들어가기 때문이다.)
		bb++;
		System.out.println("byte bb: "+bb);
	}

}
