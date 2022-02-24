package codeup_basic100.q1090_1099;

import java.util.Scanner;

public class Q1096 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[19][19];
		int n = sc.nextInt(); //바둑판에 올려 놓을 흰 돌의 개수(n)
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x - 1][y - 1] = 1;
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
