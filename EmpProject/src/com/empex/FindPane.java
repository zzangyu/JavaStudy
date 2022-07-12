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

//	private JDesktopPane ss = new JDesktopPane(); // 인터넷 보고 가져옴(화면 중간에 뜸)

	private JButton okb;
	private JButton rsb; // reset 버튼

	// 제목
	String[] caption = { "번호: ", "이름: ", "직책: ", "부서: ", "메일: " };

	public FindPane() {
		setLayout(new GridLayout(7, 1)); // 번호가 추가돼서

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

			// 텍스트 필드를 입력 불가능한 상태로 전환
			tf[i].setEditable(false);
			if (i == 0 || i == 1) {
				tf[i].setEditable(true); // 사번과 이름으로 검색해야하므로 입력 가능한 상태로 만든다.
			}
		}

		jp[size] = new JPanel();

		okb = new JButton("사원 정보 조회");
		okb.addActionListener(this);
		rsb = new JButton("다시쓰기");
		rsb.addActionListener(this);

		jp[size].add(okb);
		jp[size].add(rsb);

		add(jp[size]);

	}

	@Override
	public void actionPerformed(ActionEvent ae) {

		String ae_type = ae.getActionCommand(); // 이벤트가 발생한 버튼의 caption 값을 얻어온다.
		EmployeeVO evo = null; // 검색한 사원 정보를 저장한 VO 객체
		EmployeeDAO edvo = null; // DataBase 처리를 위한 DAO 객체
		if (ae_type.equals(okb.getText())) { // 조회 버튼을 누를 경우

			try {

				edvo = new EmployeeDAO();

				String sno = tf[0].getText().trim(); // 양쪽 공백 제거
				String sname = tf[1].getText().trim();

				if (!sno.equals("") && !sname.equals("")) { // 사번과 이름
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeCheck(no, sname);
				} else if (!sno.equals("") && sname.equals("")) { // 사번
					int no = Integer.parseInt(sno);
					evo = edvo.getEmployeeNo(no);
				} else if (sno.equals("") && !sname.equals("")) { // 이름
					edvo.getEmployeeName(sname);
				}

			} catch (Exception e) {
				System.out.println("e: [" + e + "]");
			}
			if (evo != null) { // 해당하는 사원이 존재하면 field를 초기화 해야한다.
				tf[0].setText(evo.getNo() + "");
				tf[1].setText(evo.getName() + "");
				tf[2].setText(evo.getJobGrade() + "");
				tf[3].setText(evo.getDepartment() + "");
				tf[4].setText(evo.getEmail());
			} else {
				JOptionPane.showMessageDialog(this, "情報なし");
//				JOptionPane.showInternalMessageDialog(ss, "情報なし", "ERROR", JOptionPane.INFORMATION_MESSAGE);
			}
		} else if (ae_type.equals(rsb.getText())) { // 다시 쓰기 버튼을 누를 경우
			int size = caption.length;
			for (int i = 0; i < size; i++) {
				tf[i].setText("");
			}
		}

	}

}
