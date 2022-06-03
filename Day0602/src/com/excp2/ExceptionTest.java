package com.excp2;

public class ExceptionTest {

	public static void main(String[] args) {
//		try {
//			startInstall();
//			copyFiles();
//		} catch (SpaceException e) {
//			System.out.println("공간이 부족하오니 충분히 확보 바랍니다.");
//			System.out.println("확보가 되셨으면 다시 설치 바랍니다.");
//		} catch (MemoryException e) {
//			System.out.println("메모리가 부족하오니 충분히 확보 바랍니다.");
//		} finally {
//			deleteTempFiles();
//		}

		try {
			Install();
		} catch (InstallException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void Install() throws InstallException {
		try {
			startInstall(); // 프로그램 설치할 준비함
			copyFiles(); // 파일을 복사
		} catch (SpaceException se) {
			InstallException ie = new InstallException("설치 중 예외 발생 ...");
			ie.initCause(se); // 원인이 무엇이냐!!? -> e 때문이다. 지정한 예외를 원인으로 등록하는 기능
			throw ie; // 원인 예외를 반환
		} catch (MemoryException me) {
			InstallException ie = new InstallException("설치 중 예외 발생 ...");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();
		}

	}

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) { // 프로그램 설치시 공간이 부족한 경우
			throw new SpaceException("설치할 공간이 매우 부족합니다.");
		}

		if (!enoughMemory()) {
			throw new MemoryException("메모리가 매우 부족합니다.");
		}
	}

	static boolean enoughSpace() {
		return false;
	}

	static boolean enoughMemory() {
		return true;
	}

	static void copyFiles() { // 파일 복사

	}

	static void deleteTempFiles() { // 임시파일 설치

	}
}
