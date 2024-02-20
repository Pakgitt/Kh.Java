package kh.mclass.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class TCPEchoClient {
	public void tcpClient(String ip, int port) {
		Scanner sc = new Scanner(System.in);
		Socket cs = null;
		BufferedReader br = null;
		PrintWriter pw = null;

		try {
			// 3. 4. 서버에 접속하는 소켓 생성
			cs = new Socket(ip, port);
			// 입출력 스트림 얻어옴
			pw = new PrintWriter(new OutputStreamWriter(cs.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(cs.getInputStream()));

			while (true) {
				System.out.println("전달 메시지 : ");
				String inputMsg = sc.nextLine();
				if (inputMsg.equals("exit")) {
					break;
				}
				pw.println(inputMsg);
				pw.flush();

				String msg = null;
				msg = br.readLine();
				if (msg == null) {
					break;
				}
				System.out.println("엑호 > " + msg);
			}

			System.out.println("받은 메시지 없음");
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();

		} finally {
			try {
				if (br != null)
					br.close();
				if (pw != null)
					pw.close();
				if (cs != null)
					cs.close();
				if (sc != null)
					sc.close();
			} catch (IOException e) {
				// TODO: handle exception
			}

		}

	}
}
