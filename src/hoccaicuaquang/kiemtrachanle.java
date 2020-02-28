package hoccaicuaquang;

import java.util.Scanner;

public class kiemtrachanle {

	public static int tongcacchuso(int a) {
		int s=0;
		do {
			s=s+a%10;
			a=a/10;
		} while (a!=0);
		return s;
	}
	public static void pheptinh(double a,double b)
	{
		System.out.print("nhap dau : ");
		String c0=new Scanner(System.in).nextLine();
		switch (c0) {
		case "+":
			System.out.println("a+b="+(a+b));
			break;
		case "-":
			System.out.println("a-b="+(a-b));
			break;
		case "*":
			System.out.println("a*b="+(a*b));
			break;
		case "/":
			if (b==0) {
				System.out.println("ban khong thưc hien được  vì b=0");
				break;
			}
			System.out.println("a/b="+(a/b));
			break;

		default:
			System.out.println("ban da nhap lon phep toan roi ");
			break;
		}
	}
// giai phuong trinh bac 2 : ax^2+b+c=0 
	public static void PTB2(double a,double b,double c) {
		if (a==0) 
		{
			if (b==0&&c==0) 
			{
				System.out.println("phuong trinh vo so nghiem ");
			} 
			else 
			{
                System.out.println("phuong trinh co 1 nghiem duy nhat : x="+(-c/b));                  
			}
		} 
		else 
		{
            double denta=b*b-4*a*c;
            if (denta<0)
            {
				System.out.println("phuong trinh vo nghiem");
			}
            else 
            {
            	if (denta==0) 
            	{
            		System.out.println(" phuong trinh co nghiem kep x1=x2= "+-b/(2*a));
            	}
            	else
            	{
					double x1=(-b+Math.sqrt(denta))/(2*a);
					double x2=(-b-Math.sqrt(denta))/(2*a);
					System.out.println("phuong trinh có 2 nghiem phan biet : x1= "+x1+" ; x2= "+x2);
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double a,b,c;
	/*    System.out.println("giai phuong trinh bat 2 : ax^2+bx+c=0 ");
		do {
			System.out.print("nhap  he so a =");a=scanner.nextDouble();
			System.out.print("nhap  he so b =");b=scanner.nextDouble();
			System.out.print("nhap  he so c =");c=scanner.nextDouble();
			PTB2(a,b,c);
			System.out.print(" co tiep tuc khong (c/k) : ");
			String string=new Scanner(System.in).nextLine();
			if (string.equalsIgnoreCase("k")) {
				break;
			}
		} while (true);	
		System.out.println(" com on ban da dung ");
	
		System.out.print("nhap a= ");a=scanner.nextDouble();
		System.out.print("nhap a= ");b=scanner.nextDouble();
		pheptinh(a, b);
		*/
		System.out.println("nhap so : ");
		int d=scanner.nextInt();
		System.out.println("tong cac chu so cua "+d+" la :"+tongcacchuso(d));
	}

}
