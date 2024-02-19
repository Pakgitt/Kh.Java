package kh.mclass.tcp.run;

import kh.mclass.tcp.TCPEchoClient;

public class ClientRun {

	public static void main(String[] args) {
		int port = 8009;
		new TCPEchoClient().tcpClient("127.0.0.1", port);
	}

}
