package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	private Shape s = new Shape();

	public double calcArea(double height, double width) {
		double result = 0.0;
		// TODO ? 생성자..
		// 둘레 = 너비*2 + 높이*2
		s.setHeight(height);
		s.setWidth(width);
		result = (width * height) / 2;
		return result;

	}

	public void paintColor() {

	}

	public void paintColor(String color) {
		s.setColor(color);
	}

	public String print() {
		String result ="";
		result = "삼각형" + s.information();
		return result;
	}
}
