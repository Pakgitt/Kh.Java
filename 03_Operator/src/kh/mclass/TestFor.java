package kh.mclass;

public class TestFor {
	public static void main(String[] args) {
//		for (int i = 1; i <= 100; i++ /* 실행영역 끝나고 이부분 실행 */) {
////			System.out.println("조건식이 true이면 실행하는 영역");
//			System.out.println(i);
//		}
//
//		int sum = 0;
//		for (int i = 1; i <= 100; i++) {
//			System.out.println("기존" + sum + "값에서" + i + "만큼 더하기");
//			sum += i;
//		}
//		System.out.println("1부터 100까지 정수들의 합계 : " + sum);
//
//		int j = 1; // 초기식
//		sum = 0;
//		while (j <= 100) { // 조건식
//			sum += j;
//			j++; // 증감식
//		}
//		System.out.println("1부터 100까지 정수들의 합계 : " + sum);

//		for (int su = 1; su < 10; su++) { // 2~9 반복
//			System.out.printf("2 * %d = %d \t", su, 2 * su);
//		}
		
		for (int y = 1; y < 10; y++) { // 2~9 반복
			for (int x = 2; x <10; x++) {
				System.out.printf("%d * %d = %d \t",x, y, x * y);
//				System.out.println(x + "X" + y + "=" + x*y + "\t");
		}
			System.out.println(); // 줄 바꿈
	}
}
}
