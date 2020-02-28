package nhungbaitoancoban;

import java.io.InputStream;
import java.math.BigInteger;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Scanner;
import java.net.InetAddress;

public class KhongDungDeQuy {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		InetAddress();
		
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
		System.out.println("c = UCLN(a,b) = "+UCLN(a, b));
		System.out.println("c = UCLN(a,b) = "+UCLN1(a, b));
		System.out.println("c = BCNN(a,b) = "+BCNN(a, b));
		System.out.println(" số nguyên tố bé hơn a là ");
		for (BigInteger i = new BigInteger("2"); i.compareTo(a)<0; i=i.add(new BigInteger("1"))) {
			if (ktsnt(i)) {
				System.out.print(i+"    ");
			}
		}
		System.out.println();
		System.out.println(" số hoàn hảo bé hơn a là ");
		for (BigInteger i = new BigInteger("2"); i.compareTo(a)<0; i=i.add(new BigInteger("1"))) {
			if (ktshh(i)) {
				System.out.print(i+"    ");
			}
		}
		URL();
	}
	private static BigInteger UCLN(BigInteger a,BigInteger b) {
		ArrayList<BigInteger>TSNTa=new ArrayList<BigInteger>();
		ArrayList<BigInteger>TSNTb=new ArrayList<BigInteger>();
		// phân tích ra thừa số nguyên tố
		while (!ktsnt(a)) {
			for (BigInteger i = new BigInteger("2"); i.compareTo(a.divide(new BigInteger("2")))<=0; i=i.add(new BigInteger("1"))) {
				if (ktsnt(i)&&a.mod(i).equals(new BigInteger("0"))) {
					TSNTa.add(i);
					a=a.divide(i);
					break;
				}
			}	
		}
		TSNTa.add(a);
		while (!ktsnt(b)) {
			for (BigInteger i = new BigInteger("2"); i.compareTo(b.divide(new BigInteger("2")))<=0; i=i.add(new BigInteger("1"))) {
				if (ktsnt(i)&&b.mod(i).equals(new BigInteger("0"))) {
					TSNTb.add(i);
					b=b.divide(i);
					break;
				}
			}
		}
		TSNTb.add(b);
		BigInteger UCLN=new BigInteger("1");
		for (int i = 0; i < TSNTa.size(); i++) {
			for (int j = 0; j < TSNTb.size(); j++) {
				if (TSNTa.get(i).equals(TSNTb.get(j))) {
					UCLN=UCLN.multiply(TSNTa.get(i));
					TSNTa.remove(i);
					TSNTb.remove(j);
					i--;
					break;
					
				}
			}
		}
		return UCLN;
	}
	private static BigInteger UCLN1(BigInteger a,BigInteger b) {
		while (!(a.compareTo(b)==0)) {
			if (a.compareTo(b)>0) {
				a=a.subtract(b);
				
			} else {
				b=b.subtract(a);
			}			
		}
		return a;
	}
	private static boolean ktsnt(BigInteger a) {
		BigInteger j=new BigInteger("1");
		BigInteger i=new BigInteger("2");
		// a=2
		if (a.compareTo(i)==0) {
			return true;
		}
		// a<2
		if (a.compareTo(i)<0) {
			return false;
		}
		// a>2
		//i chạy từ 2 đến căng bậc 2 của a
		while (i.compareTo(a.sqrt())<=0) {
			
			if (a.mod(i).equals(new BigInteger("0"))) {
				return false;
			}
			i=i.add(j);
		}
		return true;			
	}
	
	public static BigInteger BCNN(BigInteger a,BigInteger b) {
		BigInteger c=new BigInteger("2");
		BigInteger d;
		if (a.compareTo(b)>0) {
			d=a;
			while (!d.mod(b).equals(new BigInteger("0"))) {
				d=a.multiply(c);
				c=c.add(new BigInteger("1"));
			}	
		}
		else {
			d=b;
			while (!d.mod(a).equals(new BigInteger("0"))) {
				d=b.multiply(c);
				c=c.add(new BigInteger("1"));
			}
		}
		return d;
	}
	
	public static boolean ktshh(BigInteger a) {
		BigInteger tong=new BigInteger("1");
		for (BigInteger i = new BigInteger("2"); i.compareTo(a.divide(new BigInteger("2")))<=0; i=i.add(new BigInteger("1"))) {
			if (a.mod(i).equals(new BigInteger("0"))) {
				tong=tong.add(i);
			}
		}
		if (tong.compareTo(a)==0) {
			return true;
		}
		return false;
	}
	public static boolean ktshh1(BigInteger a) {
		BigInteger tong=new BigInteger("1");
		BigInteger b=a.divide(new BigInteger("2"));
		for (BigInteger i = new BigInteger("2"); i.compareTo(b)<=0; i=i.add(new BigInteger("1"))) {
			if (a.mod(i).equals(new BigInteger("0"))) {
				tong=tong.add(i);
				tong=tong.add(a.divide(i));
				b=a.divide(i).divide(new BigInteger("2"));
			}
		}
		if (tong.compareTo(a)==0) {
			return true;
		}
		return false;
	}
	public static void URL() {
		try {
			java.net.URL url=new java.net.URL("https://yg/uy/");
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getFile());
			System.out.println(url);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	// in ra cái trang web 
	public static void URLConnextion() {
		try {
			java.net.URL url=new java.net.URL("https://www.youtube.com/");
			URLConnection urlConnection=url.openConnection();
			InputStream inputStream=urlConnection.getInputStream();
			int i=inputStream.read();
			while (i!=-1) {
				System.out.print((char) i);
				i=inputStream.read();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void HttpURLConnextion() {
		try {
			java.net.URL url =new java.net.URL("https://www.youtube.com/");
			HttpURLConnection httpURLConnection=(HttpURLConnection) url.openConnection();
			for (int i = 0; i < httpURLConnection.getHeaderFields().size(); i++) {
				System.out.println(httpURLConnection.getHeaderFieldKey(i)+" = "+httpURLConnection.getHeaderField(i));
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void InetAddress() {
		try {
			java.net.InetAddress inetAddress=java.net.InetAddress.getByName("10.0.138.46");
			System.out.println(inetAddress.getHostAddress());
			System.out.println(inetAddress.getHostName());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	public static boolean ktnamnhuan(BigInteger nam) {
		
		return false;
	}
}
