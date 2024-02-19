package kh.mclass.tcp;

import java.io.IOException;
import java.net.ServerSocket;

public class TCPEchoServer {

	public void tcpServer(int port) {
		ServerSocket cs = null;

		try {
			System.out.println("====");
			cs = new ServerSocket(port);
			// 서버 소켓을 지정된 포트로 열기
			cs.accept();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (cs != null)
					cs.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
