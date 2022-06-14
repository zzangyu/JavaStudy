package com.ioex;

import java.io.File;

// 파일, 디렉토리 생성 및 삭제
public class FileEx03 {

	public static void main(String[] args) {
		// 파일 생성
//		File f1 = new File("c:/ppp/newFile.txt");
//
//		try {
//			if (f1.exists()) { // 존재하면!
//				System.out.println("파일 이름 : " + f1.getName()); // 이름 가져와
//			} else {
//				if (f1.createNewFile()) { // 없어서 만들었어~
//					System.out.println("새로운 파일을 만들었습니다.");
//				}
//			}
//		} catch (IOException e) {
//		}
//
		// 디렉토리 생성
//
//		File f2 = new File("c:/newDirectory");
//
//		if (!f2.exists()) { // 없으면!
//			f2.mkdir(); // make directory
//		} else {
//			System.out.println("디렉토리 이름:" + f2.getPath()); // 이름x path!
//		}
//
//		// 파일 혹은 디렉토리 삭제하기
//
//		File f3 = new File("c:/ppp/hello.txt");
//		if (f3.exists()) {
//			f3.delete();
//		} else {
//			System.out.println("파일 혹은 디렉토리가 존재하지 않습니다.");
//		}

		// 파일 혹은 디렉토리 이름 변경
		File src = new File("c:/ppp/newFile.txt");
		File dest = new File("c:/newDirectory/dest.txt");
		File dest2 = new File("c:/newDirectory/dest2.txt");

		if (src.exists()) {
			src.renameTo(dest);
			src.renameTo(dest2);
		} else {
			System.out.println("파일이 존재하지 않습니다.");
		}

	}

}
