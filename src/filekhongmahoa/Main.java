package filekhongmahoa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	static ArrayList<KhachHang>dsKhachHang=new ArrayList<>();
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		String lc;
		System.out.println("thông tin đọc từ file là :");
		dsKhachHang=LuuDocFile.docflie("D:/file/khongmahoa.txt");
		xuatkhachhanh();
		do {
			System.out.println("0. kết thúc ");
			System.out.println("1. thêm 1 khách hàng ");
			System.out.println("2. xuất khách  hàng ");
			System.out.println("3. sữa khách hàng theo mã ");
			System.out.println("4. xóa khách hàng theo  mã");
			System.out.print("nhập lựa chọn của ban : ");
			lc=new Scanner(System.in).nextLine();
			switch (lc) {
			case "0":
				break;
            case "1":
            	themkhachhang();
            	break;
            case "2":
            	System.out.println("thông tin từ danh sách khách hàng là :");
            	xuatkhachhanh();
            	break;
            case "3":
            	suatheoma();
            	break;
            case "4":
            	xoatheoma();
            	break;
            	
			default:
				System.out.println("bạn nhập sai lựa chọn rồi :)");
				break;
			}
		} while (!lc.equals("0"));
		if (LuuDocFile.luuafile(dsKhachHang, "D:/file/khongmahoa.txt")) {
			System.out.println("lưu file thành công ơ  đương dẫn D:/file/khongmahoa.txt");
		}
		else {
			System.out.println("lưu file thất bại :)");
		}
	}

	@SuppressWarnings("resource")
	private static void xoatheoma() {
		System.out.print("Nhập mã khách hàng cần xóa : ");
		String mkh=new Scanner(System.in).nextLine();
		int a=kiemMKH(mkh);
		if (a!=-1) {
			dsKhachHang.remove(a);
			System.out.println("đã xóa thành công khách hàng ");
		} else {
			System.out.println("mã khách hàng không có trong danh sách");
		}
	}

	@SuppressWarnings("resource")
	private static void suatheoma() {
		System.out.print("nhập mã khách hàng cần sữa : ");
		String mkh=new Scanner(System.in).nextLine();
		int a=kiemMKH(mkh);
		if (a!=-1) {
			System.out.print("nhập tên cần sữa : ");
			String ten=new Scanner(System.in).nextLine();
			System.out.print("nhập địa chỉ cần sữa : ");
			String diachi=new Scanner(System.in).nextLine();
			KhachHang kh=new KhachHang(mkh,ten,diachi);
			dsKhachHang.set(a, kh);
			System.out.println(" đã sữa thành công ");					
		} else {
			System.out.println("mã số khách hàng không có trong danh sách ");
		}
	}

	private static void xuatkhachhanh() {
		for (int i = 0; i < dsKhachHang.size(); i++) {
			System.out.println(dsKhachHang.get(i));
		}		
	}

	@SuppressWarnings("resource")
	private static void themkhachhang() {
		String mkh=nhapMKH();
		System.out.print("nhập tên : ");
		String ten=new Scanner(System.in).nextLine();
		System.out.print("nhập địa chỉ : ");
		String   diachi=new Scanner(System.in).nextLine();
	    KhachHang kh=new KhachHang(mkh, ten, diachi);
	    dsKhachHang.add(kh);
	    
	}

	@SuppressWarnings("resource")
	private static String nhapMKH() {
		String mkh;
		System.out.print("nhâp mã khách hàng : ");
		do {
			mkh=new Scanner(System.in).nextLine();
			if (kiemMKH(mkh)==-1) {
				return mkh;
			}
			else {
				System.out.print("mã khách hàng bị trùng ,xin hãy nhập lại : ");
			}
			} while (true);
		
	}
	public static int kiemMKH(String mkh) {
		for (int i = 0; i < dsKhachHang.size(); i++) {
			if (dsKhachHang.get(i).getMa().equals(mkh)) {
				return i;
			}
		}
		return -1;
	}
}
