package Calculator;

import java.util.Scanner;

public class Test {

	static int calculate(String symbol, int first, int second) {
		int result = first;
		if(symbol.equals("+")) {
			result = result + second;
			System.out.println("���� : " + result);
		}else if(symbol.equals("-")) {
			result = result - second;
			System.out.println("���� : " + result);
		}else if(symbol.endsWith("*")) {
			result = result * second;
			System.out.println("���� : " + result);
		}else if(symbol.endsWith("/")) {
			result = result / second;
			System.out.println("������ : " + result );
		}else {
			System.out.println("��Ģ���� ��ȣ�� �ƴճ״�");
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
 * public static void main(String[] args) { System.out.println("ù ��° ���� �Է��ϼ���");
 * Scanner sc1 = new Scanner(System.in); int u1 = sc1.nextInt();
 * System.out.println("�� ��° ���� �Է��ϼ���."); Scanner sc2 = new Scanner(System.in);
 * int u2 = sc2.nextInt(); System.out.println("�Է��Ͻ� ���� " + u1 + ", " + u2 +
 * "�Դϴ�");
 * 
 * System.out.println("��Ģ ���� �� ���ϴ� �����ڸ� �Է��ϼ���"); Scanner scanner = new
 * Scanner(System.in); String symbol = scanner.next(); if ("+".equals(symbol)) {
 * System.out.println("������ �����" + (u1 + u2) + "�Դϴ�"); } else if
 * ("-".equals(symbol)) { System.out.println("������ �����" + (u1 - u2) + "�Դϴ�"); }
 * else if ("*".equals(symbol)) { System.out.println("������ �����" + (u1 * u2) +
 * "�Դϴ�"); } else if ("/".equals(symbol)) { System.out.println("�������� �����" +
 * ((double) u1 / u2) + "�Դϴ�"); } else {
 * System.out.println("��Ģ���꿡 �ش����� �ʴ� ���� �Է��߽��ϴ�."); }
 */
}

}
