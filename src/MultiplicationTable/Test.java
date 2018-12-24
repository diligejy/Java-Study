package MultiplicationTable;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은? : ");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		System.out.println("number : " + number);
		for (int i = 1; i < 10; i++) {
			int result = number * i;
			System.out.println(result);
		}
	}
}
