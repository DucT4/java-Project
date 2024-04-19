package demoJava;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("First number : ");
		int FirstNumber = scanner.nextInt();
		System.out.println("Second number : ");
		int SecondNumber = scanner.nextInt();
		System.out.println("Min number :" + Math.min(FirstNumber, SecondNumber));
		scanner.close();
	}

}
