package chat.client;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientBackground {
	private final String IP = "127.0.0.1";
	private final int PORT = 7777;
	private Socket socket; // 받아올 소켓 저장
	private ClientGui gui;
	private String nickname;
	private DataOutputStream out;
	private DataInputStream in;

	public void setGui(ClientGui gui) {
		this.gui = gui;
	}

	// 클라이언트가 서버에 접속하는 메소드
	public void connect(String nickname) {
		try {
			this.nickname = nickname;
			socket = new Socket(IP, PORT); // 서버에 연결 성공
			gui.setJtaAppendMsg("서버 접속 완료\n");
//			ok
			// 서버와 주고 받을 입,출력 통로 생성

			out = new DataOutputStream(socket.getOutputStream());
			in = new DataInputStream(socket.getInputStream());
			// 접속 후 서버에서 닉네임을 인식
			out.writeUTF(nickname); // 접속되자 마자 닉네임 전송함 // flush 없음

			while (in != null) {
				String msg = in.readUTF();
				gui.setJtaAppendMsg(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			gui.setJtaAppendMsg("서버를 찾을 수 없습니다. IP와 Port 번호를 확인 후 재시도");

		} catch (Exception e) {
			gui.setJtaAppendMsg("예기치 못한 오류 발생 고객센터(1599-1234)	");
		}

	}

	public void sendMessage(String msg) {
		try {
			out.writeUTF(msg);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
