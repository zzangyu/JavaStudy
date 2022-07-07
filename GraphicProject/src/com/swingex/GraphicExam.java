package com.swingex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

class DrawingPanel extends JPanel {

	int korean, english, math;

	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, getWidth(), getHeight());
		g.drawLine(50, 250, 350, 250);

		for (int cnt = 1; cnt < 11; cnt++) {
			g.drawString(cnt * 10 + "", 25, 255 - 20 * cnt);
			g.drawLine(50, 250 - 20 * cnt, 350, 250 - 20 * cnt);
		}

		g.drawLine(50, 20, 50, 250);

		g.drawString("국어", 100, 270); // 위치가 100, 270임
		g.drawString("영어", 200, 270);
		g.drawString("수학", 300, 270);

		g.setColor(Color.red);

		if (korean > 0) {
			g.fillRect(110, 250 - korean * 2, 10, korean * 2);
		}
		if (english > 0) {
			g.fillRect(210, 250 - english * 2, 10, english * 2);
		}
		if (math > 0) {
			g.fillRect(310, 250 - math * 2, 10, math * 2);
		}

	}

	public void setScores(int korean, int english, int math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

}

class DrawActionListener implements ActionListener {

	JTextField text1, text2, text3;
	DrawingPanel drawingPanel;

	protected DrawActionListener(JTextField text1, JTextField text2, JTextField text3, DrawingPanel drawingPanel) {
		this.text1 = text1;
		this.text2 = text2;
		this.text3 = text3;
		this.drawingPanel = drawingPanel;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			int korean = Integer.parseInt(text1.getText());
			int english = Integer.parseInt(text2.getText());
			int math = Integer.parseInt(text3.getText());
			drawingPanel.setScores(korean, english, math);
			drawingPanel.repaint();

		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(drawingPanel, "잘.못.된. 숫.자. 형.식.입.니.다.", "에러 메시지", JOptionPane.ERROR_MESSAGE);
		}

	}

}

public class GraphicExam {
	public static void main(String[] args) {
		JFrame frame = new JFrame("성적 그래프 프로그램");

		frame.setPreferredSize(new Dimension(400, 350));
		frame.setLocation(500, 200);

		Container contentPane = frame.getContentPane();

		JPanel controlPanel = new JPanel();
		JTextField text1 = new JTextField(3);
		JTextField text2 = new JTextField(3);
		JTextField text3 = new JTextField(3);

		JButton button = new JButton("그래프 그리기");
		controlPanel.add(new JLabel("국어"));
		controlPanel.add(text1);
		controlPanel.add(new JLabel("영어"));
		controlPanel.add(text2);
		controlPanel.add(new JLabel("수학"));
		controlPanel.add(text3);
		controlPanel.add(button);

		contentPane.add(controlPanel, BorderLayout.SOUTH);

		DrawingPanel drawingPanel = new DrawingPanel();
		contentPane.add(drawingPanel, BorderLayout.CENTER);

		button.addActionListener(new DrawActionListener(text1, text2, text3, drawingPanel));

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}
}
