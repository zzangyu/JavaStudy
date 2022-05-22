package study;

public class LongEx {

	public static void main(String[] args) {
		
		long l1 =33, l2=3333333333l; 
		//l을 붙여줘야 함 10^8자리 까지는 int형으로 커버가 되는데 그 이후에는 long을 붙여줘야 한다. 하지만 long 범위를 넘어가버리면 에러 뜸.
	    //ex)10^18(19자리)까지는 long이 커버 가능하다.
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l1+l2);
		
	}

}
