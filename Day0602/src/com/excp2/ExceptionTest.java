package com.excp2;

public class ExceptionTest {

	public static void main(String[] args) {
//		try {
//			startInstall();
//			copyFiles();
//		} catch (SpaceException e) {
//			System.out.println("������ �����Ͽ��� ����� Ȯ�� �ٶ��ϴ�.");
//			System.out.println("Ȯ���� �Ǽ����� �ٽ� ��ġ �ٶ��ϴ�.");
//		} catch (MemoryException e) {
//			System.out.println("�޸𸮰� �����Ͽ��� ����� Ȯ�� �ٶ��ϴ�.");
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
			startInstall(); // ���α׷� ��ġ�� �غ���
			copyFiles(); // ������ ����
		} catch (SpaceException se) {
			InstallException ie = new InstallException("��ġ �� ���� �߻� ...");
			ie.initCause(se); // ������ �����̳�!!? -> e �����̴�. ������ ���ܸ� �������� ����ϴ� ���
			throw ie; // ���� ���ܸ� ��ȯ
		} catch (MemoryException me) {
			InstallException ie = new InstallException("��ġ �� ���� �߻� ...");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();
		}

	}

	static void startInstall() throws SpaceException, MemoryException {
		if (!enoughSpace()) { // ���α׷� ��ġ�� ������ ������ ���
			throw new SpaceException("��ġ�� ������ �ſ� �����մϴ�.");
		}

		if (!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �ſ� �����մϴ�.");
		}
	}

	static boolean enoughSpace() {
		return false;
	}

	static boolean enoughMemory() {
		return true;
	}

	static void copyFiles() { // ���� ����

	}

	static void deleteTempFiles() { // �ӽ����� ��ġ

	}
}
