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
		System.out.println("2에서 9사이의 값을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int times = sc.nextInt();
		if (times < 2) {
			System.out.println("너무 적은거 아녀?");
		} else if (times > 9) {
			System.out.println("9보다 작은거 넣으라고");
		} else {
			System.out.println("니가 입력한 값은 " + times + "단입니다");
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
		 * System.out.println("구구단 중 출력할 단은? : "); Scanner scanner = new
		 * Scanner(System.in); int number = scanner.nextInt(); if (number < 2) {
		 * System.out.println("값 잘못 입력했어용"); } else if (number > 9) {
		 * System.out.println("제대로좀 입력해봐"); } else { System.out.println("입력하신 단은 " +
		 * number + "단입니다"); for (int i = 1; i < 10; i++) { int result = number * i;
		 * System.out.println(result); } }
		 */

	}
}
