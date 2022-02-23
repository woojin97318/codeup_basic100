package codeup_basic100;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = sc.nextInt();
			System.out.println(arr[9-i]);
		}
	}
}
