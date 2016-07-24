package exceptionHandling;

import java.util.Scanner;

public class Calculator {

	public static double calculator(String str) {

		String split[] = str.split("\\s+");

		int a = Integer.parseInt(split[0]);
		int b = Integer.parseInt(split[2]);
		if (split[1].equals("+")) {
			return a + b;
		} else if (split[1].equals("-")) {
			return a - b;
		} else if (split[1].equals("x")) {
			return a * b;
		} else {
			try {
				return a / b;
			} catch (ArithmeticException e) {
				System.out.println("Divisor can not be zero");
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		while (true) {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("Enter your string as format 123 + 234:");
				String str = input.nextLine();
				System.out.println(calculator(str));
				break;
			} catch (NumberFormatException ex) {
				System.out
						.println("Incorrect string! Enter your string again please");
			} catch (ArrayIndexOutOfBoundsException ex) {

			}
		}

	}
}
