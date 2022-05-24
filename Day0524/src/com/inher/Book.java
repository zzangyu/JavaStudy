package com.inher;

/*
����ڰ� ���� å�� ������ �����ϴ� ��ü �迭�� ����
=========
1. å ���
2. å �˻�
3. ��� å ���
4. ����
=========

��ȣ�� �Է��Ͻÿ�: 1
����: The C Language
����: 9
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
			System.out.println("1. å ���");
			System.out.println("2. å �˻�");
			System.out.println("3. ��� å ���");
			System.out.println("4. ����");
			System.out.println("=========");

			System.out.print("�޴� ����: ");
			int menu = sc.nextInt();

			if (menu == 1) {
				System.out.print("å ����: ");
				String title = sc.next();
				System.out.print("å ����: ");
				int score = sc.nextInt();
				list.add(new BookInfo(title, score));
				System.out.print("���α׷� �� ����? y/n");
				String s = sc.next();
				if (!s.equals("y")) {
					break;
				}
				continue;
			} else if (menu == 2) {
				System.out.print("å ����: ");
				String title2 = sc.next();
				for (BookInfo e : list) {
					if (e.getTitle().equals(title2)) {
						System.out.println(e);
					}
				}
				System.out.print("���α׷� �� ����? y/n");
				String s = sc.next();
				if (!s.equals("y")) {
					break;
				}
				continue;
			} else if (menu == 3) {
				for (BookInfo e : list) {
					System.out.println(e);
				}
				System.out.print("���α׷� �� ����? y/n");
				String s = sc.next();
				if (!s.equals("y")) {
					break;
				}
			} else if (menu == 4) {
				System.out.println("���α׷��� �����մϴ�.");
				return;
			} else {
				System.out.println("�ٽ� �Է� �ٶ��ϴ�.");
				continue;
			}
		}
	}

}
