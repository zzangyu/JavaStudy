package Array;
/*
[문제]
무지개 아파트 세대별 101~103동
10층 10호 호수마다 1명
 */
public class ArrayEx02 {
	public static void main(String[] args) {
	int apt[][][] = new int[3][10][10];
	for(int i = 0; i<apt.length; i++) {
		for(int j = 0; j<10; j++) {
			for(int k = 0; k<10; k++) {
				apt[i][j][k] = 1;
			}
		}
	}
	System.out.println(apt.length);
	System.out.println(apt[2][9][9]);
		
		
		
	}
}
