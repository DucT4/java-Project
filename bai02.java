package demoJava;

import java.util.Scanner;

public class bai02 {
	public static void main(String[] args) {
		// Viết chương trình nhập từ bàn phím 2 cạnh của 1 hình chữ nhật.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap canh 1:");
		int a = scanner.nextInt();
		System.out.println("Nhap canh 2");
		int b = scanner.nextInt();
		System.out.println(" Dien tich hcn : " + a * b);
		System.out.println(" Chu vi hcn : " + (a + b) * 2);
		System.out.println(" canh nho nhat cua hcm : " + Math.min(a, b));
		scanner.close();
	}
}
