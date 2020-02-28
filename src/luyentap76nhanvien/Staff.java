package luyentap76nhanvien;
// có ba loại nhân viên : làm theo giờ (hourly),tình nguyện(volunteer), điều hành(
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

@SuppressWarnings({ "unused" })
public class Staff {
	private ArrayList<StaffMember>staffList;

	public ArrayList<StaffMember> getStaffList() {
		return staffList;
	}
    public void setStaffList(ArrayList<StaffMember> staffList) {
		this.staffList = staffList;
	}
	public void addStaffMember(StaffMember staffMember) {
		staffList.add(staffMember);
	}
	public void setStaffMember(int vt,StaffMember staffMember) {
		staffList.set(vt, staffMember);
	}

	public Staff(ArrayList<StaffMember> staffList) {
		super();
		this.staffList = staffList;
	}
    public void payDay() {
    	System.out.println(staffList.size());
    	for (int i = 0; i < staffList.size(); i++) {
			System.out.println(staffList.get(i));
		}
	}
    public void xoatatcanhanvien() {
    	for (int i = 0; i < staffList.size(); i++) {
			staffList.remove(i);
		}
	}
    
    public void xuatcacnhanvientheoloai(int a) {
		for (int i = 0; i < staffList.size(); i++) {
			if (staffList.get(i).maphanloai()==a) {
				System.out.println(staffList.get(i));
			}
		}
	}
    public void xoatatcacacnhanvientungloainhanvien(int a) {
    	for (int i = 0; i < staffList.size(); i++) {
			if (staffList.get(i).maphanloai()==a) {
				staffList.remove(i);
			}
		} 
    }
    @SuppressWarnings("resource")
	public  void xoanhanvienbatki() {
		String msnv = null;
		boolean a=false;
	    System.out.print("nhập mã sô nhân viên cần xóa : ");
	    msnv=new Scanner(System.in).nextLine();
	    for (int i = 0; i < staffList.size(); i++) {
			if (msnv.equals(staffList.get(i).getMasonhanvien())) {
				staffList.remove(i);
				a=true;
			}
		}
	    if (a) {
			System.out.println("đã xóa thành công :)");
		}
	    else {
	    	System.out.println("không có mã số nhân viên đó nên không xóa được :)");
		}

    }
	public int kiemtraloainhanvien(String msnv) {
		for (int i = 0; i < staffList.size(); i++) {
			if (msnv.equals(staffList.get(i).masonhanvien)) {
				return staffList.get(i).maphanloai();
			}
		}
		return -1;
	}
    public int kiemtraMSNV(String MSNV) {
       	for (int i = 0; i < staffList.size(); i++) {
			if (MSNV.equals(staffList.get(i).getMasonhanvien())) {
				return i;	
			}
		}
    	return -1;
    }
    public Staff() {
		super();
		staffList=new ArrayList<>();
	}
	
        
}
