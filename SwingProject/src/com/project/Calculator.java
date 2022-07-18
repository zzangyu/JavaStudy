package com.project;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame implements ActionListener {

	JFrame jf = new JFrame("계산기");
	JButton jb[] = { new JButton("C"), new JButton("0"), new JButton("◀"), new JButton("="), new JButton("1"), new JButton("2"), new JButton("3"), new JButton("+"), new JButton("4"), new JButton("5"), new JButton("6"), new JButton("-"), new JButton("7"), new JButton("8"), new JButton("9"), new JButton("X"), new JButton("."), new JButton("%"), new JButton("x²"), new JButton("/") };
	JTextField jtf1 = new JTextField(15);
	JTextField jtf2 = new JTextField(15);

	boolean plus = false;
	boolean minus = false;
	boolean multi = false;
	boolean division = false;
	boolean reminder = false;
	boolean jeom = false;

	public Calculator() {
		jf.setPreferredSize(new Dimension(300, 150));
		Container contentPane = jf.getContentPane();

		JPanel jpTextField = new JPanel();
		jpTextField.setLayout(new GridLayout(2, 1));
		jpTextField.add(jtf2);
		jpTextField.add(jtf1);
		jtf1.setEditable(false);
		jtf1.setBorder(new EmptyBorder(10, 10, 10, 10));
		jtf2.setEditable(false);
		jtf2.setBorder(new EmptyBorder(10, 10, 10, 10));

		contentPane.setLayout(new BorderLayout());
		contentPane.add(jpTextField, BorderLayout.NORTH);

		JPanel jpButton = new JPanel();
		jpButton.setLayout(new GridLayout(5, 4));
		for (int i = 19; i >= 0; i--) {
			jpButton.add(jb[i]);
			jb[i].addActionListener(this);
		}
		contentPane.add(jpButton, BorderLayout.CENTER);

		jf.setSize(300, 400);
		jf.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		try {

			// Float.parseFloat(jtf1.getText())

			if (e.getSource() == jb[0]) { // C
				jtf1.setText("");
				jtf2.setText("");
				plus = false;
				minus = false;
				multi = false;
				division = false;
				reminder = false;
				jeom = false;
			} else if (e.getSource() == jb[1]) { // 0

				if (jtf2.getText().equals("0")) {
					jtf2.setText("0");
				} else {
					jtf2.setText(jtf2.getText() + "0");
				}
				if (division) {
					jtf2.setText("0으로 나눌 수 없습니다.");
				}

			} else if (e.getSource() == jb[2]) { // ◀

				String a = "";
				String sum = "";
				String value[] = jtf2.getText().split("");

				for (int i = 0; i < value.length - 1; i++) {
					sum += value[i];
				}
				jtf2.setText(sum);

			} else if (e.getSource() == jb[3]) { // =

				String jeomQ[] = jtf2.getText().split("");
				if (jeomQ[jeomQ.length - 1].equals(".")) {
					jtf2.setText(jtf2.getText() + "0");
				}

				if (plus) {
					jtf1.setText(Float.parseFloat(jtf1.getText()) + Float.parseFloat(jtf2.getText()) + "");
					jtf2.setText("");
				} else if (minus) {
					jtf1.setText(Float.parseFloat(jtf1.getText()) - Float.parseFloat(jtf2.getText()) + "");
					jtf2.setText("");
				} else if (division) {
					jtf1.setText(Float.parseFloat(jtf1.getText()) / Float.parseFloat(jtf2.getText()) + "");
					jtf2.setText("");
				} else if (reminder) {
					jtf1.setText(Float.parseFloat(jtf1.getText()) % Float.parseFloat(jtf2.getText()) + "");
					jtf2.setText("");
				} else if (multi) {
					jtf1.setText(Float.parseFloat(jtf1.getText()) * Float.parseFloat(jtf2.getText()) + "");
					jtf2.setText("");
				}

				jtf2.setText(""); // 결과값 출력했으니까 공백으로 만듦

				plus = false;
				minus = false;
				division = false;
				reminder = false;
				multi = false;
				jeom = false;

			} else if (e.getSource() == jb[4]) {

				if (jtf2.getText().equals("0")) { // 1
					jtf2.setText("");
					jtf2.setText("1");
				} else {
					jtf2.setText(jtf2.getText() + "1");
				}
			} else if (e.getSource() == jb[5]) {

				if (jtf2.getText().equals("0")) { // 2
					jtf2.setText("");
				} else {
					jtf2.setText(jtf2.getText() + "2");
				}

			} else if (e.getSource() == jb[6]) { // 3

				if (jtf2.getText().equals("0")) {
					jtf2.setText("");
				} else {
					jtf2.setText(jtf2.getText() + "3");
				}

			} else if (e.getSource() == jb[7]) { // +

				String jeomQ[] = jtf2.getText().split("");
				if (jeomQ[jeomQ.length - 1].equals(".")) {
					jtf2.setText(jtf2.getText() + "0");
				}

				if (plus) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) + Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
					plus = false;
				} else if (minus) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) - Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
					minus = false;
				} else if (multi) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) * Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
					multi = false;
				} else if (division) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) / Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
					division = false;
				} else if (reminder) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) % Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
					reminder = false;
				} else if (jtf1.getText().equals("")) {
					jtf1.setText(jtf2.getText());
					jtf2.setText("");
					plus = true;
				} else {
					jtf1.setText(Float.parseFloat(jtf2.getText()) + Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
					plus = true;
					minus = false;
					division = false;
					reminder = false;
					multi = false;
					jeom = false;
				}

			} else if (e.getSource() == jb[8]) { // 4

				if (jtf2.getText().equals("0")) {
					jtf2.setText("");
				} else {
					jtf2.setText(jtf2.getText() + "4");
				}

			} else if (e.getSource() == jb[9]) { // 5

				if (jtf2.getText().equals("0")) {
					jtf2.setText("");
				} else {
					jtf2.setText(jtf2.getText() + "5");
				}

			} else if (e.getSource() == jb[10]) { // 6

				if (jtf2.getText().equals("0")) {
					jtf2.setText("");
				} else {
					jtf2.setText(jtf2.getText() + "6");
				}

			} else if (e.getSource() == jb[11]) { // -

				String jeomQ[] = jtf2.getText().split("");
				if (jeomQ[jeomQ.length - 1].equals(".")) {
					jtf2.setText(jtf2.getText() + "0");
				}

				if (plus) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) + Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
					plus = false;
				} else if (minus) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) - Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
					minus = false;
				} else if (multi) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) * Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
					multi = false;
				} else if (division) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) / Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
					division = false;
				} else if (reminder) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) % Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
					reminder = false;
				} else if (jtf1.getText().equals("")) {
					jtf1.setText(jtf2.getText());
					jtf2.setText("");
				} else {
					jtf1.setText(Float.parseFloat(jtf2.getText()) - Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
					minus = true;
					plus = false;
					division = false;
					reminder = false;
					multi = false;
					jeom = false;
				}

			} else if (e.getSource() == jb[12]) { // 7

				if (jtf2.getText().equals("0")) {
					jtf2.setText("");
				} else {
					jtf2.setText(jtf2.getText() + "7");
				}

			} else if (e.getSource() == jb[13]) { // 8

				if (jtf2.getText().equals("0")) {
					jtf2.setText("");
				} else {
					jtf2.setText(jtf2.getText() + "8");
				}

			} else if (e.getSource() == jb[14]) { // 9

				if (jtf2.getText().equals("0")) {
					jtf2.setText("");
				} else {
					jtf2.setText(jtf2.getText() + "9");
				}

			} else if (e.getSource() == jb[15]) { // X

				String jeomQ[] = jtf2.getText().split("");
				if (jeomQ[jeomQ.length - 1].equals(".")) {
					jtf2.setText(jtf2.getText() + "0");
				}

				if (plus) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) + Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (minus) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) - Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (multi) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) * Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (division) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) / Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (reminder) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) % Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				}

				if (jtf2.getText().equals("")) {

				} else {
					jtf1.setText(jtf2.getText());
					jtf2.setText("");
					plus = false;
					minus = false;
					multi = true;
					division = false;
					reminder = false;
					jeom = false;
				}

			} else if (e.getSource() == jb[16]) { // .
				if (jeom) {

				} else if (jtf2.getText().equals("")) {

				} else {
					jtf2.setText(jtf2.getText() + ".");
					jeom = true;
				}
			} else if (e.getSource() == jb[17]) { // %

				String jeomQ[] = jtf2.getText().split("");
				if (jeomQ[jeomQ.length - 1].equals(".")) {
					jtf2.setText(jtf2.getText() + "0");
				}

				if (plus) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) + Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (minus) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) - Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (multi) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) * Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (division) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) / Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (reminder) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) % Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				}

				if (jtf1.getText().equals("")) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) / 100 + "");
				} else {
					jtf1.setText(Float.parseFloat(jtf1.getText()) / 100 + "");
				}
			} else if (e.getSource() == jb[18]) { // x²

				String jeomQ[] = jtf2.getText().split("");
				if (jeomQ[jeomQ.length - 1].equals(".")) {
					jtf2.setText(jtf2.getText() + "0");
				}

				// 이 전에 연산을 했으면 그 연산을 끝내고 제곱 준비
				if (plus) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) + Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (minus) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) - Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (multi) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) * Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (division) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) / Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (reminder) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) % Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				}

				// textfield1(결과창)에 아무것도 없으면 입력한 숫자로 제곱하기
				if (jtf1.getText().equals("")) {
					jtf1.setText(jtf2.getText());
				} else {
					jtf1.setText(Float.parseFloat(jtf1.getText()) * Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText(jtf1.getText());

					plus = false;
					minus = false;
					multi = false;
					division = false;
					reminder = false;
					jeom = false;
				}
			} else if (e.getSource() == jb[19]) { // /

				String jeomQ[] = jtf2.getText().split("");
				if (jeomQ[jeomQ.length - 1].equals(".")) {
					jtf2.setText(jtf2.getText() + "0");
				}

				if (plus) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) + Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (minus) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) - Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (multi) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) * Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (division) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) / Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				} else if (reminder) {
					jtf1.setText(Float.parseFloat(jtf2.getText()) % Float.parseFloat(jtf1.getText()) + "");
					jtf2.setText("");
				}

				if (jtf2.getText().equals("")) {

				} else {
					jtf1.setText(jtf2.getText());
					jtf2.setText("");
					plus = false;
					minus = false;
					multi = false;
					division = true;
					reminder = false;
					jeom = false;
				}
			}

		} catch (NumberFormatException e2) {

		}
	}
}
