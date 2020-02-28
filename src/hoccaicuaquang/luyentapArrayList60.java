package hoccaicuaquang;

import java.util.ArrayList;
import java.util.Scanner;

public class luyentapArrayList60 {

	static ArrayList<String>DSSV=new ArrayList<String>();
	@SuppressWarnings("resource")
	public static void menu() {
		int lc=0;
		do {
			System.out.println("0.kết thúc");
			System.out.println("1.thêm SV");
			System.out.println("2.xuất danh sach SV");
			System.out.println("3.sữa SV");
			System.out.println("4.xóa sV theo tên");
			System.out.println("5.tim SV theo tên");
			System.out.println("6.sắp xếp SV theo họ");
			System.out.println("7.số lượng sinh viên");
			System.out.print("bạn muốn gì ? : ");
			do {
				try {
					lc=new Scanner(System.in).nextInt();
					break;
				} catch (Exception e) {
					System.out.print("bạn nhập sai ,xin nhập lại : ");
				}
			} while (true);
			switch (lc) {
			case 0:
				break;
			case 1:
				Them();
				break;
			case 2:	
				xuat();
				break;
			case 3:		
				sua();
				xuat();
				break;
			case 4:
				xoa();
				break;
			case 5:		
				Tim();
				break;
			case 6:
				sapxep();
				break;
			case 7:		
				System.out.println("số lượng sinh viên là :"+DSSV.size());
				break;
            
			default:
				break;
			}
		} while (lc!=0);
	}
	public static boolean ktchuoi(String a,String b) {
		a=a.toLowerCase();
		b=b.toLowerCase();
		int c;
		if (a.length()>b.length()) {
			c=b.length();
		} else {
            c=a.length();
		}
		for (int i = 0; i < c; i++) {
			if (a.charAt(i)>b.charAt(i)) {
				return true;
			}
			if (a.charAt(i)<b.charAt(i)) {
				return false;
			}
		}
		return false;
	}
	private static void sapxep() {
		String aString;
		for (int i = 0; i < DSSV.size()-1; i++) {
			for (int j = DSSV.size()-1; j >i; j--) {
				if (ktchuoi(DSSV.get(j-1), DSSV.get(j))) {
					aString=DSSV.get(j-1);
					DSSV.set(j-1, DSSV.get(j));
					DSSV.set(j, aString);
				}
			}
		}
		
	}
	@SuppressWarnings("resource")
	private static void Tim() {
		xuat();
		boolean kt=false;
		String a,b="";
			System.out.print("nhap tên muốn tìm : ");
			a=new Scanner(System.in).nextLine();
				for (int i = 0; i < DSSV.size(); i++)
				{
					if (DSSV.get(i).contains(a)) 
					{
						b=b+DSSV.get(i)+"\n";
						kt=true;
					}
				}
			if (kt) {
				System.out.println("danh sách những ai có tên là "+a+" : ");
				System.out.println(b);
			}
			else 
			{
                System.out.println("tên bạn muốn tìm không có trong danh sach");
			}    	
		
	}
	@SuppressWarnings({ "resource" })
	private static void xoa() {
		xuat();
		boolean kt=false;
		String a;
			System.out.print("nhap tên muốn xóa : ");
			a=new Scanner(System.in).nextLine();
			for (int i = 0; i < DSSV.size(); i++) {
				if (DSSV.get(i).equals(a)) {
					DSSV.remove(i);
				    kt=true;
				}	
			}
			if (kt) {
				xuat();
			} else {
				System.out.println("tên bạn muốn xóa không có trong danh sach");
			}
	}
	@SuppressWarnings({ "resource" })
	private static void sua() {
		xuat();
		String a="";
		String b="";
			System.out.print("nhap tên muốn sữa đổi : ");
			a=new Scanner(System.in).nextLine();
			for (int i = 0; i < DSSV.size(); i++) {
				if (DSSV.get(i).equals(a)) {
					System.out.print("nhập tên đổi thành :");
					b=new Scanner(System.in).nextLine();
					DSSV.set(DSSV.indexOf(a), b);
					return;		
		      	}
			}
            System.out.println("tên bạn muốn sữa không có trong danh sach");
				
	}
	private static void xuat() {
		System.out.println("danh sách sinh viên là : ");
		for (int i = 0; i < DSSV.size(); i++) {
			System.out.println(DSSV.get(i));
		}
	}
	private static void Them() {
		System.out.print("nhập tên SV : ");
		@SuppressWarnings("resource")
		String ten=new Scanner(System.in).nextLine();
		DSSV.add(ten);
		
	}
	public static void main(String[] args) {
		menu();
		DSSV.clear();

	}

}
