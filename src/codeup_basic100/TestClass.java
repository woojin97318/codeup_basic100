package codeup_basic100;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// �ʱ� �迭���� �� �� ����
		int arr[] [] = new int[19][19];
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; i < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}

		// ��� ���
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; i < arr.length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
