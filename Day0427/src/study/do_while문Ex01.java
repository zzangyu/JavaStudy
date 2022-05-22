package study;

public class do_while문Ex01 {

	public static void main(String[] args) {
		
		int i, sum=0;
		i=1;
		 do{ // ***변수는 위에, 증감은 do 블록 안에, 조건은 맨 밑에***
			sum = sum + i;
			System.out.println(i+", "+sum);
			i++;
		}while(i<10);
		
	}

}
