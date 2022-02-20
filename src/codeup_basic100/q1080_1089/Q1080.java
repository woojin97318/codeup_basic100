package codeup_basic100.q1080_1089;

import java.util.Scanner;

public class Q1080 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int i = 1;
		do {
			sum += i;
			i++;
		}while(sum < num);
		System.out.println(--i);
	}
}
