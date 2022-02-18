package codeup_basic100.q1071_1080;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1073 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String num[] = br.readLine().split(" ");
		int i = 0;
		while(true) {
			if(num[i].equals("0"))
				break;
			else
				System.out.println(num[i++]);
		}
	}
}
