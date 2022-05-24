package 과제;

import java.util.Scanner;

class Map {
	// 19x19
	protected int[][] map = new int[10][19];

	public void mapFrame() {
		for (int i = 0; i < map.length; i++) {
			map[i] = new int[19];
			for (int j = 0; j < map[i].length; j++) {
				if (i == 0 || i == 9) {
					System.out.print("#");
				} else if (j == 0 || j == 18) {
					System.out.print("#");
				} else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}
}

class Man extends Map {
	Scanner sc = new Scanner(System.in);

	@Override
	public void mapFrame() {
		while (true) {
			super.mapFrame();
			System.out.println("위(J) 아래(K) 왼(H) 오(I) : ");
			String a = sc.next();
		}
	}
}

class Monster extends Map {

}

public class textGame {

	public static void main(String[] args) {
		Man man = new Man();
		man.mapFrame();

	}

}
