package codeup_basic100.q1020_1029;

import java.util.Scanner;

public class Q1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); //75254
		for(int i = 10000; i != 0; i = i / 10) {
			System.out.print("[");
			System.out.print(num / i % 10 * i);
			System.out.print("]\n");
		}
//		System.out.println(num / 10000 % 10 * 10000);
//		System.out.println(num / 1000 % 10 * 1000);
//		System.out.println(num / 100 % 10 * 100);
//		System.out.println(num / 10 % 10 * 10);
//		System.out.println(num /1 % 10 * 1);
	}
}
