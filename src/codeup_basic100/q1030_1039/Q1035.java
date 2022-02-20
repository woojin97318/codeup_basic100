package codeup_basic100.q1030_1039;

import java.util.Scanner;

public class Q1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		int hex = Integer.parseInt(num, 16);
		System.out.println(Integer.toOctalString(hex));
	}
}
