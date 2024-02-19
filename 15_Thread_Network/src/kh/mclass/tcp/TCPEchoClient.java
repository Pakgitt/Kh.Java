package kh.mclass.tcp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPEchoClient {
	public void tcpClient(String ip, int port) {
		try {
			System.out.println("server에 접속 요청");
			Socket cs = new Socket(ip, port);
			System.out.println("server에 접속 와나료");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
