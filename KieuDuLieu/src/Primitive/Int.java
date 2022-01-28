package Primitive;

import java.util.Scanner;

public class Int {
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		int a = sc.nextInt();
		System.out.println("Nhap vao so b: ");
		int b = sc.nextInt();
		
		int tong = a + b;
		int hieu = a - b;
		
		int thuong = a / b;
		int du = a % b;
		
		int tich = a * b;
		
		System.out.println("Tong cua hai so " + a + " và " + b + " là " + tong);
		System.out.println("Hieu cua hai so " + a + " và " + b + " là " + hieu);
		System.out.println("Ket qua cua phep chia hai so " + a + " và " + b + " là " + thuong + " du " + du);
		System.out.println("Tich cua hai so " + a + " và " + b + " là " + tich);
		sc.close();
	}

}
