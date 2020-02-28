package oppquanglysinhven;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuangLySinhVien {
     static	 ArrayList<SinhVien>QuanLySinhVien=new ArrayList<SinhVien>();
     /*
	public  boolean KiemTraMSSVCoTrungHayKhong(int MSSV) {
		for (int i = 0; i < QuanLySinhVien.size(); i++) {
			if (MSSV== ((SinhVien) QuanLySinhVien).getMSSV()) {
				return true;
			}
		}
		return false;
	}
	8*/
    @SuppressWarnings({"resource" })
	public static void ThemSinhVien() {
    	int MSSV;
    	String tenSV;
    	double diemSV;
    	int tuoiSV;
    	
	    System.out.print("MSSV = ");
	    do {
			try {
				 MSSV=new Scanner(System.in).nextInt();
				break;
			} catch (Exception e) {
				System.out.print("bạn nhập sai . xin nhập lại MSSV = ");
			}
		} while (true); 
	  
	    System.out.print("nhập tên Sinh viên : ");
	    tenSV=new Scanner(System.in).nextLine();
	   
	   System.out.print("nhập điểm = ");
	     do {
			try {
				 diemSV=new Scanner(System.in).nextDouble();
				if (diemSV<0&&diemSV>10) {
					System.out.print("điểm 0->10 xin bạn nhập lại điểm =");
				} else {
					
                    break;
				}
			} catch (Exception e) {
				System.out.print("bạn nhập sai . xin nhập lại điểm = ");
			}
		} while (true); 
      
	     System.out.print("nhập tuổi = ");
	     do {
			try {
			    tuoiSV=new Scanner(System.in).nextInt();
				if (tuoiSV<0) {
					System.out.print("điểm >0 xin bạn nhập lại điể =");
				} else {
                    break;
				}
			} catch (Exception e) {
				System.out.print("bạn nhập sai . xin nhập lại tuổi = ");
			}
		} while (true); 
	     QuanLySinhVien.add(new SinhVien(MSSV, tenSV, diemSV, tuoiSV));
	} 
    
    public static void xuatSinhVien() {
		for (int i = 0; i < QuanLySinhVien.size(); i++) {
			System.out.println(QuanLySinhVien.get(i));
		}
	}
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*System.out.print("nhập số lượng sinh viên : ");
        int n=new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
        	ThemSinhVien();	
		}*/
		
		QuanLySinhVien.add(new  SinhVien(4, "hung anh", 7, 29));
		QuanLySinhVien.add(new  SinhVien(6, "quang", 10, 23));
		QuanLySinhVien.add(new  SinhVien(3, "son", 9, 22));
		QuanLySinhVien.add(new  SinhVien(1, "quyen", 8, 21));
		QuanLySinhVien.add(new  SinhVien(2, "thuy", 9, 20));
		xuatSinhVien();
		System.out.println();
	    Collections.sort(QuanLySinhVien);
	    xuatSinhVien();
	}

}
