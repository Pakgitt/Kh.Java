package kh.mclass.tcp.run;

import kh.mclass.tcp.TCPEchoServer;

public class ServerRun {
	public static void main(String[] args) {
		// 1. 포트번호 정함
		int port = 8009;
		TCPEchoServer ts = new TCPEchoServer();
		ts.tcpServer(port);
	}

}
