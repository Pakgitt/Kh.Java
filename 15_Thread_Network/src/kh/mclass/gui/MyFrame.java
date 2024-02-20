package kh.mclass.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	public MyFrame() {
		setTitle("나의 첫 프레임 만들기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500); // 프레임 크기 300X300

		Container c = getContentPane();
//		c.setBackground(Color.ORANGE);
////		c.setLayout(new FlowLayout(FlowLayout.CENTER));
//		c.setLayout(new GridLayout(2, 7));
//
//		c.add(new JButton("일요일"));
//		c.add(new JButton("월요일"));
//		c.add(new JButton("화요일"));
//		c.add(new JButton("수요일"));
//		c.add(new JButton("목요일"));
//		c.add(new JButton("금요일"));
//		c.add(new JButton("토요일"));
//		c.add(new JButton("일요일"));
//		c.add(new JButton("월요일"));
//		c.add(new JButton("화요일"));
//		c.add(new JButton("수요일"));
//		c.add(new JButton("목요일"));
//		c.add(new JButton("금요일"));
//		c.add(new JButton("토요일"));
		JButton btnOrg1 = new JButton("초기값");
		JButton btnOrg2 = new JButton("이름 초기값");
		JButton btnOk = new JButton("OK");
		JButton btnCancle = new JButton("Cancel");
		JTextField txtGrade = new JTextField("정수 195");

		c.setLayout(new GridLayout(4, 2));
		c.add(btnOrg1);
		c.add(btnOrg2);
		c.setBackground(Color.PINK);
		c.add(new JLabel("이름"));
		c.add(new JTextArea(""));
		c.add(new JLabel("나이"));
		c.add(new JTextArea(""));
		c.add(new JLabel("성별"));
		c.add(new JTextArea(""));
		c.add(new JLabel("취미"));
		c.add(new JTextArea(""));
		c.add(btnOk);
		c.add(btnCancle);

		btnOk.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				btnOrg1.setText("값 바꾸기" + txtGrade.getText());
			}
		});
		setVisible(true); // 프레임 출력
	}

	public static void main(String[] args) {

		MyFrame mf = new MyFrame();

	}
}
