package codeup_basic100.q1080_1089;

import java.util.Scanner;

public class Q1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); //1�� ���� ����ũ�� �Ҹ������� üũ�ϴ� ���� h
		int b = sc.nextInt(); //�� �� üũ�� ����� �����ϴ� ��Ʈ b
		int c = sc.nextInt(); //�¿� �� �Ҹ��� ������ Ʈ�� ������ ä�� c
		int s = sc.nextInt(); //������ �ð� s
		float Bit = h * b * c * s;
		float Byte = Bit / 8;
		float KByte = Byte / 1024;
		float MByte = KByte / 1024;
		System.out.printf("%.1f MB", MByte);
	}
}
