package codeup_basic100.q1080_1089;

import java.util.Scanner;

public class Q1084 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int g = sc.nextInt();
		int b = sc.nextInt();
		int cnt = 0;
		for(int x = 0; x < r; x++) {
			for(int y = 0; y < g; y++) {
				for(int z = 0; z < b; z++) {
					System.out.printf("%d %d %d\n", x, y, z);
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
