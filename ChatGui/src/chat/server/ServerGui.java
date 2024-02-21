package chat.server;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ServerGui extends JFrame implements ActionListener {

	private static final long serialVersionUID = -3226405043059624133L;
	private JTextArea jta = new JTextArea(40, 25); // 채팅 창
	private JTextField jtf = new JTextField(25); // 글 입력 부분
//	private JButton btn = new JButton("전송"); // 글 입력 버튼
	// view - controller 필드 생성
	private ServerBackground sback = new ServerBackground(); // 채팅을 담당할 백그라운드(뒷 작업 영역) 선언

	public ServerGui() {
		// 생성자 = 초기값 지정. JFrame 기본화면 구성
		jta.setEditable(false);
		jta.setFont(new Font("맑은고딕", Font.PLAIN, 18)); // 글자 폰트, 크기 변경
		jta.setBackground(new Color(230, 255, 230));
		add(jta, BorderLayout.CENTER);

		jtf.addActionListener(this); // jtf에서 enter key 치면 actionPerfomed() 호출
//		btn.addActionListener(this);
		add(jtf, BorderLayout.SOUTH);
//		add(btn, BorderLayout.EAST);

		setBounds(200, 100, 400, 600);
		setTitle("서버부분");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		sback.setGui(this); // 형재 창을 sback에 전달하고 sback에서 setJtaAppendMsg 호출
		sback.setting(); // GUI 실행 시 서버도 같이 동작 시킴
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 문자 입력 창에 글을 입력 시 구동할 이벤트 설정
		String msg = "운영자 : " + jtf.getText() + "\n";
		System.out.println(msg);
		jta.append(msg); // 채팅창에 추가
		jtf.setText(""); // 입력 후 내용 초기화
		sback.sendMessage(msg, "운영자");

//		System.out.println("event 발생");
//		System.out.println(e);

	}

	public void setJtaAppendMsg(String msg) {
		jta.append(msg);
	}

}
