package com.swingex;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class JColorChooserEx extends JFrame implements ActionListener {

	JMenuBar mb = new JMenuBar();
	JMenu mnuSelect = new JMenu("123");
	JMenuItem mnuColor = new JMenuItem("456");

	JLabel l = new JLabel("11");
	JTextArea ta = new JTextArea();

	public JColorChooserEx() {

		super("JColorChooser Test");

		mnuSelect.add(mnuColor);
		setJMenuBar(mb);
		mb.add(mnuSelect);
		add("North", l);
		add("Center", ta);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(300, 300, 300, 200);
		setVisible(true);

		mnuColor.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mnuColor) {
			JColorChooser chooser = new JColorChooser();
			Color col = chooser.showDialog(this, "������ ������", Color.blue);
			l.setText("������ ������ " + col);
			ta.setBackground(col);
		}
	}

	public static void main(String[] args) {
		new JColorChooserEx();
	}

}
