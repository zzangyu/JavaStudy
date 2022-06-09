package com.mapex.mscore;

import java.io.IOException;

public class ScoreRunner {

	public static void main(String[] args) throws IOException {

		Score score = new ScoreImpl();
		char ch;
		System.out.println("★★★★★★★★★★★★★★★ 성적처리 ★★★★★★★★★★★★★★★");
		while (true) {
			do {
				System.out.println("\n(1)입력 (2)수정 (3)이름 검색 (4)삭제 ");
				System.out.println("(5)전체 출력 (6)전체출력 - 총점순 (7)종료");
				System.out.print("메뉴 선택: ");
				ch = (char) System.in.read();
				System.in.read();
				System.in.read();
			} while (ch < '1' || ch > '7');

			switch (ch) {
			case '1':
				score.Insert();
				break;
			case '2':
				score.Update();
				break;
			case '3':
				score.Search();
				break;
			case '4':
				score.Delete();
				break;
			case '5':
				score.WriteAll();
				break;
			case '6':
				score.WriteSort();
				break;
			case '7':
				System.exit(0);
			}

		}

	}

}
