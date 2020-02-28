package gametrenmang;

import java.util.ArrayList;
import java.util.Scanner;

public class Nhap1mangtinhsocacsochinhphuongtrongdo {
	static ArrayList<Integer>mangArrayList=new ArrayList<Integer>();
	public static boolean ktscp(int a) {
		int b=(int) Math.sqrt(a);
		if (a==(int) Math.pow(b, 2)) {
			return true;
		}
		return false;
	}
	public static void nhap(int n) {
		for (int i = 0; i < n; i++) {
			System.out.println("a["+i+"]= ");
			int a=new Scanner(System.in).nextInt();
			mangArrayList.add(a);
		}
	}
	public static int tongSCP(int n) {
		if (n==-1) {
			return 0;
		}
		return ktscp(mangArrayList.get(n))?mangArrayList.get(n)+tongSCP(n-1):tongSCP(n-1);
	}
	public static void main(String[] args) {
		System.out.print(" nhập số phần tử : ");
		int n=new Scanner(System.in).nextInt();
		nhap(n);
		System.out.print("kết quả : "+tongSCP(n-1));
	}
}
