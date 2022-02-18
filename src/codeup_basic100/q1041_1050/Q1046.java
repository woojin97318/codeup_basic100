package codeup_basic100.q1041_1050;

import java.util.Scanner;

public class Q1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int hap = a + b + c;
		System.out.println(hap);
		System.out.println(String.format("%.1f", (float)hap/3));
	}
}
