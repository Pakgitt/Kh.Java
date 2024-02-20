package kh.mclass.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Scanner;

public class UDPechoclient {
	private static int myPort = 9008;
	private static int desPort = 9007;
	private static String ip = "localhost";

	public static void main(String[] args) {

		new UDPechoclient().udpClient(ip, myPort);
	}

	public void udpClient(String ip, int port) {
		System.out.println("보낼 메시지 > " );
		Scanner sc = new Scanner(System.in);
		String sendMsg = sc.next();
//		byte[] sendMsgByteArr = new byte[sendMsg.length()*2];
		byte[] sendMsgByteArr = sendMsg.getBytes();
		System.out.println(sendMsgByteArr.length);
		// 1. UDP 소켓 생성
		try (DatagramSocket dsock = new DatagramSocket(myPort);) { //
			InetAddress inetAddr = InetAddress.getByName(ip);
			// 2. 보낼 데이터 만들기
			DatagramPacket dPacket = new DatagramPacket(sendMsgByteArr, // 보내느 데이터를 byte[] 형태로
					sendMsgByteArr.length, // 보내는 데이터 길이
					inetAddr, desPort);
			// 3. socket을 통해서 packet을 보냄
			dsock.send(dPacket);
		} catch (SocketException | UnknownHostException e) {
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
