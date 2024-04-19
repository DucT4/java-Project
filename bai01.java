package demoJava;

import java.util.Scanner;

public class bai01 {
	public static void main(String[] args) {
//		Viết chương trình cho phép nhập tên sinh viên, điểm trung bình từ bàn phím.

		Scanner scanner = new Scanner(System.in);
		System.out.println("Name :");
		String name = scanner.nextLine();
		System.out.println("point :");
		int point = scanner.nextInt();
		System.out.println(name + " co diem la " + point);
		scanner.close();
	}
}
