package com.empex;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class AddPane extends JPanel implements ActionListener, ItemListener {

	// ȭ�� ���� ��� �ʵ� ����
	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];

	private JButton okb;
	private JButton rsb; // reset ��ư

	private int department = 10;

	// ����
	String[] caption = { "�̸�: ", "��å: ", "����: ", "�μ�: " };

	public AddPane() {
		setLayout(new GridLayout(6, 1));

		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);

		int size = caption.length;
		// �Է� ���� �׸��� ����

		// �ؽ�Ʈ �ʵ�� ���� �гο� ��� addPane�� �߰�
		int i;
		for (i = 0; i < size - 1; i++) {
			jp[i] = new JPanel();
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);
			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);
		}

		jp[i] = new JPanel();
		jl[i] = new JLabel(caption[i]);
		jp[i].add(jl[i]);
		add(jp[i]);

		JComboBox combo = new JComboBox();
		combo.addItem("�μ���ȣ�� �����ϼ���.");
		for (int c = 1; c <= 5; c++) {
			combo.addItem(c * 10);
		}

		jp[i].add(combo);
		jp[size] = new JPanel();
		okb = new JButton("�����ϱ�");
		rsb = new JButton("�ٽþ���");

		jp[size].add(okb);
		jp[size].add(rsb);

		add(jp[size]);

	}

	@Override
	public void itemStateChanged(ItemEvent e) {

	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}

}
