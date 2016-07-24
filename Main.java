package exceptionHandling;

import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		while (true) {
			try {
				Scanner input = new Scanner(System.in);
				System.out.println("Enter side1:");
				int side1 = input.nextInt();
				System.out.println("Enter side2:");
				int side2 = input.nextInt();
				System.out.println("Enter side3:");
				int side3 = input.nextInt();

				Triangle triangle = new Triangle(side1, side2, side3);
				if (!(side1 + side2 < side3) || (side1 + side3 < side2)
						|| (side2 + side3 < side1)) {
					System.out.println("OK");
					break;
				}
			} catch (IllegalArgumentException ex) {
				System.out.println("IllegalArgumentException, try again");
			}
		}
	}

}
