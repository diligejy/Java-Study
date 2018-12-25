package Calculator;

import java.util.Scanner;

public class StringCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("계산할 값 입력 : ");
		
		String value = scanner.nextLine();
		System.out.println("입력 값 : "+ value);
		
		String[] values = value.split(" ");
		
		int first = Integer.parseInt(values[0]);
		
		int i = 1;
		int result = first;
		while(i < values.length) {
			String symbol = values[i];
			System.out.println("symbol : " + symbol);
			
			int second = Integer.parseInt(values[i + 1]);
			System.out.println("second : " + second);
			
			result = Test.calculate(result, symbol, second);
		}
		
	}
}
