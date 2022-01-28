package Primitive;

import java.util.Scanner;

public class Float {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so a: ");
		float a = sc.nextFloat();
		System.out.println("Nhap vao so b: ");
		float b = sc.nextFloat();
		
		float tong = a + b;
		float hieu = a - b;
		
		float thuong = a / b;
		
		float tich = a * b;
		
		System.out.println("Tong cua hai so " + a + " và " + b + " là " + tong);
		System.out.println("Hieu cua hai so " + a + " và " + b + " là " + hieu);
		System.out.println("Ket qua cua phep chia hai so " + a + " và " + b + " là " + thuong );
		System.out.println("Tich cua hai so " + a + " và " + b + " là " + tich);
		sc.close();
	}
}
