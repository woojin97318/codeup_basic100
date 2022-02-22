package codeup_basic100.q1080_1089;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Q1086 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt(); //가로 해상도 w
		int h = sc.nextInt(); //세로 해상도 h
		int b = sc.nextInt(); //한 픽셀을 저장하기 위한 비트 b
		
		int Bit = w * h * b;
		float Byte = (float)(Bit / 8);
		float KByte = (float)(Byte / 1024);
		float MByte = (float)(KByte / 1024);
		
		System.out.printf("%.2f MB\n", MByte);
		
		System.out.println(Math.round(MByte * 100) / 100.0 + " MB");
		
		System.out.println(String.format("%.2f", MByte) + " MB");
		
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println(df.format(MByte) + " MB");
	}
}
