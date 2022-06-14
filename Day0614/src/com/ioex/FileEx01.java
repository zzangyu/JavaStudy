package com.ioex;

import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
//		File f = new File("C:\\ppp\\hello.txt"); 파일 위치를 받는 것! 위, 아래 선택해서 쓰기
		File f = new File("C:/ppp/hello.txt");
		File d = new File("C:/ppp");

		System.out.println("파일인지 여부: " + f.isFile());
		System.out.println("디렉토리인지 여부: " + f.isDirectory());
		System.out.println("디렉토리인지 여부: " + d.isDirectory()); // 디렉토리 --> 폴더

		// 상대경로 vs 절대경로
		// 상대경로 : 현재 위치를 기준으로 그 곳의 위치를 의미한다.
		// 절대경로 : 모든 경로 C:/ppp/hello.txt
		// . : 현재 위치
		// .. : 현재 위치의 바로 상위의 디렉토리를 의미
		// / : 루트를 의미 (\)

		System.out.println("상대 경로 : " + f.getPath()); // wep에서 활용된다.
		System.out.println("절대 경로 : " + f.getAbsolutePath());
		System.out.println("파일의 이름 : " + f.getName());
		System.out.println("파일의 내용 : " + f.length()); // 한글 길이가 3..
		System.out.println("파일의 최종 수정 날짜 : " + f.lastModified());

	}

}
