package codeup_basic100.q1080_1089;

import java.util.Scanner;

public class Q1087 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; sum < num; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}
