package codeup_basic100.q1070_1079;

import java.util.Scanner;

public class Q1078 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 2; i <= num; i++) {
			if(i % 2 == 0)
				sum += i;
		}
		System.out.println(sum);
	}
}
