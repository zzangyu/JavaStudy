package study;

public class while문Ex01 {

	public static void main(String[] args) {
		
		int i, sum=0;
		i=1;
		while(i<10) { // ***변수는 위에, while()에는 조건, 증감은 while 블록 안에***
			sum = sum + i;
			System.out.println(i+", "+sum);
			i++;
		}

	}
}

