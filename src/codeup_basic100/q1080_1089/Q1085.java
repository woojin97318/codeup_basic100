package codeup_basic100.q1080_1089;

import java.util.Scanner;

public class Q1085 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt(); //1초 동안 마이크로 소리강약을 체크하는 수를 h
		int b = sc.nextInt(); //한 번 체크한 결과를 저장하는 비트 b
		int c = sc.nextInt(); //좌우 등 소리를 저장할 트랙 개수인 채널 c
		int s = sc.nextInt(); //녹음할 시간 s
		float Bit = h * b * c * s;
		float Byte = Bit / 8;
		float KByte = Byte / 1024;
		float MByte = KByte / 1024;
		System.out.printf("%.1f MB", MByte);
	}
}
