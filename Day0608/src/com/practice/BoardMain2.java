package com.practice;

import java.util.Scanner;

public class BoardMain2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardSVC2 svc = new BoardSVC2();

		boolean isStop = false;

		do {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("1. �Խ��� �� ����");
			System.out.println("2. �Խ��� ��� ����");
			System.out.println("3. �Խ��� �� ����");
			System.out.println("4. �Խ��� �� �˻�");
			System.out.println("5. �Խ��� �� ����");
			System.out.println("6. ����");
			String menu = sc.next();
			switch (menu) {
			case "1":
				svc.writeArticle(sc);
				break;
			case "2":
				svc.listArticle(sc);
				break;
			case "3":
				svc.deleteArticle(sc);
				break;
			case "4":
				svc.searchArticle(sc);
				break;
			case "5":
				svc.updateArticle(sc);
				break;
			case "6":
				isStop = true;
			}

		} while (!isStop);

	}

}
