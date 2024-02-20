package kh.mclass.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Arrays;

public class UDPechoServer {
	private static String ip = "localhost"; // 상대방 IP
	private static int myPort = 9007;
	private static int desPort = 9008;

	public static void main(String[] args) {

		new UDPechoServer().udpServer(myPort);
	}

	public void udpServer(int port) {
		// 1. UDP 소켓생성
		try (DatagramSocket dsock = new DatagramSocket(myPort);) { // close 생략
			while (true) {
				// 2. 수신받을 데이터 packet 만들기
				byte[] buffer = new byte[1000];
				DatagramPacket dPacket = new DatagramPacket(buffer, buffer.length);

				// 3. socket을 통해서 수신받은 데이터 packet에 담기
				dsock.receive(dPacket);
//				String receiveMsg = new String(dPacket.getData());
				String receiveMsg = new String(dPacket.getData(), 0, dPacket.getLength());
//				System.out.println(Arrays.toString(dPacket.getData()));
				System.out.println(receiveMsg);
				System.out.println(dPacket.getLength());
			}
//			System.out.println("---");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
