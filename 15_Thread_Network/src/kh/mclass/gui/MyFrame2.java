package kh.mclass.gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame2 extends JFrame {
	public MyFrame2() {

		// 독립 클래스로 Action 이벤트의 리스너 작성

		setTitle("이것은 제목입니다");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		JButton btn1 = new JButton("Action");
		c.add(btn1);

		btn1.addActionListener(new ActionListner() {
			public void actionPerformed(ActionEvent e) {
				JButton b = (JButton) e.getSource();
				if (b.getText().equals("Action"))
					b.setText("액션 가면");
				else
					b.setText("Action");
				setTitle(b.getText());
			}
		});

		setSize(350, 150);
		setVisible(true);

	}

	public static void main(String[] args) {
		MyFrame2 mf2 = new MyFrame2();

	}

}
