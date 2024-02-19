package com.kh.example.practice3.model.vo;

import java.util.Iterator;
import java.util.Random;

public class Circle2 {
	// static final 둘다 있으면 반드시 명시적 초기화해야함. 생성자 초기화 불가
	private static final double PI = 3.14;
	private static int radius = 1;
	private int[] lotto;

//	{
//		lotto = new int[6];
//		for (int i = 0; i < lotto.length; i++) {
////			Math.random();
////			Random rd = new Random();
////			lotto[i] = new rd.nextInt(45); // 0~1 사이의 값
//			lotto[i] = new Random().nextInt(45);
//		}
//		radius = 5;
//	}
	public Circle2(double PI, int radius, int[] lotto) {
		this.radius = radius;
		this.lotto = lotto;

	}
}
