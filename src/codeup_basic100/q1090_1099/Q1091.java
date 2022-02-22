package codeup_basic100.q1090_1099;

import java.util.Scanner;

public class Q1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //시작 값
		int m = sc.nextInt(); //곱할 값
		int d = sc.nextInt(); //더할 값
		int n = sc.nextInt(); //몇 번째인지를 나타내는 정수
		
		for(int i = 2; i <= n; i++) {
			a = (a *= m) + d;
		}
		System.out.println(a);
	}
}
