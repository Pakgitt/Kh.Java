package chat.client;

import javax.swing.JOptionPane;

public class ClientRun {
	public static void main(String[] args) {
		// cancel ==> null, 아무것도 입력안하고 OK ==>
//		boolean run = true;
//		while (true) {
		String nickName = JOptionPane.showInputDialog("닉네임을 입력하세요.");
		System.out.println(nickName);
//		if (!nickName.equals("") && nickName != null) {	// NullPointerException 발생
		if (nickName == null || nickName.equals("")) {
			System.out.println("닉네임 없이는 채팅 입장 불가");
		}
		if (nickName != null && !nickName.equals("")) {
			new ClientGui(nickName);
		} else {
			System.out.println("닉네임 없이는 채팅 입장이 불가합니다.");
		}

	}

}
//}
