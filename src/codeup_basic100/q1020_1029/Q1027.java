package codeup_basic100.q1020_1029;

import java.util.Scanner;

public class Q1027 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String yms[] = sc.next().split("\\.");
		int cnt = yms.length - 1;
		while(true) {
			System.out.print(yms[cnt]);
			if(cnt != 0) {
				System.out.print("-");
				cnt--;
			}
			else {
				break;
			}
		}
	}
}
