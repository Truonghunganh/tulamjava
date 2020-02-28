package luyentap76nhanvien;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
     
public class test {
	private static Staff staff=new Staff();
	@SuppressWarnings("unused")
       
	static String MSVV="#";
	public static void menu() {
		int lc=0;
		docfile();
		xuattatcaNV();
		do  {
			System.out.println("0.kết thúc ");
			System.out.println("1.nhập nhân viên tình nguyện ");
			System.out.println("2.nhập nhân viên điều hành ");
			System.out.println("3.nhập nhân viên làm theo giờ ");
			System.out.println("4.xuất tất cả các nhân viên ");
			System.out.println("5.xuất nhân viên tình nguyện");
			System.out.println("6.xuất nhân viên điều hành");
			System.out.println("7.xuất nhân viên làm theo giờ");
			System.out.println("8.xóa 1 nhân viên bất kì theo mã số nhân viên");
			System.out.println("9.xóa tất cả các nhân viên");
			System.out.println("10.xóa tất cả các nhân viên tình nguyện");
			System.out.println("11.xóa tất cả các nhân viên điều hành");
			System.out.println("12.xóa tất cả các nhân viên làm theo giờ");
			System.out.println("13.sữa 1 nhân viên viên theo mã nhân viên");
			do {
				try {
					System.out.println("nhập lựa chọn : ");
					lc=new Scanner(System.in).nextInt();
					break;
				} catch (Exception e) {
					System.out.println("bạn nhập sai xin nhập lại :");
				}
			} while (true);
			
			switch (lc) {
			case 0:
				break;
			case 1:
				nhapNVTN(MSVV,0);
				break;
			case 2:
				nhapNVĐH(MSVV,0);
				break;
			case 3:
				nhapNVLTG(MSVV,0);
				break;
			case 4:
				xuattatcaNV();
				break;
			case 5:
				staff.xuatcacnhanvientheoloai(2);
				break;
			case 6:
				staff.xuatcacnhanvientheoloai(4);
				break;
			case 7:
				staff.xuatcacnhanvientheoloai(5);
				break;
			case 8:
				staff.xoanhanvienbatki();
				
				break;
			case 9:
				staff.xoatatcanhanvien();
				break;
			case 10:
			    staff.xoatatcacacnhanvientungloainhanvien(2);
			    break;
			case 11:
				staff.xoatatcacacnhanvientungloainhanvien(4);
				break;
			case 12:
				staff.xoatatcacacnhanvientungloainhanvien(5);
				break;
			case 13:
				suanhanvientheoma();
				break;
			default:
				System.out.println("bạn nhập sai ,xin nhập lại");
				break;
			}
		} while (lc!=0);
		luufile();
	}
	private static void suanhanvientheoma() {
		System.out.println("nhập mã số nhân viên : ");
		@SuppressWarnings("resource")
		String MSNV= new Scanner(System.in).nextLine();
		int vt=staff.kiemtraMSNV(MSNV);
		int loai=staff.kiemtraloainhanvien(MSNV);
		System.out.println(staff.kiemtraMSNV(MSNV));
		if (vt!=-1) {
			if (loai==2) {
				nhapNVTN(MSNV, vt);
			}
			if (loai==4) {
				nhapNVĐH(MSNV, vt);
			}
			if (loai==5) {
				nhapNVLTG(MSNV, vt);
			}
		} else {
             System.out.println("nhập mã nhân viên đã sai ");
		}
		
	}
	@SuppressWarnings("unchecked")
	public static void docfile() {
		try {
			FileInputStream fileInputStream=new FileInputStream("D:/file/luyentap76nhanvien.txt");
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			staff.setStaffList((ArrayList<StaffMember>)objectInputStream.readObject());
			objectInputStream.close();
			fileInputStream.close();
			System.out.println("đây là file D:/file/luyentap76nhanvien.txt");
		} catch (Exception e) {
			System.out.println("đọc file thất bại");
		}
		
	}
	public static void luufile() {
		
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("D:/file/luyentap76nhanvien.txt");
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(staff.getStaffList());
			objectOutputStream.close();
			fileOutputStream.close();
			System.out.println("lưu file thành công ");
		} catch (Exception e) {
			System.out.println("lưu file thất bại");
		}
		
	}
	@SuppressWarnings({ "resource" })
	private static String nhapmsnvdung(String msnv) {
		System.out.print("nhâp mã số nhân viên : ");
		while (true) {
			msnv=new Scanner(System.in).nextLine();
			if (staff.kiemtraMSNV(msnv)==-1) {
				return msnv;
			}
			else {
				System.out.print("msnv bị trung ,xin hãy nhập lại mã số nhân viên : ");
			}
		}
	}
	private static void xuattatcaNV() {
		System.out.println("thông tin các nhân viên :");
		staff.payDay();
	}
	@SuppressWarnings("resource")
	private static void nhapNVLTG(String msnv,int vt) {
		System.out.println("nhập nhân viên làm theo giờ : ");
		System.out.print("nhập tên :");
		String name=new Scanner(System.in).nextLine();
		System.out.print("nhập địa chỉ : ");
		String address=new  Scanner(System.in).nextLine();
		System.out.print("nhập số điện thoại : ");
		String phone=new Scanner(System.in).nextLine();
		if (msnv.equals("#")) {
              msnv=nhapmsnvdung(msnv);
              vt=-2;
		} 
		System.out.print("nhập số an sinh XH : ");
		String socialSecurityNumber=new Scanner(System.in).nextLine();
		System.out.print("nhập bậc lương : ");
		double payRate=new Scanner(System.in).nextDouble();
		System.out.print("nhập số giờ làm : ");
	    int addHour=new Scanner(System.in).nextInt();
	    Hourly hourly=new  Hourly();
	    hourly.setName(name);
	    hourly.setAddress(address);
	    hourly.setPhone(phone);
	    hourly.setMasonhanvien(msnv);
	    hourly.setSocialSecurityNumber(socialSecurityNumber);
	    hourly.setPayRate(payRate);
	    hourly.setAddHour(addHour);
	    if (vt==-2) {
	    	staff.addStaffMember(hourly);
		} else {
            staff.setStaffMember(vt, hourly); 
		}
	    
		msnv="#";
	}
	@SuppressWarnings("resource")
	private static void nhapNVĐH(String msnv,int vt) {
		System.out.println("nhập nhân viên điều hành : ");
		System.out.print("nhập tên :");
		String name=new Scanner(System.in).nextLine();
		System.out.print("nhập địa chỉ : ");
		String address=new  Scanner(System.in).nextLine();
		System.out.print("nhập số điện thoại : ");
		String phone=new Scanner(System.in).nextLine();
		if (msnv.equals("#")) {
			msnv=nhapmsnvdung(msnv);
			vt=-2;
		}
	    System.out.print("nhập số an sinh XH : ");
		String socialSecurityNumber=new Scanner(System.in).nextLine();
		System.out.print("nhập bậc lương : ");
		double payRate=new Scanner(System.in).nextDouble();
		System.out.print("nhập tiền thưởng : ");
	    double bonus=new Scanner(System.in).nextDouble();
	    Executive executive=new Executive();
	    executive.setName(name);
	    executive.setAddress(address);
	    executive.setPhone(phone);
	    executive.setMasonhanvien(msnv);
	    executive.setSocialSecurityNumber(socialSecurityNumber);
	    executive.setPayRate(payRate);
	    executive.setBonus(bonus);
	    if (vt==-2) {
	    	staff.addStaffMember(executive);
		} else {
            staff.setStaffMember(vt, executive); 
		}
	    msnv="#";
	}
	@SuppressWarnings("resource")
	private static void nhapNVTN(String msnv,int vt) {
		System.out.println("nhập nhân viên tinh nguyện ");
		System.out.print("nhập tên :");
		String name=new Scanner(System.in).nextLine();
		System.out.print("nhập địa chỉ : ");
		String address=new  Scanner(System.in).nextLine();
		System.out.print("nhập số điện thoại : ");
		String phone=new Scanner(System.in).nextLine();
		if (msnv.equals("#")) {
			msnv=nhapmsnvdung(msnv);
			vt=-2;
		}
	    System.out.print("nhập sô tiển : ");
		double money=new Scanner(System.in).nextDouble();
		volunteer volunteer=new volunteer();
		volunteer.setName(name);
		volunteer.setAddress(address);
		volunteer.setPhone(phone);
		volunteer.setMasonhanvien(msnv);
		volunteer.setMoney(money);
		if (vt==-2) {
	    	staff.addStaffMember(volunteer);
		} else {
            staff.setStaffMember(vt, volunteer); 
		}
		msnv="#";
	}
	public static void main(String[] args) {
		menu();

	}

}
