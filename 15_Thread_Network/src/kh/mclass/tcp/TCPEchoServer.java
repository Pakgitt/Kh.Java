package kh.mclass.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPEchoServer {

	public void tcpServer(int port) {
		ServerSocket ss = null;
		Socket s = null;
		BufferedReader br = null;
		PrintWriter pw = null;
		try {
			// 1. 서버 소켓 생성
			ss = new ServerSocket(port);
			System.out.println("====클라이언트 접속 대기 중 ====");
			// 2. 3. 4. 클라이언트 접속 대기 --> 클라이언트의 접속 요청 수락하고 socket 생성
			s = ss.accept(); // client 접속을 기다림
			// 입출력 스트림 얻어옴
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			pw = new PrintWriter(new OutputStreamWriter(s.getOutputStream()));

			String msg = null;
			while ((msg = br.readLine()) != null) {
				System.out.println("client > " + msg);
				pw.println("~~~" + msg);
				pw.flush();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (s != null)
					s.close();
				if (ss != null)
					ss.close();
				if (pw != null)
					pw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
