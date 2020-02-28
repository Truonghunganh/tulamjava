package filemahoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import filekhongmahoa.LuuDocFile;

public class Test {
	static ArrayList<KhachHang>DSKH=new ArrayList<>();
	public static void menu() {
		System.out.println("=======khách hàng=======");
		System.out.println("0. thoát");
		System.out.println("1. nhập");
		System.out.println("2. xuất ");
		System.out.println("3. lưu flie");
		System.out.println("4. đọc file");
		System.out.println("5. tìm kiếm theo tên");
		System.out.println("6. sắp xếp theo tên ");
		System.out.println("7. xóa khách hàng theo mã");
		System.out.println("8. sữa khách hàng theo mã");
		System.out.println("9. thống kê có bao nhiêu tên bắt đầu chữ mà bạn nhập vào ");
		int chon;
		try {
			System.out.println("mời bạn nhập lữa chọn : ");
			chon =new Scanner(System.in).nextInt();
			switch (chon) {
			case 0:
				luufile();
				System.out.println("cảm ơn bạn đã sử dụng phần mềm ");
				System.exit(0);
				break;
			case 1:
				nhap();
				break;
			case 2:
				xuat();
				break;
			case 3:
				luufile();
				break;
			case 4:  
				docfile();
				break;
			case 5:
				timkiem();
				break;
			case 6:
				sapsep();
				break;
			case 7:
				xoa();
				break;
			case 8:
				sua();
				break;
			case 9:
				thongke();
				break;
			default:
				System.out.println("bạn nhập sai rồi");
				break;
			}
		} catch (Exception e) {
			System.out.println("bạn nhập sai rồi ");
		}
	}
	private static void thongke() {
		int t=0;
		System.out.print("mời bạn nhập tên : ");
		String ten=new Scanner(System.in).nextLine();
		for(KhachHang kh: DSKH) {
			if (kh.getTen().startsWith(ten)) {
				t++;
			}
		}
		System.out.println("có "+t+" tên bắt đầu bằng chữ cái "+ten);
	}
	private static void sua() {
		System.out.print("mời bạn nhập mã cần sữa : ");
		try {
			int ma=new Scanner(System.in).nextInt();
			int vt=ktma(ma);
			if (vt!=-1) {
				System.out.print("mời bạn nhập tên cần sữa : ");
				String ten=new Scanner(System.in).nextLine();
				KhachHang khachHang=new KhachHang(ma, ten);
				DSKH.set(vt, khachHang);
				System.out.println("đã sữa thành công ");
			} else {
				System.out.println("sữa thất bại vì mã vừa nhập không có  trong danh sách");
			}
		} catch (Exception e) {
			System.out.println("sữa  thật bại vì mã là số");
		}
	}
	private static void xoa() {
		try {
			System.out.print("mời bạn nhập mã cần xóa : ");
			int ma=new Scanner(System.in).nextInt();
			int a=ktma(ma);
			if (a!=-1) {
				DSKH.remove(a);
				System.out.println("đã xóa thành công ");
			} else {
				System.out.println("mã bạn nhập không có trong danh sách");
			}
		} catch (Exception e) {
			System.out.println("mã bạn nhập bị sai vì mã là số");
		}
		
	}
	private static void sapsep() {
		Collections.sort(DSKH);
		System.out.println("danh sách  đã sấp xếp xong ");
	}
	private static void timkiem() {
		System.out.print("mời bạn nhập tên cần tìm kiếm : ");
		String ten=new Scanner(System.in).nextLine();
		System.out.println("=============================");
		System.out.println("đây là danh sách  khách hàng đã tìm là :");
		for (KhachHang kh: DSKH) {
			if (kh.getTen().startsWith(ten)) {
				System.out.println(kh);
			}
		}
		System.out.println("=============================");
	}
	private static void docfile() {
		DSKH=File1.docfile1("D:/file/mahoa1.txt");
		System.out.println("thông tin từ file là : ");
		xuat();
		
	}
	private static void luufile() {
		boolean  kt=File1.Luufile1(DSKH, "D:/file/mahoa1.txt");
		if (kt) {
			System.out.println("lưu file thành công ");
		}
		else {
			System.out.println("lưu file thất bại");
		}
		
	}
	private static void xuat() {
		System.out.println("================================");
		System.out.println("ma\tten");
		for (int i = 0; i < DSKH.size(); i++) {
			System.out.println(DSKH.get(i));
		}
		System.out.println("================================");
	}
	private static void nhap() {
		try {
			System.out.print("mời bạn nhập mã : ");
			int ma=new Scanner(System.in).nextInt();
			if (ktma(ma)==-1) {
				System.out.print("mời bạn nhập  tên : ");
				String ten=new Scanner(System.in).nextLine();
				KhachHang khachHang=new KhachHang(ma, ten);
				DSKH.add(khachHang);	
			}
			else {
				System.out.println("bạn nhập mã bị trùng rồi ");
			}
			} catch (Exception e) {
			System.out.println("bạn nhập sai rồi vì mã là số");
		}
	}
	public static int ktma(int ma) {
		for (int i = 0; i <DSKH.size(); i++) {
			if (ma==DSKH.get(i).getMa()) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		docfile();
		while (true) {
			menu();
		}
		/*
		Object data=file.docfile("D:/file/mahoa.txt");
		DSKH=(ArrayList<KhachHang>)data;
		for (int i = 0; i < DSKH.size(); i++) {
			System.out.println(DSKH.get(i).getMa()+"\t"+DSKH.get(i).getTen());
		}*/
	}

}
