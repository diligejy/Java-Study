package MultiplicationTable;

import java.util.Scanner;

public class Test {
	public static int[] calculate(int times) {
		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) {
			result[i] = times * (i + 1);
			System.out.println(result[i]);
		}
		return result;
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
