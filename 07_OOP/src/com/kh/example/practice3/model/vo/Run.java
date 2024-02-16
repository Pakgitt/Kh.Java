package com.kh.example.practice3.model.vo;

public class Run {
	public static void main(String[] args) {
		
		// 실행용 메소드로 기본 생성자를 통해
		// Circle type의 객체를 생성 후 원의 둘레, 넓이값 출력
		// incrementRadius() 메소드를 통해 반지름 1증가후
		// 다시 원의 둘레, 넓이 값 출력
//		Circle.radius
		Circle c1 = new Circle();
		c1.getAreaOfCircle();
		c1.getAreaOfCircle();
		c1.incrementRadius();
		c1.getSizeOfCircle();
		c1.getSizeOfCircle();
		c1.incrementRadius();
		c1.getSizeOfCircle();
		c1.getSizeOfCircle();
//		Circle2 c2 = new Circle2();
	}
}
