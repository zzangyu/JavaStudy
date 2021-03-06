package Method;

import java.util.Scanner;

/*
 Sung 클래스
 - 인원수를 입력받아서 입력받은 인원 수 만큼 이름과 국어, 영어, 수학 점수를 입력 받고 총점과 평균, 석차를 구하는 프로그램을 작성하시오.(클래스 설계)
 - 속성: 인원수, Record 배열
 - 기능
 1) 인원수 입력하는 기능
 2) 상세 데이터 입력하는 기능
 3) 연산 처리하는 기능
 4) 결과를 출력하는 기능
  */
public class Sung {
	// 주요 변수를 선언(속성)
	int inwon;
	Record[] rec; // Record[] 배열

	// 기능 (메소드)
	// 1) 인원수를 입력 받는다.
	public void set() {
		Scanner sc = new Scanner(System.in);

		do {
			System.out.print("인원 수 입력(1~100) - ");
			inwon = sc.nextInt();
		} while (inwon < 1 || inwon > 100);

		rec = new Record[inwon]; // Record 클래스의 배열 변수를 inwon만큼 생성
									// Record 클래스의 인스턴스를 생성한 것은 아니다.

		// 2) 상세 데이터 입력 & 연산 처리하는 기능

	}

	String[] title = { "국어점수", "영어점수", "수학점수" };

	public void input() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < inwon; i++) {
			// ***인스턴스 생성***
			rec[i] = new Record();
			System.out.print((i + 1) + "번째 이름 입력: ");
			rec[i].name = sc.next(); // next()와 nextLine()의 차이점은 ? next: 토근-> '홍길동 님'이라고 했을 때 홍길동 이거 토근 하나만 봄,
										// nextLine: 이건 '홍길동 님' 전체 다 봄
			for (int j = 0; j < title.length; j++) { // 과목
				System.out.print(title[j]);
				// 입력받은 점수를 score 배열에 저장한다.
				rec[i].score[j] = sc.nextInt();

				// 점수를 반복적으로 입력받아 누적시켜 총점을 구한다.
				rec[i].tot += rec[i].score[j];
			}
			// 평균 계산
			rec[i].avg = rec[i].tot / 3.0;
		}

	}

	public void display() {
		ranking();
		System.out.println("===============성적표===============");
		System.out.println("      이름      국어    영어    수학   총점     평균      석차");
		for (int i = 0; i < inwon; i++) {
			System.out.printf("%8s\t", rec[i].name);
			for (int j = 0; j < title.length; j++) {
				System.out.printf("%4d\t", rec[i].score[j]);
			}
			System.out.printf("%4d\t", rec[i].tot);
			System.out.printf("%7.2f", rec[i].avg);
			System.out.printf("%6d\n", rec[i].rank);
		}
		System.out.println("=================================");
	}

	public void ranking() {
		for (int i = 0; i < inwon; i++) {
			rec[i].rank = 1;
		}
		for (int i = 0; i < inwon; i++) {
			for (int j = 0; j < inwon; j++) {
				if (rec[i].avg < rec[j].avg) {
					rec[i].rank++;
				}
			}
		}
	}

}
