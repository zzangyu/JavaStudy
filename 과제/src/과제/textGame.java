package 과제;

import java.util.Scanner;

class Map {
	// 10*19
	protected String[][] map = new String[10][19];

	public void gold() {
		map[3][4] = "G";
	}

	public void monster() {
		int x = (int) (Math.random() * 9) + 1;
		int y = (int) (Math.random() * 18) + 1;
		map[x][y] = "M";
	}

	public void man(int x, int y) {
		map[x][y] = "@";
	}
}

class Frame extends Map {
	public void mapFrame(int x, int y) {
		for (int i = 0; i < map.length; i++) {
			map[i] = new String[19];
			for (int j = 0; j < map[i].length; j++) {
				if (j == 0) {
					map[i][j] = "#";
				} else {
					map[i][j] = "  ";
				}
				gold();
				monster();
				man(x, y);
				System.out.print(map[i][j]);
			}
			System.out.println();
		}
	}
}

class Move extends MaFrame {
	Scanner sc = new Scanner(System.in);

	@Override
	public void mapFrame(int x, int y) {
		while (true) {
			System.out.println("###################");
			super.mapFrame(x, y);
			System.out.println("###################");
			System.out.print("위(J) 아래(K) 왼(H) 오(I) : ");
			String a = sc.next();
			if (a.equals("J")) {
				--x;
			} else if (a.equals("K")) {
				++x;
			} else if (a.equals("H")) {
				--y;
			} else if (a.equals("I")) {
				++y;
			}

		}
	}
}

public class textGame {

	public static void main(String[] args) {
		Move move = new Move();
		move.mapFrame(6, 5);
	}

}
