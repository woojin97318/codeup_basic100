package codeup_basic100.q1080_1089;

import java.util.Scanner;

public class Q1088 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = 1; i <= num; i++) {
			if(i % 3 != 0)
				System.out.print(i + " ");
		}
	}
}
