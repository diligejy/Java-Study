package MultiplicationTable;

import java.util.Scanner;

public class Test {
	public static int[] Calculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
			System.out.println(result[i]);
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println("2���� 9������ ���� �Է��ϼ���");
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		if (times < 2) {
			System.out.println("�ʹ� ������ �Ƴ�?");
		} else if (times > 9) {
			System.out.println("9���� ������ �������");
		} else {
			System.out.println("�ϰ� �Է��� ���� " + times + "���Դϴ�");
			Calculate(times);
		}
			
		/*
		 * int[] result = new int[9]; for (int i = 0; i < result.length; i++) { for (int
		 * j = 2; j <= 9; j++) { result[i] = j * (i + 1);
		 * 
		 * 
		 * }
		 * 
		 * }
		 */
		/*
		 * System.out.println("������ �� ����� ����? : "); Scanner scanner = new
		 * Scanner(System.in); int number = scanner.nextInt(); if (number < 2) {
		 * System.out.println("�� �߸� �Է��߾��"); } else if (number > 9) {
		 * System.out.println("������� �Է��غ�"); } else { System.out.println("�Է��Ͻ� ���� " +
		 * number + "���Դϴ�"); for (int i = 1; i < 10; i++) { int result = number * i;
		 * System.out.println(result); } }
		 */

	}
}
