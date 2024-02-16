package kh.mclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class TestCollection2 {
	public static void main(String[] args) {
		// "banana", "lemon", "potato"를 추가하고 2번째 추가한것을 삭제하고
		// 결과를 모두 display를 해주세요

		List<String> fruitList = new ArrayList<String>(); // 담을 공간 확보
		fruitList.add("banana"); // 등록
		fruitList.add("lemon");
		fruitList.add("potato");

		// 조회
		for (String e : fruitList) {
			System.out.println(e);
		}
		// 2번째 글만 보기

		System.out.println(fruitList.get(1) + " 레몬 삭제");
		fruitList.remove(1);
		for (String e : fruitList) {
			System.out.println(e);
		}
		// Map
		// b-1: "banana", b-2: "lemon", a-1: "potato", a-2: "banana"를 추가하고
		// 2번째 상품 재고 없음으로 삭제요청
		// 현재 모든 상품코드 - 상품명 결과를 모두 display를 해주세요

		Map<String, String> fruit2 = new HashMap<String, String>();
		fruit2.put("b-1", "banana");
		fruit2.put("b-2", "lemon");
		fruit2.put("a-1", "potato");
		fruit2.put("a-2", "banana");
		Set<String> fruit2KeySet = fruit2.keySet(); // 상품들을 담을 Set 만들기
		for (String key : fruit2KeySet) { // key를 개수만큼 반복하면 모든 상품정보를 볼 수 있음
			System.out.println(key + "-" + fruit2.get(key));
		}
		System.out.println(fruit2.get("b-2"));
		System.out.println("b-2 삭제");
		fruit2.remove("b-2");

		/* fruit2KeySet */fruit2.keySet(); // 상품들을 담을 Set 만들기
		for (String key : fruit2KeySet) { // key를 개수만큼 반복하면 모든 상품정보를 볼 수 있음
			System.out.println(key + "-" + fruit2.get(key));
		}

		// Iterator
		System.out.println("====Iterator====");
		Iterator<String> fruitIterator = fruitList.iterator();
		System.out.println(fruitIterator);

		// 형변환 - 자동, 강제

		while (fruitIterator.hasNext()) {
			String fruit = fruitIterator.next();
			System.out.println(fruit);
		}

		System.out.println("++++++++++여러 컬렉션 복합자료형+++++++++++");
		// 가장 대표 자료형 - 바깥쪽 생성(할당됨)
		List<Map<String, Student>> list = new ArrayList<Map<String, Student>>();
		// 안쪽 - 생성(할당)됨
		Map<String, Student> map = new HashMap<String, Student>();

		// 가장 내부에 있는 참조형 new
		Student instance = new Student();

		instance.setId("abc");
		instance.setId("홍길동");
		// 바깥 값 채우기
		map.put("1001", instance);
		// 가장 바깥 값 채우기
		list.add(map);
		// mapList.add(new HashMap<String, Student>());
		System.out.println("++++++++++여러 컬렉션 복합자료형222222+++++++++++");
		Map<String, List<Student>> comp1 = new HashMap<String, List<Student>>();
		List<Student> comp2 = new ArrayList<Student>();
		Student comp3 = new Student();

		comp3.setId("쿠쿠");
		comp3.setName("철수");
		comp3.setId("배고파");
		comp2.add(comp3);
		Student comp3_2 = new Student();
		comp3_2.setId("bbbb");
		comp3_2.setName("영화");
		comp2.add(comp3_2);
		comp1.put("mclass", comp2);

		List<Student> comp2_2 = new ArrayList<Student>();
		Student comp3_2_1 = new Student();

		comp3_2_1.setId("쿠쿠");
		comp3_2_1.setName("철수");
		comp3_2_1.setId("배고파");
		comp2.add(comp3_2_1);
		Student comp3_2_2 = new Student();
		comp3_2_2.setId("bbbb");
		comp3_2_2.setName("영화");
		comp2_2.add(comp3_2_2);
		comp1.put("kclass", comp2_2);

		System.out.println(comp1);

		Map<String, Object> comp1_3 = new HashMap<String, Object>();
		comp1_3.put("1-1", 123);
		comp1_3.put("1-2", "안녕");
		comp1_3.put("1-2", fruitList);
		comp1_3.put("1-3", instance);
		comp1_3.put("1-4", comp2);
		System.out.println(comp1_3);

//		Set<Entry<String, Student>> setEnrty = ;

//		Scanner sc = new Scanner(System.in);
//		System.out.println("과일 추가 : ");
//		String addfruitList1 = sc.nextLine();
//		fruitList.add(addfruitList1);
//		String addfruitList2 = sc.nextLine();
//		fruitList.add(addfruitList2);
//		String addfruitList3 = sc.nextLine();
//		fruitList.add(addfruitList3);

//		System.out.println(fruitList);

//		416~417 list
//		407~408 410~412 list member
//		423-430 set
//		431-432 set member
//		440-445 map member
//
//		419 stack push/pop
//		420-421 queue push/pop
//		422 iterator
//		433-438 comparable/comparator

	}
}
