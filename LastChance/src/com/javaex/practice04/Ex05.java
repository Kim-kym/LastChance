package com.javaex.practice04;

import java.util.Scanner;
import java.util.Arrays;

public class Ex05 {

	public static void main(String[] args) {
		float sum = 0;
		int[] num = new int[5];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < num.length; ++i) {
			int number; 
			number = scanner.nextInt();
			num[i] = number;
			sum += num[i];
			}
		System.out.println("평균은 "+(sum / 5)+" 입니다.");
		
		}
			
	}
		
