package hoccaicuaquang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import javax.imageio.metadata.IIOInvalidTreeException;

public class baitaptugiai46 {

	
	public static void gamedoanso() {
		Random random=new Random();
		int sonhap,sorandom,diem=5;
		String string;
		boolean kt=false;
		do {
			diem=5;
			System.out.println("..........game đoán số dễ bị thua ...............");
			while (diem != 0) {
				System.out.println("hãy đoán số từ 0->5");
				System.out.println("số điểm hiện tại của bạn : "+diem);
				sorandom=random.nextInt(6);
				System.out.print("nhap so đoán :");
				try {
					sonhap=new Scanner(System.in).nextInt();
					if (sonhap==sorandom) {
						diem++;
					} else {
                          diem--;  
					}
				} catch (Exception e) {
					System.out.println("ban nhập sai dữ liệu xin hãy nhập lại ");
				}
				if (diem==10) {
					System.out.println(".......Congratulation! You Win!..........");
					kt=true;
					break;
				}
			}
			if (kt==false) {
				System.out.println("...........Game Over...........");
			}
			System.out.print("ban có muốn chơi tiếp k (c/k)");
			string=new Scanner(System.in).nextLine();
			if (string.equals("k")) {
				break;
			}
		} while (true);
		System.out.println("..........cảm ơn bạn đã sử dụng phần mềm........");
	}
	public static boolean ktchuoicophailaso(String s) {
		if (s.matches("\\d*")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void NegativeNumberInStringcach2(String s) {
	    int d;
	    StringBuilder stringBuilder=new StringBuilder();
	    String c = null,b;
	    boolean a;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i)+"").equals("-")) {
				d=1;
				a=false;
				while (i+d!=s.length()) {
					b=s.substring(i+1,i+1+d);
					if (ktchuoicophailaso(b)) {
						c=b;
						d++;
						a=true;	
					} else {
                        break; 
					}
				}
				if (a) {
					stringBuilder.append("-");
					stringBuilder.append(c);
					stringBuilder.append(",");
				}
			}
		}
		stringBuilder.delete(stringBuilder.length()-1, stringBuilder.length());
		System.out.println("các số âm trong chuoi la "+stringBuilder.toString());
	}

	public static int nhapngaythangnamxuatratuoi(String s) {
		Calendar calendar=Calendar.getInstance();
		int tuoi = 0;
		int yearhietai=calendar.get(calendar.YEAR);
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		try {
			Date date=simpleDateFormat.parse(s);
			calendar.setTime(date);
	         tuoi =yearhietai-calendar.get(calendar.YEAR);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return tuoi;
		
	}
	public static boolean nhanbietkituvietthuong(char c) {
		if (c<97||c>122) {
			return false;
		}
		return true;
	}
	public static boolean nhanbietkituviethoa(char c) {
		if (c<65||c>90) {
			return false;
		}
		return true;
	}
	public static int baonhieuchuinHOA(String s) {
		int dem=0;
		for (int i = 0; i < s.length(); i++) {
			if (nhanbietkituviethoa(s.charAt(i))==true) {
				dem++;
			}
		}
		return dem;
	}

	public static int baonhieuchuinTHUONG(String s) {
		int dem=0;
		for (int i = 0; i < s.length(); i++) {
			if (nhanbietkituvietthuong(s.charAt(i))) {
				dem++;
			}
		}
		return dem;
	}
	public static int baonhieuchulaCHUSO(String s) {
		int dem=0;
		for (int i = 0; i < s.length(); i++) {
			if (ktchuoicophailaso(s.charAt(i)+"")) {
				dem++;
			}
		}
		return dem;
	}
	public static int baonhieuchulaKITUDACBIET(String s) {
		int dem=0;
		for (int i = 0; i < s.length(); i++) {
			if (ktchuoicophailaso(s.charAt(i)+"")||nhanbietkituviethoa(s.charAt(i))||nhanbietkituvietthuong(s.charAt(i))) {
				
			}
			else {
				dem++;
			}
		}
		return dem;
	}
	public static int baonhieuchulakhoangtrang(String s) {
		int dem=0;
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i)+"").equals(" ")) {
				dem++;
			}
		}
		return dem;
	}
	public static boolean kiemtrasonguyenan(char c) {
		if (c=='a'||c=='A'||c=='e'||c=='E'||c=='i'||c=='I'||c=='u'||c=='U'||c=='o'||c=='O') {
		    return true;	
		}
		return false;				
	}
	public static int baonhieuchulaNGUYENAM(String s) {
		int dem=0;
		for (int i = 0; i < s.length(); i++) {
			if (kiemtrasonguyenan(s.charAt(i))) {
				dem++;
			}
		}
		return dem;
	}

	public static int baonhieuchulaPHUAM(String s) {
		int dem=0;
		for (int i = 0; i < s.length(); i++) {
			if (kiemtrasonguyenan(s.charAt(i))==false&&(nhanbietkituviethoa(s.charAt(i))||nhanbietkituvietthuong(s.charAt(i)))) {
				dem++;
			}
		}
		return dem;
	}
	
	public static void main(String[] args) {
		String s="jiji6-97-i1yu -6";
		int a=s.indexOf("-");
		System.out.println(a);
		NegativeNumberInStringcach2(s);
		s="8/7/1990";
		System.out.println("tuổi của bạn : "+nhapngaythangnamxuatratuoi(s));
        s="H Kkh  .; yiu7UiDk";
        a=baonhieuchulaPHUAM(s);
        System.out.println(a);
	}

}
