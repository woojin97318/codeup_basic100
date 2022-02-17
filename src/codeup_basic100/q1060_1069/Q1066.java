package codeup_basic100.q1060_1069;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1066 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String num[] = br.readLine().split(" ");
		for(int i = 0; i < num.length; i++) {
			if(Integer.parseInt(num[i]) % 2 == 0)
				System.out.println("even");
			else
				System.out.println("odd");				
		}
	}
}
