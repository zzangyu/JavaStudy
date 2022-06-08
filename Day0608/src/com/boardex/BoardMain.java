package com.boardex;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BoardSVC svc = new BoardSVC();
		svc.writeArticle(sc);
	}

}
