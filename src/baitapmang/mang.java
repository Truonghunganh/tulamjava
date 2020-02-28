package baitapmang;

import java.util.Random;
import java.util.Scanner;

public class mang {

	static int []M;
    static	int k;
	static Random random=new Random();

	@SuppressWarnings("resource")
	public static void menu() {
		int cl;
		do {
			System.out.println(" .........menu.............");
			System.out.println("0.kết thúc");
	        System.out.println("1.nhap mang"); 
	        System.out.println("2xuât mãng");
	        System.out.println("3.tim tần số của k");
	        System.out.println("4.tính tổng");
	        System.out.println("5.lớp nhất ");
	        System.out.println("6.nhỏ nhất");
	        System.out.println("7.xuất các số nguyên tố");
	        System.out.println("8.tăng dần ");
	        System.out.println("giảm dần");
	        System.out.println("nhập chọn lựa : ");
	        cl=new Scanner(System.in).nextInt();
	        switch (cl) {
			case 0:break;
			case 1:
				nhapmang();
				break;
            case 2:
            	xuatmang();
            	break;
            case 3:
            	tinhtansok();	
            	break;
            case 4:
            	tinhtong();
            	break;
            case 5:
            	lonnhat();
            	break;
            case 6:
            	nhonhat();
            	break;
            case 7:
            	timSNT();
            	break;
            case 8:
            	tangdan();
            	break;
            case 9:
            	giamdan();
            	break;
			default:
				System.out.println("xin hay nhap lai  ");
				break;
			}
		} while (cl!=0);
	}
	private static void giamdan() {
		for (int i = 0; i < M.length-1; i++) {
			for (int j = i+1; j < M.length; j++) {
				if (M[i]<M[j]) {
					k=M[i];M[i]=M[j];M[j]=k;
				}
			}
		}
		System.out.println("mãng giảm dần là :");
		xuatmang();
	
		
	}
	private static void tangdan() {
		for (int i = 0; i < M.length-1; i++) {
			for (int j = i+1; j < M.length; j++) {
				if (M[i]>M[j]) {
					k=M[i];M[i]=M[j];M[j]=k;
				}
			}
		}
		System.out.println("mãng tăng dần là :");
		xuatmang();
	}
	private static void timSNT() {
        System.out.println("các số nguyên tố trong mãng la :");
		for (int i = 0; i < M.length; i++) {
			int h=0;
			for (int j = 0; j < i; j++) {
				if (M[i]==M[j]) {
					h++;
				}
			}
			if (ktsnt(M[i])==1&&h==0) {
				System.out.println(M[i]+"\t");
			}
		}
	}
	public static int ktsnt(int a) {
		if (a<2) {
			return 0;
		}
		if(a==2)return 1;
		for (int i = 2; i <a/2+1 ; i++) {
			if (a%i==0) {
				return 0;
			}
		}		
		return 1;
	}
	private static void nhonhat() {
		int min=M[0];
		for (int i = 1; i < M.length; i++) {
			if (min>M[i]) {
				min=M[i];
			}
		}
		System.out.println("giá trị nhỏ nhất là : "+min);
	}
	private static void lonnhat() {
        int max=M[0];
        for (int i = 1; i < M.length; i++) {
			if (max<M[i]) {
				max=M[i];
			}
		}
        System.out.println("giá trị lơn nhất của mẩng là : "+max);
	}
	private static void tinhtong() {
		int S=0;
		for (int i = 0; i < M.length; i++) {
			S+=M[i];
		}
		System.out.println("tổng của mãng là : "+S);
	}
	private static void tinhtansok() {
		int h=0;
		int k=random.nextInt(10);
		for (int i = 0; i < M.length; i++) {
			if (M[i]==k) {
				h++;
			}
		}
		System.out.println("tần số của "+k+" là "+h);
		
	}
	private static void xuatmang() {
       
		for (int i = 0; i < M.length; i++) {
			System.out.println(M[i]+"\t");
		}

		
	}
	private static void nhapmang() {
		System.out.println("nhập sô lương phần tử của mang : ");
       try {
    		int n=new Scanner(System.in).nextInt();
            M=new int [n];
            for (int i = 0; i < M.length; i++) {
    			M[i]=random.nextInt(10);
    		}
    	
	} catch (Exception e) {
		System.out.println(e);
	}
		
	}
	public static void main(String [] args ) {
		menu();
	   
	}
}
