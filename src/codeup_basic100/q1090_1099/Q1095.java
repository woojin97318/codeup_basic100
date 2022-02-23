package codeup_basic100.q1090_1099;

import java.util.Scanner;

public class Q1095 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int min = 24;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			min = min > arr[i] ? arr[i] : min;
		}
		System.out.println(min);
	}
}
