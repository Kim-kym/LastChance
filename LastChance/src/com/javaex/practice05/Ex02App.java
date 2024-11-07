package com.javaex.practice05;

public class Ex02App {

	public static void main(String[] args) {
		
		Goods camera = new Goods();
		Goods cup = new Goods("머그컵", 2000);
		
		camera.setName("니콘");
		camera.setPrice(4000000);
		
		
		camera.ShowInfo();
		cup.ShowInfo();
		

	}

}
