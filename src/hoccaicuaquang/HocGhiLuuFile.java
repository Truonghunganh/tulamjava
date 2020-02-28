package hoccaicuaquang;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HocGhiLuuFile {

	static ArrayList< String >dsten=new ArrayList<>();
	@SuppressWarnings("resource")
	public static void menu() {
		String lc="";
		String tenfile ="D:/file/test.txt";
		docfile(tenfile);
		xuat();
		do {
			System.out.println("...........menu............");
			System.out.println("0.kết thúc");
			System.out.println("1.thêm");
			System.out.println("2.xuất");
			System.out.println("3.sấp xếp ");			
			System.out.println("4.luu flle");
			System.out.println("5.xóa theo vị trí");
            System.out.println("6.xóa theo tên");			
			System.out.print("bạn chọn gì : ");
			lc=new Scanner(System.in).nextLine();
			switch (lc) {
			case "0":

				break;
			case "1":
                them(); 
				break;
			case "2":
				xuat();
				break;
			case "3":
                sapxep();
				break;
			case "4":
                 luufile(tenfile);
				break;
            case "5":
            	xoatheovitri();
            	break;
            case "6":
            	xoatheoten();
            	break ;
			default:
				break;
			}
			
		} while (!lc.equals("0"));
		System.out.println("bạn có muốn lưu lai k (C/k");
		lc=new Scanner(System.in).nextLine();
		if (lc=="k"||lc=="K") {
			
		} else {
            luufile(tenfile);
		}
	}
	@SuppressWarnings("unlikely-arg-type")
	private static void xoatheoten() {
		ArrayList<Integer>vitri=new ArrayList<>();
		System.out.print("nhập tên cần xóa : ");
		@SuppressWarnings("resource")
		String ten=new Scanner(System.in).nextLine();
		for (int i = 0; i < dsten.size(); i++) {
			if (dsten.equals(ten)) {
				vitri.add(i);
			}
		}
		for (int i : vitri) {
			dsten.remove(i);
		}
	}
	private static void xoatheovitri() {
		do {
			try {
				System.out.println("nhập vị trí cần xóa : ");
				@SuppressWarnings("resource")
				int vitri=new Scanner(System.in).nextInt();
				if (vitri>0&&vitri<=dsten.size()) {
					dsten.remove(vitri-1);
					break;
				}
				System.out.println("bạn nhập sai xin nhập lại :");
			} catch (Exception e) {
				System.out.println("bạn nhập sai xin nhập lại :");
			}
		} while (true);
		
	}
	private static void sapxep() {	
		Collections.sort(dsten);
		xuat();
	}
	private static void xuat() {
		System.out.println("danh sách tên là :");
		for (int i = 0; i < dsten.size(); i++) {
			System.out.println((i+1)+"\t"+dsten.get(i));
		}
		
	}
	private static void them() {
		System.out.print("nhập tên cần thêm : ");
		@SuppressWarnings("resource")
		String ten=new Scanner(System.in).nextLine();
		dsten.add(ten);
	}
	public static void luufile(String tenfileluu) {
		try {
			FileOutputStream fos=new FileOutputStream(tenfileluu);
			OutputStreamWriter osw= new OutputStreamWriter(fos, "UTF-8");
			BufferedWriter bw=new BufferedWriter(osw);
			for (int i = 0; i < dsten.size(); i++) {
				bw.write(dsten.get(i));
				bw.newLine();
			}
			System.out.println("đã luu thanh cong");
			bw.close();
			osw.close();
			fos.close();
		} catch (Exception e) {
			System.out.println("luu khong thanh cong");
		}
	}
	public static void docfile(String tenfile) {
		try {
			FileInputStream fis=new FileInputStream(tenfile);
			InputStreamReader isr=new InputStreamReader(fis,"UTF-8");
			BufferedReader Bfr=new BufferedReader(isr);
			String line="";
			line=Bfr.readLine();
			while (line!=null) {
				if (line.length()>0) {
					dsten.add(line);
				}
				line=Bfr.readLine();
			}
			Bfr.close();
			isr.close();
			fis.close();
		} catch (Exception e) {
            System.out.println("đọc file không thành công"); 
		}
	}

	public static void main(String[] args) {
		menu();

	}

}
