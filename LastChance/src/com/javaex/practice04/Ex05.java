package com.javaex.practice04;

import java.util.Scanner;
import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		int num[];
		num = new int[5];
		int sum = 0;
		Scanner scanner = new Scanner(System.in); 
		for (int i = 0; i < num.length; ++i) {
			int number = scanner.nextInt();
			number = num[i];
			sum += number;
		}
	}
}

