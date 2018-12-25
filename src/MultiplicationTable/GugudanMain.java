package MultiplicationTable;

import java.util.Scanner;

public class GugudanMain {
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
			Test.calculate(times);
		}
	}
}
