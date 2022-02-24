package codeup_basic100.q1090_1099;

import java.util.Scanner;

public class Q1099 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[10][10];
		
		//�̷� ������ ������ ������ ��ġ�� �Է�
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int x = 1; //��� x ��ǥ
		int y = 1; //��� y ��ǥ
		while(true) {
			//��������
			if(arr[x][y+1] == 1 && arr[x+1][y] == 1 || arr[x][y] == 2) {
				arr[x][y] = 9; //�������� 9 ����
				break; //�̵� �ߴ�
			}
			arr[x][y] = 9; //������� �� �̵����� 9 ����
			
			if(arr[x][y+1] == 0) { //������ ���� �ִٸ�
				y += 1; //��������(y��) ��ĭ �̵�(1����)
				continue;
			}else { //������ ���� ���ٸ�
				x += 1; //�Ʒ���(x��) ��ĭ �̵�(1����)
				continue;
			}
		}
		
		//���
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
