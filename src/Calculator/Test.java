package Calculator;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("첫 번째 값을 입력하세요");
		Scanner sc1 = new Scanner(System.in);
		int u1 = sc1.nextInt();
		System.out.println("두 번째 값을 입력하세요.");
		Scanner sc2 = new Scanner(System.in);
		int u2 = sc2.nextInt();
		System.out.println("입력하신 값은 " + u1 +", "+ u2 + "입니다");
		System.out.println("덧셈의 결과는" + (u1+u2) + "입니다");
		System.out.println("뺄셈의 결과는" + (u1-u2) + "입니다");
		System.out.println("곱셈의 결과는" + (u1*u2) + "입니다");
		System.out.println("나눗셈의 결과는" + ((double)u1/u2) + "입니다");
	}
	
}
