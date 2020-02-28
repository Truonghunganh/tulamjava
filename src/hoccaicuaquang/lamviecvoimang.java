package hoccaicuaquang;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("unused")
public class lamviecvoimang {

	public static void nhapmang(int []A) {
		Random random=new Random();
		System.out.println("nhap mãng khi chon ngẫu nhiên  : ");
		for (int i = 0; i < A.length; i++) { 
			A[i]=random.nextInt(100);
		    System.out.print(A[i]+"\t");
		}
		System.out.println();
	}
	public static void xuatmang(int []A) {
		System.out.println("xuat  mãng : ");
		for (int i = 0; i < A.length; i++) {
		    System.out.print(A[i]+"\t"); 	
		}
		System.out.println();
		
	}public static void timkiemkitutrongmanng(int []A,int socantim) {
		boolean a=false;
		String string="";
		for (int i = 0; i < A.length; i++) {
			if (A[i]==socantim) {
				a=true;
				string=string+i+";";
			}
		}
		if (a) {
			System.out.println("có tim thấy số "+socantim+" ở vi trí : "+string);
		}
		else {
			System.out.println("không tim thấy số "+socantim );
		}
	}
	public static void sapxepBUBBLESORT(int []A) {
		int tmp;
	   for (int i = 0; i < A.length-1; i++) {
		for (int j = A.length-1; j > i; j--) {
			if (A[j]<A[j-1]) {
				tmp=A[j];
				A[j]=A[j-1];
				A[j-1]=tmp;
			}
		}
	   }
	   xuatmang(A);
	}
	public static void sapxepSELECTIONSORT(int []A) {
		int min;
		int tmp;
		for (int i = 0; i < A.length-1; i++) {
			min=i;
			for (int j = i+1; j < A.length; j++) {
				if (A[j]<A[min]) {
					min=j;
				}
			}
			if (min!=i) {
				tmp=A[i];
				A[i]=A[min];
				A[min]=tmp;
			}
		}
		xuatmang(A);
	}
	public static void sapxepQUICKSORT(int []A,int left,int right) {
	    //left =0;right=A.length-1
		int tmp;
		if (left>=right) {
			return;
		}
		int pivot=A[(left+right)/2];
		int i=left,j=right;
		do {
			while (A[i]<pivot) {
				i++;
			}
			while (A[j]>pivot) {
				j--;
			}
			if (i<=j) {
				tmp=A[i];
			    A[i]=A[j];
			    A[j]=tmp;
			    i++;
			    j--;
			}
		} while (i<j);
		sapxepQUICKSORT(A, left, j);
		sapxepQUICKSORT(A, i, right);
		
	}
	public static int [] them1phantuvaomang(int []A) {
		int []B=new int[A.length+1];
	    System.out.println("nhap gia tri can them :"); 
	    int a=new Scanner(System.in).nextInt();
	    int vitri;
	    do {
			System.out.println("nhap vi tri can them (0->n-1) : ");
			vitri=new Scanner(System.in).nextInt();
		} while (vitri<0||vitri>A.length);
	    for (int i = 0; i < vitri; i++) {
			B[i]=A[i];
		}
	    B[vitri]=a;
	    for (int i = vitri+1; i < B.length; i++) {
			B[i]=A[i-1];
		}
		return B;
		
	}
	public static int [] xoa1phantutrongmang(int []A,int vitricanxoa) {
		int []B=new int [A.length-1];
		for (int i = 0; i < vitricanxoa; i++) {
			B[i]=A[i];
		}
		for (int i = vitricanxoa; i < B.length; i++) {
			B[i]=A[i+1];
		}
		return B;
	}
	public static int [] xoatatcacacgiatritrongmang(int []A) {
		System.out.print("nhap gia tri can xoa :");
		int a=new Scanner(System.in).nextInt();
		for (int i = 0; i < A.length; i++) {
			if (A[i]==a) {
				A=xoa1phantutrongmang(A, i);
				i--;
			}
		}
		return A;
	}
	public static int tongcacphantutrongmang(int []A) {
		int tong=0;
		for (int i = 0; i < A.length; i++) {
			tong=tong+A[i];
		}
		return tong;
	}
	public static int solanxuathiencuak(int []A,int k) {
		int solan=0;
		for (int i = 0; i < A.length; i++) {
			if (k==A[i]) {
				solan++;
			}
		}
		return solan;
	}
	public static int max(int []A) {
		int max=A[0];
		for (int i = 1; i < A.length; i++) {
			if (max<A[i]) {
				max=A[i];
			}
		}
		return max;
	}
	public static int min(int []A) {
		int min=A[0];
		for (int i = 1; i < A.length; i++) {
			if (min>A[i]) {
				min=A[i];
			}
		}
		return min;
	}
	public static boolean kiemtrasonguyento(int so) {
		if (so<2) {
			return false; 
		} else {
              if (so==2) {
				return true;
			}
            for (int i = 2; i < Math.sqrt(so)+1; i++) {
				if (so%i==0) {
					return false;
				}
			}  
            return true;
		}
	}
	public static int [] cacsonguyentotrongmang (int []A) {
		int j=0;
		int []B=new int [A.length];
		for (int i = 0; i < A.length; i++) {
			if (kiemtrasonguyento(A[i])) {
				B[j]=A[i];
				j++;
			}
		}
		int []C=new int[j];
		for (int i = 0; i < j; i++) {
			C[i]=B[i];
		}
		return C;
	}
	public static int[] tangdan(int []A) {
		int doi;
		for (int i = 0; i < A.length-1; i++) {
			for (int j = A.length-1; j >i;j--) {
				if (A[j]<A[j-1]) {
					doi=A[j];
					A[j]=A[j-1];
					A[j-1]=doi;
				}
			}
		}
		return A;
	}
	public static int [] giamdan(int []A) {
		int doi;
		for (int i = 0; i < A.length-1; i++) {
			for (int j = A.length-1; j > i; j--) {
				if (A[j-1]<A[j]) {
					doi=A[j-1];
					A[j-1]=A[j];
					A[j]=doi;
				}
			}
		}
		return A;
	}
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.print("nhập  số lượng phần tử của mãng : ");
		int n=scanner.nextInt();
		int []A=new int[n];
		int []B;
		nhapmang(A);
		B=cacsonguyentotrongmang(A);
		A=giamdan(A);
		xuatmang(A);
	}

}
