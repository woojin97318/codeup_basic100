package codeup_basic100.q1010_1019;

import java.util.Scanner;

public class Q1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date[] = sc.next().split("\\.");
		int y = Integer.parseInt(date[0]);
		int m = Integer.parseInt(date[1]);
		int d = Integer.parseInt(date[2]);
		System.out.printf("%d.%02d.%02d", y, m, d);
		
		/*
		 * '.'�� �ƴ� '\\.'�� �ۼ��� ������
		 * split�� ���ڷ� ���� String ��ū�� regex ���Խ��̱� �����̴�.
		 * ���ԽĿ��� .�� �������� �� ���ڸ� �ǹ��Ѵ�. �׷��� ��� ���ڰ� ��ū�� �Ǳ� ������
		 * �迭�� ���� �� ���� �Ǵ� ���̴�.
		 * 
		 * ���� �̽������� ���ڸ� �տ� �ٿ���� �Ѵ�. �׷��� String �ȿ� �̽������� ������ \��
		 * �� �ַ��� \\��� ����Ѵ�. ���� \\��� ���� ���̴�.
		 * �׷��� \\. �̶�� ���� ���Խ� �ʿ����� \.��� �ν��� �ϰ� ���� .�� ã�Եȴ�.
		 */
	}
}
