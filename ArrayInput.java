package exceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		while (true) {
			try {
				Scanner input = new Scanner(System.in);
				int arr[] = new int[10];
				System.out.println("Enter the position in the array :");
				int pos = input.nextInt();
				System.out.println("Enter value for the position pos:");
				arr[pos] = input.nextInt();
				System.out.println("arr[" + pos + "] = " + arr[pos]);
				break;
			} catch (ArrayIndexOutOfBoundsException ex) {
				System.out.println("Position should be >=0 and <=9");
			} catch (InputMismatchException ex) {
				System.out.println("Integer number is required");
			}

		}
	}
}
