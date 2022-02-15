package codeup_basic100.q1050_1059;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1052 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num[] = br.readLine().split(" ");
		int a = Integer.parseInt(num[0]);
		int b = Integer.parseInt(num[1]);
		if(a != b)
			System.out.println(1);
		else
			System.out.println(0);
	}
}
