package kh.mclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection {
	public static void main(String[] args) {
		List<String> strList = new LinkedList<String>();
		strList.add("A");
		strList.add("B");
		strList.add("C");
		strList.add("D");
		strList.add("a");
		strList.add("!df");
		System.out.println(strList.get(2)); // C
		System.out.println(strList.remove(1));
		System.out.println(strList);
//		strList.clear();
		System.out.println(strList.isEmpty());

		Collections.sort(strList);
		System.out.println(strList);

		System.out.println("====Set(중복값X, index순서 X) + Map함께====");
		Set<String> s1 = new TreeSet<String>();
		s1.add("java");
		s1.add("oracle");
		s1.add("html");
		s1.add("java");
		System.out.println(s1);
		// 사용 불가
//		for(int i = 0 ; i <= s1.size(); i ++) {
//			s1.
//		}
		// enchanced for을 사용해야 하나씩 꺼내기 가능
		for (String e : s1) {
			System.out.println(e);
			switch (e) {
			case "java":
				break;

			default:
				break;
			}

		}
		System.out.println("====Map(key, value) key는 Set형태 + String=====");
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("k1", 100);
		map1.put("k2", 200);
//		map1.get("k2");
		Integer v1 = map1.get("k2");
		System.out.println(map1);
		System.out.println(v1);
		System.out.println(map1.get("k1"));

		map1.put("박세혁", 25);
		map1.put("박세횩", 22);
		map1.put("박횩횩", 52);
		map1.put("박횩횩", 56);
		System.out.println(map1.get("박횩횩"));

		System.out.println(map1.size());	
		for (int i = 0; i < map1.size(); i++) {
			map1.get("");

		}
		Set<String> map1KeySet = map1.keySet();
		for (String keyName : map1KeySet) {
			System.out.print(keyName);
			System.out.println(map1.get(keyName));
		}

	}
}
