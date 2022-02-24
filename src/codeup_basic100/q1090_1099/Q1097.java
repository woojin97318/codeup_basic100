package codeup_basic100.q1090_1099;

import java.util.Scanner;

public class Q1097 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 초기 배열선언 및 값 대입
		int[][] arr = new int[19][19];		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 십자 뒤집기
		int n = sc.nextInt(); //십자 뒤집기 횟수(n)
		for(int i = 0; i < n; i++) {
			int x = sc.nextInt() - 1;
			int y = sc.nextInt() - 1;
			
			for(int a = 0; a < arr.length; a++) {
				if(arr[x][a] == 0)	arr[x][a] = 1;
				else	arr[x][a] = 0;
			}
			for(int b = 0; b < arr.length; b++) {
				if(arr[b][y] == 0)	arr[b][y] = 1;
				else	arr[b][y] = 0;
			}
		}
		
		// 결과 출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
