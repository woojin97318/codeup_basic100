package codeup_basic100.q1010_1019;

import java.util.Scanner;

public class Q1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date[] = sc.next().split("\\.");
		int y = Integer.parseInt(date[0]);
		int m = Integer.parseInt(date[1]);
		int d = Integer.parseInt(date[2]);
		System.out.printf("%d.%02d.%02d", y, m, d);
		
		/*
		 * '.'이 아닌 '\\.'로 작성한 이유는
		 * split의 인자로 들어가는 String 토큰이 regex 정규식이기 때문이다.
		 * 정규식에서 .은 무작위의 한 글자를 의미한다. 그러면 모든 문자가 토큰이 되기 때문에
		 * 배열에 남는 게 없게 되는 것이다.
		 * 
		 * 따라서 이스케이프 문자를 앞에 붙여줘야 한다. 그런데 String 안에 이스케이프 문자인 \를
		 * 써 주려면 \\라고 써야한다. 따라서 \\라고 쓰는 것이다.
		 * 그래서 \\. 이라고 쓰면 정규식 쪽에서는 \.라고 인식을 하고 실제 .을 찾게된다.
		 */
	}
}
