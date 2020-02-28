package hoccaicuaquang;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class hocHashMap {
    static HashMap<Integer, String>SV=new HashMap<Integer, String>();    
	public static void menu() {
		int cl=0;
	    do {
	    	System.out.println("0.thoat");
			System.out.println("1.them");
			System.out.println("2.xuat");
			System.out.println("3.sữa");
			System.out.println("4.xóa");
			System.out.println("5.tim");
			System.out.println("6.sap xep");
			System.out.print("ban  muốn gì : ");
		    do {
				try {
				    cl=new Scanner(System.in).nextInt();
					break;
				} catch (Exception e) {
					System.out.println("bạn nhập sai xin hãy nhập lại : ");			    
				}
			} while (true);
				switch (cl) {
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
					break;
	           case 4:
					xoa();
					break;
	           case 5:
					tim();
					break;
	           case 6:
					sapxep();
					break;
	            
				default:
					System.out.println("lụa chon ban không đúng ,xin nhap lại");
					break;
				}
		} while (cl!=0);  
	}
	private static void sapxep() {
         		
	}
	private static void tim() {
		System.out.print("nhập tên sinh viên cần tìm :");
		String ten=new Scanner(System.in).nextLine();
		for (Map.Entry<Integer, String>sv :SV.entrySet()) {
			if (sv.getValue().contains(ten)) {
				System.out.println(sv.getKey()+"\t "+sv.getValue());
			}
		}
	}
	private static void xoa() {
		System.out.print("nhap MSS bạn muốn xóa : ");
        int mssv=0; 
	    do {
	    	try {
	    		mssv=new Scanner(System.in).nextInt();
				break;
			} catch (Exception e) {
				System.out.print("bạn nhập sai xin nhap lai MSSV : ");
			}
		} while (true);
	    if (SV.containsKey(mssv)==false) {
			System.out.println(" không tìm thấy mã MSSV có trong danh sach ");
		} else {
            SV.remove(mssv);
		}
	}
	private static void sua() {
	    System.out.print("nhap MSS bạn muốn sưã : ");
        int mssv=0; 
	    do {
	    	try {
	    		mssv=new Scanner(System.in).nextInt();
				break;
			} catch (Exception e) {
				System.out.print("bạn nhập sai xin nhap lai MSSV : ");
			}
		} while (true);
	    if (SV.containsKey(mssv)==false) {
			System.out.println("MSSV của bạn không có trong danh sach ");
		} else {
            System.out.print("nhập tên sinh viên cần sữa :  ");
            String ten= new Scanner(System.in).nextLine();
            SV.put(mssv, ten);
		}
	}
	private static void xuat() {
		System.out.println("MSSV\t tên Sinh vien");
		for (java.util.Map.Entry<Integer, String> sv:SV.entrySet()) {
			System.out.println(sv.getKey()+"\t "+sv.getValue());
		}
	}
	private static void Them() {
		 int mssv=0;
		 System.out.print("nhap MSSV = ");
		 do {
			try {
				mssv=new Scanner(System.in).nextInt();
				if (SV.containsKey(mssv)==false) {
				    break;	
				}
				System.out.print("MSSV bị trùng sin nhập lại MSSV= ");
			} catch (Exception e) {
				System.out.print("bạn nhap sai xin nhap lai MSSV= ");
			}
			
		} while (true);
		 System.out.print("nhập tên sinh viên : ");
			String ten=new Scanner(System.in).nextLine();
			SV.put(mssv, ten);
			
	}
	public static void main(String[] args) {
		menu();
		SV.clear();

	}

}
