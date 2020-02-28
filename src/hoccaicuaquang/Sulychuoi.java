package hoccaicuaquang;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Sulychuoi {
	public static void chenchuoi(String s) {
	System.out.println(s);
	System.out.print("nhap vi can chen vao : ");
	int vitricanchen=new Scanner(System.in).nextInt();
	StringBuilder stringBuilder=new StringBuilder(s);
	System.out.print("nhap chuoi can chen vao : ");
	String b=new Scanner(System.in).nextLine();
	stringBuilder.insert(vitricanchen, b);
	s=stringBuilder.toString();
	System.out.println(s);
}
public static void xoachuoitheovitri(String s) {
	System.out.println(s);
	System.out.print("nhập vi tri đầu :");
	int vitriBD=new Scanner(System.in).nextInt();
	System.out.print("nhập vi tri cuối :");
	int vitriC=new Scanner(System.in).nextInt();
	StringBuilder stringBuilder=new StringBuilder(s);
	stringBuilder.delete(vitriBD, vitriC);
	s=stringBuilder.toString();
	System.out.println(s);
}
public static void timvitridautiencuachuoikhitanhapchuoi(String s) {
	System.out.println(s);
	System.out.print("nhập chuổi cần tìm : ");
	String chuoicantim=new Scanner(System.in).nextLine();
	if (s.indexOf(chuoicantim)==-1) {
		System.out.println("không tim thấy chuổi bạn tìm ");
	}
	else {
		System.out.println("tim thấy chuổi ' "+chuoicantim+" ' đầu tiên ở vị trí : "+s.indexOf(chuoicantim));
	}
}
public static void timvitricuoicungcuachuoikhitanhapchuoi(String s) {
	System.out.println(s);
	System.out.print("nhập chuổi cần tìm : ");
	String chuoicantim=new Scanner(System.in).nextLine();
	if (s.lastIndexOf(chuoicantim)==-1) {
		System.out.println("không tim thấy chuổi bạn tìm ");
	}
	else {
		System.out.println("tim thấy chuổi ' "+chuoicantim+" ' cuối cùng ở vị trí : "+s.lastIndexOf(chuoicantim));
	}
}
public static void timsolanxuathiencuachuoitheotatca(String s) {
	System.out.println(s);
	int dem=0;
	String stringnext;
	StringTokenizer stringTokenizer=new StringTokenizer(s);
	System.out.print("nhập chuoi đang tim : ");
	String chuoicantim=new Scanner(System.in).nextLine();
	while (stringTokenizer.hasMoreTokens()) {
		stringnext=stringTokenizer.nextToken();
		if (stringnext.contains(chuoicantim)) { //chứa trong 
			dem++;
		}
	}
	System.out.println(" chữ ' "+chuoicantim+" ' xuất hiện "+dem+" lần");
}
public static void timsolanxuathiencuachuoitheocachnhauboidaucach(String s) {
	System.out.println(s);
	int dem=0;
	String stringnext;
	StringTokenizer stringTokenizer=new StringTokenizer(s);
	System.out.print("nhập chuoi đang tim : ");
	String chuoicantim=new Scanner(System.in).nextLine();
	while (stringTokenizer.hasMoreTokens()) {
		stringnext=stringTokenizer.nextToken();//những từ cách nhau bởi dấu cách
		if (stringnext.equals(chuoicantim)) { //stringnext và chuoicantim có bằng nhau không  
			dem++;
		}
	}
	System.out.println(" chữ ' "+chuoicantim+" ' xuất hiện "+dem+" lần");
}
public static void laychuoicuachuoilon(String s) {
	System.out.println(s);
	System.out.print("nhap vi tri đầu ");int d=new Scanner(System.in).nextInt();
	System.out.print("nhap vi tri đầu ");int c=new Scanner(System.in).nextInt();
	System.out.println("chuoi cần lấy là : "+s.substring(d, c));
}
public static void doichuoinhotrongchuoilontatca(String s) {
	System.out.println(s);
	System.out.print("nhập từ cần đổi : ");
	String tucandoi=new Scanner(System.in).nextLine();
	System.out.print("nhập từ đổi thành : ");
	String tudoithanh=new Scanner(System.in).nextLine();
	s=s.replace(tucandoi, tudoithanh);
	System.out.println(s);
}  
public static String xoahetkhoangtrangduthua(String s) {
	//s=s.trim();//xóa hai bên đoạn ni bị dư.
	StringBuilder luu=new StringBuilder();
	StringTokenizer stringTokenizer=new StringTokenizer(s);
	while (stringTokenizer.hasMoreTokens()) {
		  s=stringTokenizer.nextToken();
	      luu.append(s);// dùng dấu + chạy chậm hơn		      
	      luu.append(" "); 
			
	}

	return luu.toString();
	
}
public static void xoakhoangtrangduthuabentrai(String s) {
	System.out.println(s);
	int vt=0;
	for (int i = 0; i < s.length()-1; i++) {
		if (s.charAt(i)==' ') {
			vt++;
		} else {
            break;
		}
	}
	s=s.substring(vt);
	System.out.println(s);
}
public static void xoakhoangtrangduthuabenphai(String s) {
	System.out.println(s);
	int vt=0;
	for (int i = s.length()-1; i > 0; i--) {
		if (s.charAt(i)==' ') {
			vt++;
		} else {
            break;
		}
	}
	s=s.substring(0,s.length()-1-vt);
	System.out.println(s);
}
public static String xoatatcakhoangtrang(String s) {
	StringBuilder stringBuilder=new StringBuilder();
	StringTokenizer stringTokenizer=new StringTokenizer(s);
	while (stringTokenizer.hasMoreTokens()) {
		stringBuilder.append(stringTokenizer.nextToken());
	}
	s=stringBuilder.toString();
	return s;
}
public static void tachchuoituchuoilon(String s) {
    String []arr =s.split("\\ ");
    for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
public static void bientatcachuthuongthanhchuhoa(String s) {
	s=s.toUpperCase();
	System.out.println(s);
}
public static String biendautienchuthuongthanhchuhoa(String s) {
	s=s.replaceFirst(s.charAt(0)+"", (s.charAt(0)+"").toUpperCase());
	return s;
}
public static String biendoicacchudautiencuachuoithanhchuhoa(String s) {
	StringBuilder stringBuilder=new StringBuilder();
	StringTokenizer stringTokenizer=new StringTokenizer(s);
	while (stringTokenizer.hasMoreTokens()) {
		stringBuilder.append(biendautienchuthuongthanhchuhoa(stringTokenizer.nextToken()));
		stringBuilder.append(" ");
	}
	return stringBuilder.toString();
}
public static String biendoitatcachuhoathanhchuthuong(String s) {
	return  s.toLowerCase();
}
// tach lấy ten bai hat vi du s=D:/baihat/nhactre/loinoidau.mp3
public static String tachlaytenbaihat(String s) {
	int a=s.lastIndexOf("/");
	int b=s.lastIndexOf(".");
	return s.substring(a+1, b);
}
public static boolean kiemtrachuoiPannyDrome(String s) {
    char []arr=s.toCharArray();
    for (int i = 0; i < arr.length/2; i++) {
		if (arr[i]!=arr[arr.length-1-i]) {
			return false;
		}	
	}
    return true;
}
public static String toiuuchuoi(String s) {
	String aString;
	StringBuilder stringBuilder= new StringBuilder();
	StringTokenizer stringTokenizer=new StringTokenizer(s);
	while (stringTokenizer.hasMoreTokens()) {
		aString=stringTokenizer.nextToken().toLowerCase();
		aString=biendautienchuthuongthanhchuhoa(aString);
		stringBuilder.append(aString);
		stringBuilder.append(" ");
	}
	return stringBuilder.toString();
}
public static String biencauvanthanhdep(String s) {
	StringBuilder stringBuilder=new StringBuilder();
    s=s.toLowerCase();
    s=xoahetkhoangtrangduthua(s);
    System.out.println(s);
    String []arr=s.split("\\.");
    for (int i = 0; i < arr.length; i++) {
    	if ((arr[i].charAt(0)+"").equals(" ")) {
    		StringBuilder str=new StringBuilder(arr[i]);
    		str.delete(0, 1);
    		arr[i]=str.toString();
		}
    	if ((arr[i].charAt(arr[i].length()-1)+"").equals(" ")) {
    		StringBuilder str=new StringBuilder(arr[i]);
    		str.delete(arr[i].length()-1, arr[i].length());
    		arr[i]=str.toString();
		}
		stringBuilder.append(biendautienchuthuongthanhchuhoa(arr[i]));
		stringBuilder.append(" . ");
	}
    s=stringBuilder.toString();
    
	return s;
}
public static void main(String[] args) {
	String s= "  TruoNg   hUng   .          anh   KOLOLO9 .   i0iuh tft   . l";
	int a=8;
	a=a+8;
    s=biencauvanthanhdep(s);    
;		System.out.println(s);
	


	}
}
