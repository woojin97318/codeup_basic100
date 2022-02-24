package codeup_basic100.q1090_1099;

import java.util.Scanner;

public class Q1098 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); //격자판의 세로(h)
		int w = sc.nextInt(); //격자판의 가로(w)
		int[][] arr = new int[h][w]; //격자판 배열 지정
		
		int n = sc.nextInt(); //놓을 수 있는 막대의 개수(n)
		for(int k = 0; k < n; k++) {
			int l = sc.nextInt(); //막대의 길이(l)
			int d = sc.nextInt(); //막대의 방향(d) -> 가로는 0, 세로는 1
			int x = sc.nextInt() - 1; //x 좌표
			int y = sc.nextInt() - 1; //y 좌표
			
			for(int c = 0; c < l; c++) { //막대의 길이만큼 반복
				arr[x][y] = 1; //막대가 놓이는 시작점에 1 대입
				if(d == 0)	y++; //가로배치라면 x값은 변하지 않음으로 y값을 증감시킴
				else	x++; //위와 반대
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
