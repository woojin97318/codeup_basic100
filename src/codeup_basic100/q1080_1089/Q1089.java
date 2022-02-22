package codeup_basic100.q1080_1089;

import java.util.Scanner;

public class Q1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //시작 값
		int d = sc.nextInt(); //등차의 값
		int n = sc.nextInt(); //몇 번째 수 인지를 의미하는 정수
		
		while(true) {
			if(--n == 0)
				break;
			else
				a += d;
		}
		System.out.println(a);
	}
}
