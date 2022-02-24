package codeup_basic100.q1090_1099;

import java.util.Scanner;

public class Q1098 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt(); //�������� ����(h)
		int w = sc.nextInt(); //�������� ����(w)
		int[][] arr = new int[h][w]; //������ �迭 ����
		
		int n = sc.nextInt(); //���� �� �ִ� ������ ����(n)
		for(int k = 0; k < n; k++) {
			int l = sc.nextInt(); //������ ����(l)
			int d = sc.nextInt(); //������ ����(d) -> ���δ� 0, ���δ� 1
			int x = sc.nextInt() - 1; //x ��ǥ
			int y = sc.nextInt() - 1; //y ��ǥ
			
			for(int c = 0; c < l; c++) { //������ ���̸�ŭ �ݺ�
				arr[x][y] = 1; //���밡 ���̴� �������� 1 ����
				if(d == 0)	y++; //���ι�ġ��� x���� ������ �������� y���� ������Ŵ
				else	x++; //���� �ݴ�
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
