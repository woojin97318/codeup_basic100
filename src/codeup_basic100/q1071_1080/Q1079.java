package codeup_basic100.q1071_1080;

import java.util.Scanner;

public class Q1079 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char c;
		while(true) {
			c = sc.next().charAt(0);
			System.out.println(c);
			if(c == 'q')
				break;
		}
	}
}
