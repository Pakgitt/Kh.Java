package chat.client;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import chat.server.ServerBackground;

public class ClientGui extends JFrame implements ActionListener {

	private static final long serialVersionUID = -5966118489307577248L;
	private JTextArea jta = new JTextArea(40, 25); // 채팅 창
	private JTextField jtf = new JTextField(25); // 글 입력 부분
	private String nickName;

	private ClientBackground cback = new ClientBackground(); // 채팅을 담당할 백그라운드(뒷 작업 영역) 선언

	public ClientGui(String nickName) {
		this.nickName = nickName;

		jta.setEditable(false);
		jta.setFont(new Font("맑은고딕", Font.PLAIN, 18)); // 글자 폰트, 크기 변경
		jta.setBackground(new Color(230, 255, 230));
		add(jta, BorderLayout.CENTER);

		jtf.addActionListener(this); // jtf에서 enter key 치면 actionPerfomed() 호출
//		btn.addActionListener(this);
		add(jtf, BorderLayout.SOUTH);
//		add(btn, BorderLayout.EAST);

		setBounds(200, 100, 400, 600);
		setTitle("클라이언트");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		cback.setGui(this);
		cback.connect(nickName);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		문자 입력 창에 글을 입력 시 구동할 이벤트 설정
		String msg = nickName + " : " + jtf.getText() + "\n";
		System.out.println(msg);
//		jta.append(msg); // 채팅창에 추가
		jtf.setText(""); // 입력 후 내용 초기화
		cback.sendMessage(msg);

	}

	public void setJtaAppendMsg(String msg) {
		jta.append(msg);
	}

}
