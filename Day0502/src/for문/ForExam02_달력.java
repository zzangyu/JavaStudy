package for¹®;

public class ForExam02_´Þ·Â {

	public static void main(String[] args) {
		int a, b = 1;
		for(a = 1; a<31; a++) {
			System.out.printf("%3d%c ", a, (b++%7!=0) ?' ': '\n');
			
		}
		
	}

}
