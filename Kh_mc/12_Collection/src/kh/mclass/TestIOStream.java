package kh.mclass;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TestIOStream {
	public static void main(String[] args) {
		// File 객체 생성
		File f1 = new File("./test/dir");
		if (!f1.exists()) {
			// 우리가 아는 test.txt 파일 만들기
			f1.mkdirs(); // 없는 디렉토리 다 만들기
		}
		File f2 = new File("./test/dir/test2.txt");
		try {
			f2.createNewFile();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// 현재 디렉토리에 파일 생성
		File f3 = new File("test3.txt");
		try {
			f3.createNewFile();
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		// 디렉토리 객체
		File f4 = new File("./");
		String[] fileArr = f4.list();
		if (fileArr != null) {
			for (String filename : fileArr) {
				System.out.println(filename);
			}

		}
		// 파일객체 정보 확인
		File f5 = new File("./src/a.txt");
		System.out.println(f5.length());
		if (f3 != null) {
			if (f3.isDirectory()) {
				String[] fileList = f3.list();

			} else if (f3.isFile()) {
				System.out.println(f3.length());
				System.out.println(f3.getPath());
			}
		}

//		BufferedReader br = new BufferedReader(new FileReader(new File("a.txt")));
		// 파일객체에 쓰기(출력스트림)
		FileWriter fw = null;
		FileWriter fw2 = null;
		try {
			fw = new FileWriter(f3); // 덮어쓰기 write
			fw.write("aaaa");
//			fw.flush(); // 밀어내기

			fw2 = new FileWriter(f5, false); // 이어쓰기 write
			fw2.write("bbbb");

			fw2.flush(); // 밀어내기
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (fw != null)
					fw.close();
				if (fw2 != null)
					fw2.close();

			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		System.out.println("=================");
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(f3);
//			char[] readData = new char[1000];
//			System.out.println(readData.length); // 1000
//			int length = fr.read(readData);
//			System.out.println(readData.length); // 1000
//			System.out.println(length);
//			String readStr = String.valueOf(readData);
//			System.out.println(readStr);

			// 보조스트림 달기
			System.out.println("======보조스트림");
			br = new BufferedReader(fr);
			String s = null;
			while ((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (br != null) br.close(); // close() 순서는 생성의 반대
				if (fr != null) fr.close();
			} catch (IOException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}

	}

}
