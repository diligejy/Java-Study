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
	 * System.out.println("구구단 중 출력할 단은? : "); Scanner scanner = new
	 * Scanner(System.in); int number = scanner.nextInt(); if (number < 2) {
	 * System.out.println("값 잘못 입력했어용"); } else if (number > 9) {
	 * System.out.println("제대로좀 입력해봐"); } else { System.out.println("입력하신 단은 " +
	 * number + "단입니다"); for (int i = 1; i < 10; i++) { int result = number * i;
	 * System.out.println(result); } }
	 */

}
