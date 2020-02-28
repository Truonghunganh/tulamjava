package luyentap75nhanvien;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class testNhanVien {
	static ArrayList<NhanVien>DSNV=new ArrayList<>();
	@SuppressWarnings("resource")
	public static void menu() {
	    docfile();
	    xuat();
		int cl=0;
		do {
			System.out.println("..........menu...........");
			System.out.println("0.kết thúc");
			System.out.println("1.thêm");
			System.out.println("2.Xuất");
			System.out.println("3.xóa theo mã");
			System.out.println("4.sấp xếp");
			System.out.println("5.cập nhật");
			System.out.println("6.nhập từ đầu");
			System.out.println();
			do {
				try {
					System.out.print("nhập lựa chọn của bạn : ");
					cl=new Scanner(System.in).nextInt();
					break;	
				} catch (Exception e) {
					System.out.println("bạn nhập sai .xin nhập lại :");
				}
			} while (true);
			switch (cl) {
			case 0:

				break;
			case 1:
				them();
				break;
			case 2:
				xuat();  
				break;
			case 3:
				xoatheoma();                   
				break;
			case 4:
				sapxeptheotienluong();
				break;
			case 5:
				capnhap();
				break;
			case 6:
				nhaplaitudau();
				break;

			default:
				break;
			}


		} while (cl!=0);
		luufile(DSNV);
	}

    public static void luufile(Object data) {
		try {
			FileOutputStream fileOutputStream=new FileOutputStream("D:/file/testNhanVien75.txt");
			ObjectOutputStream objectOutputStream =new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(data);
			objectOutputStream.close();
			fileOutputStream.close();
			System.out.println("lưu thành công");
		} catch (Exception e) {
			System.out.println("lưu thất bại");
		}
    	
	} 
    @SuppressWarnings("unchecked")
	public static void docfile() {
		try {
			FileInputStream fileInputStream=new FileInputStream("D:/file/testNhanVien75.txt");
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			DSNV=(ArrayList<NhanVien>)objectInputStream.readObject();
			objectInputStream.close();
			fileInputStream.close();
			System.out.println("đây là đanh sách đọc từ file D:/file/testNhanVien75.txt");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("đọc file thất bại ");
		}
	}
	@SuppressWarnings("resource")
	private static void nhaplaitudau() {
		DSNV=new ArrayList<>();
		int n;
		do {
			try {
				System.out.print("số lượng nhân viên : ");
				n=new Scanner(System.in).nextInt();
				break;
				
			} catch (Exception e) {
		         System.out.println("bạn nhập sai xin nhập lại : ");  
			}
		} while (true);
		for (int i = 0; i < n; i++) {
			System.out.println("nhân viên thứ "+(i+1));
			them();
		}

	}


	@SuppressWarnings("resource")
	private static void capnhap() {
		int ma,i;
		
		if (DSNV.size()==0) {
			System.out.println("không nhân viên để cập nhập");
			return;
		}
		xuat();
		do {
			try {
				System.out.print("nhâp mã : ");
				ma=new Scanner(System.in).nextInt();
				i=ktma(ma);
				if (i!=-1) {
					break;
				}
				System.out.println("nhâp mã bị  trùng xin nhập lại : ");
			} catch (Exception e) {
				System.out.println("bạn nhập sai xin nhập lại :");
			}
		} while (true);
		int SoSP; 
		String ho;
		String ten;
        System.out.print("nhập họ : "); 
		ho=new Scanner(System.in).nextLine();
		System.out.print("nhập tên : ");
		ten=new Scanner(System.in).nextLine();
		do {
			try {
				System.out.print("nhập số sản phẩm : ");
				SoSP=new  Scanner(System.in).nextInt();
				break;	
			} catch (Exception e) {
				System.out.println("bạn nhập sai .xin nhập lại :");
			}
		} while (true);
		DSNV.set(i, new NhanVien(ma, ho, ten, SoSP));
		xuat();
	}


	private static void sapxeptheotienluong() {
		for (int i = 0; i < DSNV.size()-1; i++) {
			for (int j = DSNV.size()-1; j > i; j--) {
				if (DSNV.get(j-1).getLuong()<DSNV.get(j).getLuong()) {
					NhanVien nv=DSNV.get(j-1);
					DSNV.set(j-1,DSNV.get(j));
					DSNV.set(j,nv);
				}
			}
		}

	}


	@SuppressWarnings("resource")
	private static void xoatheoma() {
		int ma,i;
		do {
			try {
				System.out.print("nhập mã cần xóa : ");
				ma=new Scanner(System.in).nextInt();
				i=ktma(ma);
				if (i!=-1) {
					break;
				}
		        System.out.println("mã vừa  nhập không có trong danh sách ");    				
			} catch (Exception e) {
				System.out.println("bạn  nhập sai xin nhập lại :");
			}
		} while (true);
		DSNV.remove(i);
	}

	private static void xuat() {
		System.out.println("STT     mã NV        họ và tên         số SP          lương NV ");
		for (int i = 0; i < DSNV.size(); i++) {
			System.out.println((i+1)+"\t  "+DSNV.get(i).getMaNV()+"\t"+DSNV.get(i).getHo()+" "+DSNV.get(i).getTen()+"\t\t"+DSNV.get(i).getSoSP()+"\t\t"+DSNV.get(i).getLuong());
		}
	}


	public static int ktma(int ma) {
		for (int i = 0; i < DSNV.size(); i++) {
			if (DSNV.get(i).getMaNV()==ma) {
				return i;
			}
		}
		return -1;
	}
	@SuppressWarnings("resource")
	private static void them() {
		int Ma,i;
		int SoSP; 
		String ho;
		String ten;

		do {
			try {
				System.out.print("nhập mã : ");
				Ma=new Scanner(System.in).nextInt();
				i=ktma(Ma);
				if (i==-1) {
					System.out.println("xin bạn nhập lại vì mã bị trùng");
				}else {
					break;
				}
					
			} catch (Exception e) {
				System.out.println("bạn nhập sai .xin nhập lại :");
			}
		} while (true);
		System.out.print("nhập họ : ");
		ho=new Scanner(System.in).nextLine();
		System.out.print("nhập tên : ");
		ten=new Scanner(System.in).nextLine();
		do {
			try {
				System.out.print("nhập số sản phẩm : ");
				SoSP=new  Scanner(System.in).nextInt();
				break;	
			} catch (Exception e) {
				System.out.println("bạn nhập sai .xin nhập lại :");
			}
		} while (true);
		NhanVien nv=new NhanVien(Ma,ho, ten, SoSP);
		DSNV.add(nv);
	}


	public static void main(String[] args) {
		menu();   
	}

}
