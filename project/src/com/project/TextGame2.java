package com.project;

import java.util.Scanner;

class Map {
	String[][] map = new String[10][19];
	static int a, b, x, y;
	Scanner sc = new Scanner(System.in);

	void printMap(int x, int y) {
		System.out.println("###################");
		a = (int) (Math.random() * 8) + 1;
		b = (int) (Math.random() * 17) + 1;
		for (int i = 0; i < map.length; i++) {
			map[i] = new String[19];
			for (int j = 0; j < map[i].length; j++) {
				if (j == 0) {
					map[i][j] = "#";
				} else if (i == a && j == b) {
					map[i][j] = "M"; // ����
				} else {
					map[i][j] = "  ";
				}

				map[3][4] = "G"; // gold
				map[x][y] = "@"; // ���

				System.out.print(map[i][j]);
			}
			System.out.println("\t  #");

		}
		System.out.println("###################");
	}

	void Move() {
		System.out.print("��(J) �Ʒ�(K) ����(H) ������(I) : ");
		String c = sc.next(); // ��ǥ �̵�
		if (c.equals("J")) {
			--x;
		} else if (c.equals("K")) {
			++x;
		} else if (c.equals("H")) {
			--y;
		} else if (c.equals("I")) {
			++y;
		}
	}

}

public class TextGame2 extends Map {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map map = new Map();

		System.out.println("x, y�� �Է����ּ���(���鱸��)");
		x = sc.nextInt();
		y = sc.nextInt();
		while (true) {
			map.Move();
			map.printMap(x, y);
			if (x == a && y == b) {
				System.out.println("Game over ^.^"); // ��� ��ǥ�� ���� ��ǥ�� ������ ���� �й�
				break;
			} else if (x == 3 && y == 4) { // ��� ��ǥ�� ��� ��ǥ�� ������ ���� �¸�
				System.out.println("win !");
				break;
			}
		}
	}
}
