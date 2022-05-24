package com.inher;

/*
사용자가 읽은 책과 평점을 저장하는 객체 배열을 생성
=========
1. 책 등록
2. 책 검색
3. 모든 책 출력
4. 종료
=========

번호를 입력하시오: 1
제목: The C Language
평점: 9
....
 */
import java.util.ArrayList;
import java.util.Scanner;

class BookInfo {

	static int count;

	String title;
	int score;

	public BookInfo(String title, int score) {
		this.title = title;
		this.score = score;
		count++;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Book[title=" + title + ", score =" + score + "]";
	}

}

public class Book {

	public static void main(String[] args) {
		ArrayList<BookInfo> list = new ArrayList<BookInfo>();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("=========");
			System.out.println("1. 책 등록");
			System.out.println("2. 책 검색");
			System.out.println("3. 모든 책 출력");
			System.out.println("4. 종료");
			System.out.println("=========");

			System.out.print("메뉴 선택: ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("책 제목: ");
				String title = sc.next();
				System.out.print("책 평점: ");
				int score = sc.nextInt();
				list.add(new BookInfo(title, score));
				System.out.print("프로그램 더 쓸거? y/n");
				String s = sc.next();
				if (!s.equals("y")) {
					break;
				}
				continue;
			} else if (menu == 2) {
				System.out.print("책 제목: ");
				String title2 = sc.next();
				for (BookInfo e : list) {
					if (e.getTitle().equals(title2)) {
						System.out.println(e);
					}
				}
				System.out.print("프로그램 더 쓸거? y/n");
				String s = sc.next();
				if (!s.equals("y")) {
					break;
				}
				continue;
			} else if (menu == 3) {
				for (BookInfo e : list) {
					System.out.println(e);
				}
				System.out.print("프로그램 더 쓸거? y/n");
				String s = sc.next();
				if (!s.equals("y")) {
					break;
				}
			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				return;
			} else {
				System.out.println("다시 입력 바랍니다.");
				continue;
			}
		}
	}

}
