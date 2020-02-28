package hoccaicuaquang;

import java.util.Scanner;

public class trycatch {

	public static void main(String[] args) {
		int a;
		Scanner scanner=new Scanner(System.in);
		try {
			System.out.println("nhap a=");
			a=scanner.nextInt();
		} catch (Exception e) {
			System.out.println("dư lieu sai xin hay  nhap lai ");
		}
	}

}
