package codeup_basic100.q1090_1099;

import java.util.Scanner;

public class Q1093 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //출석 번호를 부른 횟수
		int arr[] = new int[24];
		for(int i = 1; i <= n; i++) {
			int t = sc.nextInt(); //부른 출석번호
			arr[t] += 1;
		}
		for(int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
