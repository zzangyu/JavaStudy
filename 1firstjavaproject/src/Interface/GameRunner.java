package Interface;

public  class GameRunner {

	public static void main(String[] args) {
		GamingConsole[] games = {new MarioGame (), new ChessGame ()};
		for(GamingConsole game: games) {
			game.up();
			game.down();
			game.left();
			game.right();
		}
		// ���� GamingConsole�� �迭 ��� �ؿ��� ���� �ҷ����°�
//		GamingConsole game = new MarioGame ();
//		MarioG ame game = new MarioGame();
//		GamingConsole game = new ChessGame ();
//		ChessGame game = new ChessGame ();
		
	
	}

}
