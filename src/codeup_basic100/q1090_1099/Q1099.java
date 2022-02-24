package codeup_basic100.q1090_1099;

import java.util.Scanner;

public class Q1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[10][10];
		
		//미로 상자의 구조와 먹이의 위치가 입력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int x = 1; //출발 x 좌표
		int y = 1; //출발 y 좌표
		while(true) {
			//종료조건
			if(arr[x][y+1] == 1 && arr[x+1][y] == 1 || arr[x][y] == 2) {
				arr[x][y] = 9; //종료지점 9 대입
				break; //이동 중단
			}
			arr[x][y] = 9; //출발지점 및 이동지점 9 대입
			
			if(arr[x][y+1] == 0) { //우측에 길이 있다면
				y += 1; //우측으로(y값) 한칸 이동(1증가)
				continue;
			}else { //우측에 길이 없다면
				x += 1; //아래로(x값) 한칸 이동(1증가)
				continue;
			}
		}
		
		//출력
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
