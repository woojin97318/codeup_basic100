package codeup_basic100.q1070_1079;

import java.util.Scanner;

public class Q1076 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char a = 'a';
		char c = sc.next().charAt(0);
		do {
			System.out.print(a++ + " ");
		}while(a <= c);
	}
}
