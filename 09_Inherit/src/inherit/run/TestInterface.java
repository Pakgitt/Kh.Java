package inherit.run;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestInterface {
	public static void main(String[] args) {
//		int[] arr = new int[4];
		List<Integer> intList = new ArrayList<Integer>(); // []X <자료형> 대입
		List<String> strList = new ArrayList<String>();
		List<String> linkList = new LinkedList<String>();
		
		
		intList.add(3);
		intList.add(4);
		intList.add(6);
		System.out.println(intList.size());
		intList.add(8);
		System.out.println(intList.size());
		intList.remove(2);
		System.out.println(intList.size());
		System.out.println(intList);
		
		strList.add("길동홍");
		strList.add("길동홍");
		System.out.println(strList);
		strList.add("우아아");
		System.out.println(strList);
		strList.remove(1);
		System.out.println(strList);
	}
}
