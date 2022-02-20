package codeup_basic100.q1070_1079;

import java.util.Scanner;

public class Q1074 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		while(num > 0) {
			System.out.println(num--);
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
