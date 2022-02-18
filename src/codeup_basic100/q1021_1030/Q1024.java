package codeup_basic100.q1021_1030;

import java.util.Scanner;

public class Q1024 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str[] = sc.next().split("");
		for(int i = 0; i < str.length; i++) {
			System.out.printf("'%s'\n", str[i]);
		}
	}
}
