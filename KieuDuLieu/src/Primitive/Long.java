package Primitive;

import java.util.Scanner;

public class Long {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		long a = sc.nextLong();
		System.out.println("Nhap vao so b: ");
		long b = sc.nextLong();
		
		long tong = a + b;
		long hieu = a - b;
		
		long thuong = a / b;
		long du = a % b;
		
		long tich = a * b;
		
		System.out.println("Tong cua hai so " + a + " và " + b + " là " + tong);
		System.out.println("Hieu cua hai so " + a + " và " + b + " là " + hieu);
		System.out.println("Ket qua cua phep chia hai so " + a + " và " + b + " là " + thuong + " du " + du);
		System.out.println("Tich cua hai so " + a + " và " + b + " là " + tich);
		sc.close();
	}
}
