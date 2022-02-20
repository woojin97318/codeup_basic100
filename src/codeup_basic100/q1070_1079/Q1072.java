package codeup_basic100.q1070_1079;

import java.util.Scanner;

public class Q1072 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int list[] = new int[num];
		for(int i = 0; i < num; i++) {
			list[i] = sc.nextInt();
		}
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
