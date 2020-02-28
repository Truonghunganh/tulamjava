package hoccaicuaquang;

import java.util.Random;
import java.util.Scanner;

public class btrenluyenMang54 {
	public static void nhapmangngaunhienKhongtrungnhau(int []A) {
		Random random=new Random();
		boolean a=true;
		A[0]=random.nextInt(10);
		for (int i = 1; i < A.length; i++) {
		    
			do {
				a=true;
		    	A[i]=random.nextInt(10);
				for (int j = 0; j < i; j++) {
					if (A[i]==A[j]) {
						a=false;
						break;
					}
				}
			} while (a==false);
			
		}
	}
	public static void xuatmang(int []A) {
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i]+"  ");
		}
		
		System.out.println();
	}
	public static void nhapphaitheothututang(int []A) {
		System.out.println("nhap mãng phai tăng  dần : ");
		System.out.print("A["+0+"]=");
		A[0]=new Scanner(System.in).nextInt();
		int max=A[0];
		for (int i = 1; i < A.length; i++) {
			System.out.print("A["+i+"]=");
			do {
				A[i]=new Scanner(System.in).nextInt();
				if (A[i]>max) {
					max=A[i];
					break;
				}
				System.out.print("bạn đã nhập sai xin nhập lại : A["+i+"]=");
			} while (true);
		}
	}
	public static void nhapmangsothuc(double []D) {
	    System.out.println("nhập mãng số thực :");
		for (int i = 0; i < D.length; i++) {
			System.out.print("A["+i+"]=");
	    	do {
				try {
					D[i]=new Scanner(System.in).nextDouble();
					break;
				} catch (Exception e) {
					System.out.print("vì kiểu dữ liệu sai xin bạn lại \n");
					System.out.print("A["+i+"]=");
				}
			} while (true);
		}
	}
	public static void sapxepgiamdanDOUBLE(double []D) {
		double a; 
		for (int i = 0; i < D.length-1; i++) {
			for (int j = D.length-1; j > i; j--) {
				if (D[j-1]<D[j]) {
					a=D[j-1];
					D[j-1]=D[j];
					D[j]=a;
				}
			}
		}
	}
	public static void xuatmangsothuc(double []D) {
		for (int i = 0; i < D.length; i++) {
			System.out.print(D[i]+"\t");
		}
	}
	public static int [] xoatuvitri(int []A,int vitrixoa) {
		int []B=new int [A.length-1];
		for (int i = 0; i < vitrixoa; i++) {
			B[i]=A[i];
		}
		for (int i = vitrixoa; i < B.length; i++) {
			B[i]=A[i+1];
		}
		return  B;
	}
	public static int [] mangsolecuaA(int []A) {
		int tong=0;
		for (int i = 0; i < A.length; i++) {
			if (A[i]%2==0) {
				A=xoatuvitri(A, i);
				i--;
			}
			else {
				tong=tong+A[i];
			}
		}
		System.out.println("tong số lễ :"+tong);
		return A ;
	}
	public static int[] mangsochancuaA(int []A) {
		int tong=0;
		for (int i = 0; i < A.length; i++) {
			if (A[i]%2==1) {
				A=xoatuvitri(A, i);
				i--;
			}
			else {
				tong=tong+A[i];
			}
		}
		System.out.println("tong số chan :"+tong);
		return A ;
	}
	public static boolean ktSNT(int a) {
		if (a<2) {
			return false;
		}
		if (a==2) {
			return true;
		}
		for (int i = 2; i < Math.sqrt(a)+1; i++) {
			if (a%i==0) {
				return false;
			}
		}
		return true;
	}
	public static int [] xoatuvitritrolen(int []A,int vitri) {
		int []B=new int[vitri];
		for (int i = 0; i < B.length; i++) {
			B[i]=A[i];
		}
		return B;
	}
	public static int []cacsonguyentotrongA(int []A,boolean a) {
		int []B=new int[A.length];
		 int j=0;
		 if (a) {
			 for (int i = 0; i < A.length; i++) {
					if (ktSNT(A[i])==true) {
			            B[j]=A[i];
			            j++;
					}
				}
		 }
		 else {
				 for (int i = 0; i < A.length; i++) {
						if (ktSNT(A[i])==false) {
				            B[j]=A[i];
				            j++;
						}
		 		}	
		}
		B=xoatuvitritrolen(B, j);
		return B;
		
	}
	public static void main(String[] args) {
		int n;
		do {
			System.out.print("nhap so luong : ");
			n=new Scanner(System.in).nextInt();
		} while (n<0||n>10);
	    int []A=new int[n];
	    nhapmangngaunhienKhongtrungnhau(A);
	    xuatmang(A);
	    int []luu=A;
	    int []B=mangsolecuaA(A);
	    System.out.println("mang so le : ");
	    xuatmang(B);
	    A=luu;
	    A=mangsochancuaA(A);
	    System.out.println("mang so chẵn là :");
	    xuatmang(A);
	    A=luu;
	    A=cacsonguyentotrongA(A, true);
	    System.out.println("mang cac so nguyen to");
	    xuatmang(A);
        A=luu;
	    System.out.println("mang cac so khong phai nguyen to");
        A=cacsonguyentotrongA(A,false);
	    xuatmang(A);
	    
	    
	}

}
