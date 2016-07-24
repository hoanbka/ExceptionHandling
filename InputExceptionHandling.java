package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputExceptionHandling {

	public static void main(String[] args) {
		// User enters one integer number from keyboard.
		while (true) {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("Plz enter integer number from keyboard:");
				int number = input.nextInt();
				System.out.println("number = " + number);
				break;
			} catch (InputMismatchException ex) {
				System.out.println("Integer number is required");
			}

		}
	}
}
