package codeup_basic100.q1070_1079;

import java.util.Scanner;

public class Q1070 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int month = sc.nextInt();
		
		if(month >= 3 && month <= 5) {
			System.out.println("spring");
		}else if(month >= 6 && month <= 8) {
			System.out.println("summer");
		}else if(month >= 9 && month <= 11) {
			System.out.println("fall");
		}else {
			System.out.println("winter");
		}
	}
}
