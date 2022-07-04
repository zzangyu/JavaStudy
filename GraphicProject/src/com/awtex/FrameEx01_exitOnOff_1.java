package com.awtex;

import java.awt.Frame;

public class FrameEx01_exitOnOff_1 {

	public static void main(String[] args) {
		// 프레임 객체 생성
		Frame frame = new Frame();
		WinEvent we = new WinEvent(); // 같은 package안에 있어서 그냥 불러오며 됨
		frame.addWindowListener(we); // 얘 주석처리하고 실행 시켜봐. 그러면 종료가 안될거임 콘솔 옆에 정지 버튼 눌러서 끄셈
		frame.setSize(300, 200); // 가로 300, 세로 200 크기
		frame.setVisible(true); // 창으로 띄우겠느냐!? *true로 만들기, 기본은 false임*

	}

}
