package codeup_basic100.q1031_1040;

import java.util.Scanner;

public class Q1039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String num[] = sc.nextLine().split(" ");
		long result = Long.parseLong(num[0]) + Long.parseLong(num[1]);
		System.out.println(result);
	}
}
