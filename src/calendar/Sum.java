package calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		System.out.println("두 수를 입력하세요");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("합은 " + (num1+num2)+"입니다");
		sc.close();
	}
}
