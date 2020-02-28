package hoccaicuaquang;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;



public class HocArrayList {

	public static void nhapdanhsachsonguyen(ArrayList<Integer>ds) {
		Random random =new Random();
		int a;
		for (int i = 0; i < 8; i++) {
			a=random.nextInt(20);
			ds.add(a);
		}
	}
	public static void xuatdanhsach(ArrayList<Integer>ds) {
		for (int i = 0; i < ds.size(); i++) {
			System.out.print(ds.get(i)+"  ");
		}
	    System.out.println();
	}
   	public static void timkiem(ArrayList<Integer>ds,int giatri) {
   		String luu="";
		boolean kt=false;
   		for (int i = 0; i < ds.size(); i++) {
			if (giatri==ds.get(i)) {
                luu=luu+i+",";
                kt=true;
			}
		}
   		if (kt) {
			System.out.println("đã tìm thây "+giatri+" ở các vị trí "+luu);
		}
   		else {
			System.out.println("không tìm thấy gia tri "+giatri);
		}
	}
   	public static void giamdan(ArrayList<Integer>ds) {
   		int giatri;
   		for (int i = 0; i < ds.size()/2; i++) {
			giatri=ds.get(i);
			ds.set(i,ds.get(ds.size()-1-i));
			ds.set(ds.size()-1-i,giatri);
			
		}
		
	}
   	private static void xoagiatricotrongmang(ArrayList<Integer> ds) {
	       System.out.print("nhap gia tri cần xóa :");
	       int gt;
	       do {
			try {
				 gt=new Scanner(System.in).nextInt();
				break;
			} catch (Exception e) {
             System.out.println("nhap sai,xin hay nhập lại :");
			}
		} while (true);
		boolean a=false;
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i)==gt) {
	            ds.remove(i);
	            i--;
	            a=true;	            		
			}
		}
		if (a) {
			System.out.println("danh sách đã được xóa giá tri "+gt+" là ");
			xuatdanhsach(ds);
		} else {
        System.out.println("giá trị "+gt+" khong có dang sách ");    
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer>ds=new ArrayList<Integer>();
		int lc = 0;
		int vitri;
		int giatri;
		nhapdanhsachsonguyen(ds);
		xuatdanhsach(ds);
		do {
			System.out.println(".........menu.........");
			System.out.println("0.kết thúc ct");
			System.out.println("1) thêm");
			System.out.println("2) sửa");
			System.out.println("3) xóa");
			System.out.println("4) tim kiếm");
			System.out.println("5) sắp xếp tăng dần");
			System.out.println("6) sắp xếp giảm dần");
			System.out.println("7) xóa giá trị có trong danh sach ");
			System.out.print("nhập lựa chọn :");
			
			do {
				try {
					lc=new Scanner(System.in).nextInt();
					break;				
				} catch (Exception e) {
					System.out.println("bạn nhập sai ,xin nhập lại lựa chọn :");
				}
			} while (true);
			switch (lc) {
			case 0:
				ds.clear();
				break;
			case 1:
				do {
					System.out.print("nhap vị trí cần thêm :");
					try {
						vitri=new Scanner(System.in).nextInt();
					    if (vitri>0&&vitri<ds.size()) {
							break;
						} 					
					} catch (Exception e) {
						System.out.print("bạn nhập sai ,xin nhập lại vị trí :");
					}
				} while (true);
				do {
					try {
						System.out.print("nhap gia trị cần thêm :");
						 giatri=new Scanner(System.in).nextInt();
					     break;				
					} catch (Exception e) {
						System.out.print("bạn nhập sai ,xin nhập lại  :");
					}
				} while (true);
				ds.add(vitri,giatri);
				System.out.println("danh sach đã thêm là : ");
				xuatdanhsach(ds);
				break;
			case 2:
				do {
					System.out.print("nhap vị trí cần sữa :");
					try {
						vitri=new Scanner(System.in).nextInt();
					    if (vitri>0&&vitri<ds.size()) {
							break;
						} 					
					} catch (Exception e) {
						System.out.print("bạn nhập sai ,xin nhập lại vị trí :");
					}
				} while (true);
				do {
					try {
						System.out.print("nhap gia trị cần sữa :");
						 giatri=new Scanner(System.in).nextInt();
					     break;				
					} catch (Exception e) {
						System.out.print("bạn nhập sai ,xin nhập lại  :");
					}
				} while (true);
			    ds.set(vitri, giatri);
			    System.out.println("danh sach đã sữa là : ");
			    xuatdanhsach(ds);
				break;
			case 3:
				do {
					System.out.print("nhap vị trí cần xóa :");
					try {
						vitri=new Scanner(System.in).nextInt();
					    if (vitri>0&&vitri<ds.size()) {
							break;
						} 					
					} catch (Exception e) {
						System.out.print("bạn nhập sai ,xin nhập lại vị trí :");
					}
				} while (true);
				ds.remove(vitri);
				System.out.println("danh sach đã xóa là : ");
			    xuatdanhsach(ds);
				break;
			case 4:
				do {
					try {
						System.out.print("nhap gia trị cần tìm :");
						 giatri=new Scanner(System.in).nextInt();
					     break;				
					} catch (Exception e) {
						System.out.print("bạn nhập sai ,xin nhập lại  :");
					}
				} while (true);
				timkiem(ds, giatri);
				break;
			case 5:
				System.out.println("danh sách đã được sắp xếp tăng dần:");
				java.util.Collections.sort(ds);
				xuatdanhsach(ds);
				break;
			case 6:
				System.out.println("danh sách đã được sắp xếp giảm dần :");
				java.util.Collections.sort(ds);
				giamdan(ds);
				xuatdanhsach(ds);
				break;
			case 7:
				xoagiatricotrongmang(ds);
				break;
			default:
				break;
			}
		} while (lc!=0);
		ds.clear();
		System.out.println("cảm ơn bạn dã sử dụng ");
	}
	
}
//ArrayList<Integer>ds=new ArrayList<Integer>();
//nhapdanhsachsonguyen(ds);
//xuatdanhsach(ds);
////thêm 6 ở vi trí thứ 3 : 	ds.add(3,6);
//// xóa vi tri thư 2 : ds.remove(2);
//// thay đổi giá tri tại vị tri 4 thành 8 : ds.set(4, 8);
//	//xóa hết danh sach	ds.clear();
//xuatdanhsach(ds);