package hoccaicuaquang;

import java.util.Scanner;


public class cactoantu {
	public static void chenchuoi(String s) {
		StringBuilder stringBuilder=new StringBuilder(s);
		String b=new Scanner(System.in).nextLine();
		stringBuilder.insert(3, b);
		s=stringBuilder.toString();
		System.out.println(s);
	}

       public static void main(String[] args) {
		int x=8;
		int y=2;
		int k=3;
		int z=--y+ ++x;
		System.out.println(z+"\t"+x+"\t"+y+"\t"+k);
		String a="swiiwiiiww ưiis";
		chenchuoi(a);
       } 
}
