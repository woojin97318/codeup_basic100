package codeup_basic100.q1021_1030;

import java.util.Scanner;

public class Q1025 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("规过 1");
		int num = sc.nextInt();
//		System.out.println(num / 10000 % 10 * 10000);
//		System.out.println(num / 1000 % 10 * 1000);
//		System.out.println(num / 100 % 10 * 100);
//		System.out.println(num / 10 % 10 * 10);
//		System.out.println(num / 1 % 10 * 1);
		for(int i = 10000; i != 0; i = i / 10) {
			System.out.print("[");
			System.out.print(num / i % 10 * i);
			System.out.println("]");
		}
		
		System.out.println("\n规过 2");
		String str[] = sc.next().split("");
		int cnt = str.length;
		for(String s : str) {
			System.out.print("[");
			System.out.print((int)(Integer.parseInt(s) * (Math.pow(10, --cnt))));
			System.out.println("]");
		}
	}
}
