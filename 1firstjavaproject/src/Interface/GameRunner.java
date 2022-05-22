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
		// 위에 GamingConsole은 배열 방식 밑에는 따로 불러오는것
//		GamingConsole game = new MarioGame ();
//		MarioG ame game = new MarioGame();
//		GamingConsole game = new ChessGame ();
//		ChessGame game = new ChessGame ();
		
	
	}

}
