package baitapmang;


//  cho cái chuỗi , có máy chữ hoa ,thường số
public class Bai3_6chuoimang {
      public static void main(String [] args) {
		String a="12yy7ĐFTYHh8GG";
		int sochuhoa=0,sochuthuong=0,sochuso=0;
		for (int i = 0; i < a.length(); i++) {
			if (Character.isUpperCase(a.charAt(i))) {
				sochuhoa++;
			}
			if (Character.isLowerCase(a.charAt(i))) {
				sochuthuong++;
			}
			if (Character.isDigit(a.charAt(i))) {
				sochuso++;
			}
		}
		System.out.println("số chữ hoa là "+sochuhoa);
		System.out.println("só chữ thường là "+sochuthuong);
		System.out.println("số chữ số là "+sochuso);
		a="D:/music/hùng anh.mp3";
		//lấy tên bàn hát
		System.out.println("tên bài hát là "+a.substring(a.lastIndexOf("/")+1, a.lastIndexOf(".")));
		int []b= {1,21,23,24,5,3,8};
		System.out.println("các  sô  nguyên tố trong mãng b là ");
		for (int i = 0; i < b.length; i++) {
			if (ktsnt(b[i])) {
				System.out.println(b[i]);
			}
		}

		
	}
      public static boolean ktsnt(int a) {
		if (a<2) {
			return false;
		}
		if (a==2) {
			return true;
		}
		for (int i = 2; i < Math.sqrt(a)+1; i++) {
			if (a%i==0) {
				return false;
			}
		}
		return true;
	}
}
