package codeup_basic100.q1090_1099;

import java.util.Scanner;

public class Q1090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //���� ��
		int r = sc.nextInt(); //��� ��
		int n = sc.nextInt(); //�� ��°������ ��Ÿ���� ����
		
		for(int i = 2; i <= n; i++) {
			a *= r;
		}
		System.out.println(a);
	}
}
