package com.kh.example.practice3.model.vo;

public class Circle {
	private final double PI = 3.14;
	private int radius = 1;
// 아아
	public Circle() {
	}

	public void incrementRadius() {
		radius++;

	}

	public void getAreaOfCircle() {
		System.out.println("넓이:" + radius * radius * PI);
	}

	public void getSizeOfCircle() {
		System.out.println("둘래:" + radius * PI * 2);
	}

}
