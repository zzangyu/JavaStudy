package com.starcraft;

public abstract class Unit { // �߻� Ŭ���� : �������� ��ɸ� ��Ƽ� ����
	// �޼��� ����, �̵�

	int x, y; // ��ǥ�� ���

	abstract void move(int x, int y);

	abstract void stop();

	abstract void message();

}
