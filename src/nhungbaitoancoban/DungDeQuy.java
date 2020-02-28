package nhungbaitoancoban;

import java.math.BigInteger;
import java.util.Scanner;


public class DungDeQuy {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		
		System.out.print("nhập số a = ");
		BigInteger a=scanner.nextBigInteger();
		System.out.print("nhập số b = ");
		BigInteger b=scanner.nextBigInteger();
		BigInteger c=a.add(b);
		System.out.println("tổng c = a+b = "+c);
		c=a.subtract(b);
		System.out.println("hiệu c = a - b = "+c);
		c=a.multiply(b);
		System.out.println("nhân c = a * b = "+c);
		c=a.divide(b);
		System.out.println("chia c = a / b = "+c);
		c=a.mod(b);
		System.out.println("chia lấy dư c = "+c);
		c=a.sqrt();
		System.out.println("căn bật 2 của a : c = "+c);
		c=a.gcd(b);
		System.out.println("c = UCLN(a,b) = "+c);
		c=a.compareTo(b)>0?a:b;
		c=c.divide(new BigInteger("2"));
		System.out.println("c = UCLN(a,b) = "+UCLN(a, b,c));
		System.out.println("c = UCLN(a,b) = "+UCLN1(a, b));
		System.out.println("c = BCNN(a,b) = "+BCNN(a, b, new BigInteger("1")));
		System.out.println(" số nguyên tố bé hơn a là ");
		for (BigInteger i = new BigInteger("2"); i.compareTo(a)<0; i=i.add(new BigInteger("1"))) {
			if (ktsnt(i,i.sqrt())) {
				System.out.print(i+"    ");
			}
		}
		System.out.println();
		System.out.println(" số hoàn hảo bé hơn a là ");
		for (BigInteger i = new BigInteger("2"); i.compareTo(a)<0; i=i.add(new BigInteger("1"))) {
			if (ktshh(i,new BigInteger("2"),i)) {
				System.out.print(i+"    ");
			}
		}
		System.out.println();
		System.out.println(" số hoàn hảo bé hơn a là ");
		for (BigInteger i = new BigInteger("2"); i.compareTo(a)<0; i=i.add(new BigInteger("1"))) {
			if (ktshh1(i,new BigInteger("2"),i.divide(new BigInteger("2")),i)) {
				System.out.print(i+"    ");
			}
		}	
		
	}
	private static BigInteger UCLN(BigInteger a,BigInteger b,BigInteger c) {
		if (c.compareTo(new BigInteger("1"))==0) {
			return c;
		}
		if (a.mod(c).equals(new BigInteger("0"))&& b.mod(c).equals(new BigInteger("0"))) {
			a=a.divide(c);
			b=b.divide(c);
			return c.multiply(UCLN(a, b, c.subtract(new BigInteger("1"))));
		}
		return UCLN(a, b, c.subtract(new BigInteger("1")));
	}
	
	private static BigInteger UCLN1(BigInteger a,BigInteger b) {
		if (a.compareTo(b)==0) {
			return a;
		}
		return a.compareTo(b)>0?UCLN1(a.subtract(b), b):UCLN1(a, b.subtract(a));
	}
	private static boolean ktsnt(BigInteger a,BigInteger b ){

		if (a.compareTo(new BigInteger("2"))<0) {
			return false;
		}
		if (a.compareTo(new BigInteger("2"))==0||b.compareTo(new BigInteger("2"))<0) {
			return true;
		}
		if (a.mod(b).compareTo(new BigInteger("0"))==0) {
			return false;
		}
		return ktsnt(a, b.subtract(new BigInteger("1")));	
	}
	
	public static BigInteger BCNN(BigInteger a,BigInteger b,BigInteger c) {
		BigInteger d;
		if (a.compareTo(b)>0) {
			d=a.multiply(c);
			return d.mod(b).equals(new BigInteger("0"))?d:BCNN(a, b, c.add(new BigInteger("1")));
		} else {
			d=b.multiply(c);
			return d.mod(a).equals(new BigInteger("0"))?d:BCNN(a, b, c.add(new BigInteger("1")));
		}
	}

	public static boolean ktshh(BigInteger a, BigInteger i,BigInteger b) {
		for (; i.compareTo(a.divide(new BigInteger("2")).add(new BigInteger("1")))<0; i=i.add(new BigInteger("1"))) {
			if (a.mod(i).equals(new BigInteger("0"))) {
				return ktshh(a,i.add(new BigInteger("1")),b.subtract(i));
			}
		}
		if (b.compareTo(new BigInteger("1"))==0) {
			return true;
		}
		else {
			return false;
		}
		
	}
	public static boolean ktshh1(BigInteger a,BigInteger i,BigInteger b,BigInteger d) {
		for (; i.compareTo(b)<=0; i=i.add(new BigInteger("1"))) {
			if (a.mod(i).equals(new BigInteger("0"))) {
				return ktshh1(a, i.add(new BigInteger("1")), a.divide(i).divide(new BigInteger("2")), d.subtract(i.add(a.divide(i))));
			}
		}
		if (d.compareTo(new BigInteger("1"))==0) {
			return true;
		}
		else {
			return false;
		}
	}	
}
