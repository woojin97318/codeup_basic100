package codeup_basic100.q1041_1050;

import java.util.Scanner;

public class Q1045 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + b);
		System.out.println(a - b);
		System.out.println(a * b);
		System.out.println(a / b);
		System.out.println(a % b);
		System.out.printf("%.2f\n", (float)a / (float)b);
//		----
		System.out.println(String.format("%.2f", (float)a/b));
	}
}
