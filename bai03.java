package demoJava;

import java.util.Scanner;

public class bai03 {
	// tính thể tích khối lập phương.
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("canh :");
		int canh = scanner.nextInt();
		double theTich = Math.pow(canh, 3);
		System.out.println(" The tich khoi lap phuong : " + theTich);
		scanner.close();
	}
}
