package 과제;

import java.util.Scanner;

class Map2 {
	// 10*19
	protected String[][] map = new String[10][19];
	public String[][] monster = new String[10][19];
	public String[][] man = new String[10][19];

	public void gold() {
		map[3][4] = "G";
	}

	public void monster() {
		int x = (int) (Math.random() * 8) + 1;
		int y = (int) (Math.random() * 17) + 1;
		map[x][y] = "M";
		monster[x][y] = map[x][y];
	}

	public void man(int x, int y) {
		map[x][y] = "@";
	}
}

class MaFrame extends Map2 {
	public void mapFrame(int x, int y) {
		boolean aa = false;
		for (int i = 0; i < map.length; i++) {
			map[i] = new String[19];
			for (int j = 0; j < map[i].length; j++) {
				if (j == 0) {
					map[i][j] = "#";
				} else {
					map[i][j] = "  ";
				}
				monster();
				gold();
				man(x, y);

				System.out.print(map[i][j]);
			}
			System.out.print("\t  #");
			System.out.println();
		}
	}
}

class Move2 extends MaFrame {
	Scanner sc = new Scanner(System.in);

	@Override
	public void mapFrame(int x, int y) {
		while (true) {
			System.out.println("###################");
			super.mapFrame(x, y);
			System.out.println("###################");
			System.out.print("위(J) 아래(K) 왼쪽(H) 오른쪽(I) : ");
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
			if (man[x][y] == monster[x][y]) {
				System.out.println("지석진 아웃 ! 지석진 아웃 !");
				break;
			} else if (map[x][y] == map[3][4]) {
				System.out.println("win !");
				break;
			}
		}
	}

}

public class textGame2 {

	public static void main(String[] args) {
		Move2 move = new Move2();
		move.mapFrame(5, 5);
	}

}
