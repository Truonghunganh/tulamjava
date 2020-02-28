package hoccaicuaquang;

import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class luyentapHasMap {
	static HashMap<Integer, String>SV=new HashMap<Integer,String>();
    static Scanner sc =new Scanner(System.in);	
	@SuppressWarnings("resource")
	public static void menu() {
		String cl = "";
		do {
			cl="0";
			System.out.println(".......menu quảng lý sinh viên.......");
			System.out.println("0.kết thúc");
			System.out.println("1.thêm SV");
			System.out.println("2.xuất DSSV");
			System.out.println("3.Sữa SV");
			System.out.println("4.Xóa sinh viên");
			System.out.println("5.tim kiếm tên SV");
			System.out.println("6.xuât ra mã SV");
			System.out.println("7.xuất ra tên sinh viên");
			System.out.print("bạn chọn gì ? : ");
			cl=new Scanner(System.in).nextLine();
			switch (cl) {
			case "0":
				break;
            case "1":
				them();
				break;
            case "2":
 				xuattheomavaten();
 				break;
            case "3":
				sua();
				break;
            case "4":
				xoa();
            	break;
            case "5":
                tim(); 
            	break;
            case "6":
                Xuattheoma();
            	break;
            case "7":
                xuattheoten(); 
            	break;
  
			default:
				break;
			}
		} while (cl.equals("0")==false);
	}
	private static void xuattheoten() {
		System.out.println("danh sách sinh viên :");
		System.out.println("tên sinh viên ");
		for(Map.Entry<Integer, String>sv : SV.entrySet()) {
			System.out.println(sv.getValue());
		}
		
	}
	private static void Xuattheoma() {
		System.out.println("danh sách sinh viên :");
		System.out.println("MSSV ");
		for(Map.Entry<Integer, String>sv : SV.entrySet()) {
			System.out.println(sv.getKey());
		}
			
	}
	private static void tim() {
		if (SV.size()==0) {
			System.out.println("danh sach sinh không có tên nào");
			return;
		}
		xuattheomavaten();
		String a="";
		boolean kt=false;
		System.out.print("nhập tên sinh viên cần tìm kiếm  : ");
		String ten=sc.nextLine();
		for (Map.Entry<Integer, String>sv :SV.entrySet()) {
			if (sv.getValue().contains(ten)) {
				a=a+sv.getKey()+"\t "+sv.getValue()+"\n";
				kt=true;
			}
		}
		if (kt) {
			System.out.println("đã tìm thấy thành công :");
		    System.out.println(a);
		}
		else {
			System.out.println("tên bạn nhập không có trong danh sách ");
		}
	}
	
	@SuppressWarnings("resource")
	private static void xoa() {
		if (SV.size()==0) {
			System.out.println("danh sach sinh không có tên nào");
			return;
		}
		boolean kt=false;
		xuattheomavaten();
		System.out.print("nhập tên sinh viên cần xóa : ");
		String ten=new Scanner(System.in).nextLine();
		String b,c;
		int d;
		ArrayList<Integer> aaa = new ArrayList<>();
		for (Map.Entry<Integer, String>sv :SV.entrySet()) {
			b=sv.getValue().toLowerCase();
			c=ten.toLowerCase();
			if (b.compareTo(c) == 0) {
				d=sv.getKey();
				aaa.add(d);
				kt=true;// biến kt dùng để làm gì ?
				//break;
		
			}
		}
		for (Integer integer : aaa) {
			SV.remove(integer);	
		}//for each
	
		
		if (kt) {
			System.out.println("đã xóa thành công :");
			xuattheomavaten();
		}
		else {
			System.out.println("tên bạn nhập không có trong danh sách ");
		}
	} 
	@SuppressWarnings("resource")
	private static void sua() {
		if (SV.size()==0) {
			System.out.println("danh sach sinh không có tên nào");
			return;
		}
		xuattheomavaten();
		int mssv=0;
		do {
			try {
				System.out.print("nhập mã sinh viên cần xữa : ");
				mssv=new Scanner(System.in).nextInt();
				if (SV.containsKey(mssv)) {
					System.out.print("nhập tên sinh viên cần  sữa : ");
					String ten=new Scanner(System.in).nextLine();
					SV.put(mssv, ten);
					return;
				}
				System.out.println("MSSV : "+mssv+" không có trong danh sach . hãy nhạp lại");
			} catch (Exception e) {
				System.out.println("bạn nhập sai ,xin hãy nhập lại :");
			}
		} while (true);
	}
	private static void xuattheomavaten() {
		System.out.println("danh sách sinh viên :");
		System.out.println("MSSV\t tên sinh viên ");
		for(Map.Entry<Integer, String>sv : SV.entrySet()) {
			System.out.println(sv.getKey()+"\t "+sv.getValue());
		}
		
	}
	@SuppressWarnings("resource")
	private static void them() {
		int mssv;
		String ten;
		do {
			try {
				System.out.println("nhập MSSV : ");
				mssv=new Scanner(System.in).nextInt();
				if (SV.containsKey(mssv)==false) {
					System.out.print("nhập tên sinh viên : ");
					ten=new Scanner(System.in).nextLine();
					SV.put(mssv, ten);
					return;
				}
			    System.out.println("MSSV đã bị  trùng ,xin hãy nhập lại :");
			} catch (Exception e) {
				System.out.println("phải nhập số xin hay nhập lại ");
			}
		} while (true);
		
	}
	public static void main(String[] args) {
		menu();
		SV.clear();
	}
	
	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}
         
}

