package kh.mclass;

import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Arrays;

public class InetAddressEx {
	public void method1(String domain) {
		System.out.println(domain + "에 대한 정보입니다");
		try {
			InetAddress ia = InetAddress.getByName(domain);
			System.out.println(ia);
			boolean result1 = ia.isMulticastAddress();
			System.out.println(result1);

			System.out.println("====다시====");
			System.out.println(domain + "===에 대한 InetAddress정보 ");
			System.out.println("호스트 이름 : " + ia.getHostName());

			System.out.println("IP주소를 byte 배열로 리턴 : " + Arrays.toString(ia.getAddress()));
			System.out.println("모든 호스트의 IP주소를 배열에 담아 반환 : " + Arrays.toString(ia.getAllByName(domain)));
//			System.out.println("byte배열을 통해 IP주소를 얻는다 : " +Integer.valueOf(ia.getByAddress()));

		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		naver.com/223.130.195.95
//		InetAddress ia2 = 

		Socket sk = new Socket();
	}

}
