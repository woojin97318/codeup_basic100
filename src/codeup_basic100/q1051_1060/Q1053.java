package codeup_basic100.q1051_1060;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1053 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		if(n == 1)
			System.out.println(0);
		else if(n == 0)
			System.out.println(1);
//		--------------
		System.out.println(n == 1 ? 0 : 1);
	}
}
