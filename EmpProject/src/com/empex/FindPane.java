package com.empex;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class FindPane extends JPanel implements ActionListener {

	private JPanel jp[] = new JPanel[6];
	private JLabel jl[] = new JLabel[5];
	private JTextField tf[] = new JTextField[5];

//	private JDesktopPane ss = new JDesktopPane(); // ���ͳ� ���� ������(ȭ�� �߰��� ��)

	private JButton okb;
	private JButton rsb; // reset ��ư

	// ����
	String[] caption = { "��ȣ: ", "�̸�: ", "��å: ", "�μ�: ", "����: " };

	public FindPane() {
		setLayout(new GridLayout(7, 1)); // ��ȣ�� �߰��ż�

		EtchedBorder eb = new EtchedBorder();
		setBorder(eb);

		int size = caption.length;

		int i;
		for (i = 0; i < size; i++) {
			jp[i] = new JPanel();
			jl[i] = new JLabel(caption[i]);
			tf[i] = new JTextField(15);

			jp[i].add(jl[i]);
			jp[i].add(tf[i]);
			add(jp[i]);

			// �ؽ�Ʈ �ʵ带 �Է� �Ұ����� ���·� ��ȯ
			tf[i].setEditable(false);
			if (i == 0 || i == 1) {
				tf[i].setEditable(true); // ����� �̸����� �˻��ؾ��ϹǷ� �Է� ������ ���·� �����.
			}
		}

		jp[size] = new JPanel();

		okb = new JButton("��� ���� ��ȸ");
		okb.addActionListener(this);
		rsb = new JButton("�ٽþ���");
		rsb.addActionListener(this);

		jp[size].add(okb);
		jp[size].add(rsb);

		add(jp[size]);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		String ae_type = ae.getActionCommand(); // �̺�Ʈ�� �߻��� ��ư�� caption ���� ���´�.
		EmployeeVO evo = null; // �˻��� ��� ������ ������ VO ��ü
		EmployeeDAO edvo = null; // DataBase ó���� ���� DAO ��ü
		if (ae_type.equals(okb.getText())) { // ��ȸ ��ư�� ���� ���

			try {

				edvo = new EmployeeDAO();

				String sno = tf[0].getText().trim(); // ���� ���� ����
				String sname = tf[1].getText().trim();

				if (!sno.equals("") && !sname.equals("")) { // ����� �̸�
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);
				} else if (!sno.equals("") && sname.equals("")) { // ���
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
				} else if (sno.equals("") && !sname.equals("")) { // �̸�
					edvo.getEmployeeName(sname);
				}

			} catch (Exception e) {
				System.out.println("e: [" + e + "]");
			}
			if (evo != null) { // �ش��ϴ� ����� �����ϸ� field�� �ʱ�ȭ �ؾ��Ѵ�.
				tf[0].setText(evo.getNo() + "");
				tf[1].setText(evo.getName() + "");
				tf[2].setText(evo.getJobGrade() + "");
				tf[3].setText(evo.getDepartment() + "");
				tf[4].setText(evo.getEmail());
			} else {
				JOptionPane.showMessageDialog(this, "���êʪ�");
//				JOptionPane.showInternalMessageDialog(ss, "���êʪ�", "ERROR", JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (ae_type.equals(rsb.getText())) { // �ٽ� ���� ��ư�� ���� ���
			int size = caption.length;
			for (int i = 0; i < size; i++) {
				tf[i].setText("");
			}
		}

	}

}
