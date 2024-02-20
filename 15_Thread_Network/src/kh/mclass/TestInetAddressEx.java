package kh.mclass;

import java.net.MalformedURLException;
import java.net.URL;

public class TestInetAddressEx {
	public static void main(String[] args) {

		/* InetAddressEx iad = */ new InetAddressEx().method1("naver.com");
//		naver.com/223.130.195.95

		try {
			URL url = new URL("https://www.oracle.com/downlads/index.html");
			System.out.println("============================");
			System.out.println("프로토콜 : " + url.getProtocol());
			System.out.println("포트번호 : " + url.getPort());
			System.out.println("호스트 : " + url.getHost());	// 도메인
			System.out.println("파일경로 : " + url.getFile());		
			System.out.println("URL 전체 : " + url.toExternalForm());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
