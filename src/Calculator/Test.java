package Calculator;

import java.util.Scanner;

public class Test {

	static int calculate(String symbol, int first, int second) {
		int result = first;
		if(symbol.equals("+")) {
			result = result + second;
			System.out.println("덧셈 : " + result);
		}else if(symbol.equals("-")) {
			result = result - second;
			System.out.println("뺄셈 : " + result);
		}else if(symbol.endsWith("*")) {
			result = result * second;
			System.out.println("곱셈 : " + result);
		}else if(symbol.endsWith("/")) {
			result = result / second;
			System.out.println("나눗셈 : " + result );
		}else {
			System.out.println("사칙연산 기호가 아닙네다");
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int first = Input.getFirstValue(scanner);
		int result = first;
		while (true) {
			String symbol = Input.getSymbol(scanner);

			if ("quit".equals(symbol)) {
				Output.print(result);
				break;
			}

			int second = Input.getSecondValue(scanner);

			result = calculate(symbol, result, second);
		}

	}

	

/*
 * public static void main(String[] args) { System.out.println("첫 번째 값을 입력하세요");
 * Scanner sc1 = new Scanner(System.in); int u1 = sc1.nextInt();
 * System.out.println("두 번째 값을 입력하세요."); Scanner sc2 = new Scanner(System.in);
 * int u2 = sc2.nextInt(); System.out.println("입력하신 값은 " + u1 + ", " + u2 +
 * "입니다");
 * 
 * System.out.println("사칙 연산 중 원하는 연산자를 입력하세요"); Scanner scanner = new
 * Scanner(System.in); String symbol = scanner.next(); if ("+".equals(symbol)) {
 * System.out.println("덧셈의 결과는" + (u1 + u2) + "입니다"); } else if
 * ("-".equals(symbol)) { System.out.println("뺄셈의 결과는" + (u1 - u2) + "입니다"); }
 * else if ("*".equals(symbol)) { System.out.println("곱셈의 결과는" + (u1 * u2) +
 * "입니다"); } else if ("/".equals(symbol)) { System.out.println("나눗셈의 결과는" +
 * ((double) u1 / u2) + "입니다"); } else {
 * System.out.println("사칙연산에 해당하지 않는 값을 입력했습니다."); }
 */
}

}
