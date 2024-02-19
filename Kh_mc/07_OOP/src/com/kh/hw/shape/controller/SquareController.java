package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	private Shape s = new Shape();

	public double calcPerimeter(double height, double width) /* throws Exception */ {
		double result = 0.0;
		// TODO ? 생성자..
		// 둘레 = 너비*2 + 높이*2
		result = width * 2 + height * 2;
		return result;
	}

	public double calcArea(double height, double width) /* throws Exception */ {
		double result = 0.0;
		// 넓이 = 너비 * 너비
		// TODO result = 블라블
		result = width * width;
		return result;
	}

	public void paintColor(String color) /* throws Exception */ {
		s.setColor(color);
	}

	public String print() {

		String result = "";
		result = "사각형 : " + s.information();
		return result;
	}

}