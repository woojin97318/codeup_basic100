package codeup_basic100.q1080_1089;

import java.util.Scanner;

public class Q1089 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt(); //���� ��
		int d = sc.nextInt(); //������ ��
		int n = sc.nextInt(); //�� ��° �� ������ �ǹ��ϴ� ����
		
		while(true) {
			if(--n == 0)
				break;
			else
				a += d;
		}
		System.out.println(a);
	}
}
