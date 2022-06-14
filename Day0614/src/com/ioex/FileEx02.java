package com.ioex;

import java.io.File;

public class FileEx02 {

	public static void main(String[] args) {
		File directory = new File("c:/");

		if (directory.exists()) { // 파일 존재 여부 검사
			if (directory.isDirectory()) { // 디렉토리인지 검사
				// 현재 디렉토리 내의 모든 파일 리스트 출력, 스트링 배열로 리턴
				String[] fileNameList = directory.list();

				// 파일 목록 출력
				for (String fileName : fileNameList) {
					System.out.println("파일 이름:" + fileName);
				}

			}
		}

	}

}
