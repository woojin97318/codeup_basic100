package codeup_basic100.q1090_1099;

import java.util.Scanner;

public class Q1091 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //���� ��
		int m = sc.nextInt(); //���� ��
		int d = sc.nextInt(); //���� ��
		int n = sc.nextInt(); //�� ��°������ ��Ÿ���� ����
		
		for(int i = 2; i <= n; i++) {
			a = (a *= m) + d;
		}
		System.out.println(a);
	}
}
