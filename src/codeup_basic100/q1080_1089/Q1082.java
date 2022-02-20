package codeup_basic100.q1080_1089;

import java.util.Scanner;

public class Q1082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(16);
		for(int i = 1; i < 16; i++) {
			System.out.printf("%x * %x = %x\n", n, i, n * i);
		}
	}
}
