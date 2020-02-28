package hoccaicuaquang;

import java.util.Random;
import java.util.Scanner;

public class gamedansio {
	public static void ktsonaolonhon(int a,int b) {
		if (a>b) {
			System.out.println("số  cần tìm > "+b);
		} else {
			System.out.println("số  cần tìm < "+b);      
		}
	}

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();
        boolean kt=false;
        int so;
		do {
			System.out.println("bắt đầu game đoán số (0->100) đoán 7 lần :");
			int socantim=random.nextInt(101);
			for (int i = 0; i < 7; i++) {
				System.out.print("xin mời bạn đoán số (lần "+(i+1)+") : ");
				try {
					so=new Scanner(System.in).nextInt();
					if (so==socantim) {
						System.out.println(" chúc mừng đã chiến thắng ");
						kt=true;
						break;
					} else {
	                    ktsonaolonhon(socantim, so);   
					}
				} catch (Exception e) {
					System.out.println("bạn nhập sai dữ liệu , xin hay nhập lại ");
					i--;
				}
			}
			if (kt==false) {
				System.out.println("game over");
			}
			System.out.println("bạn có chơi tiếp không ? (c/k)");
			String string= new Scanner(System.in).nextLine();
			if (string.equalsIgnoreCase("k")) {
				break;
			}
		} while (true);   
        System.out.println("cảm ơn bạn đã dùng phần mềm"); 

	}

}
