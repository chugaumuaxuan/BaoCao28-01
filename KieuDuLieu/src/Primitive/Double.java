package Primitive;

import java.util.Scanner;

public class Double {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		double a = sc.nextDouble();
		System.out.println("Nhap vao so b: ");
		double b = sc.nextDouble();
		
		double tong = a + b;
		double hieu = a - b;
		
		double thuong = a / b;
		
		double tich = a * b;
		
		System.out.println("Tong cua hai so " + a + " và " + b + " là " + tong);
		System.out.println("Hieu cua hai so " + a + " và " + b + " là " + hieu);
		System.out.println("Ket qua cua phep chia hai so " + a + " và " + b + " là " + thuong );
		System.out.println("Tich cua hai so " + a + " và " + b + " là " + tich);
		sc.close();
	}
}
