package baitap;

import java.util.Scanner;

public class cacpheptinh {

	public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap a=");float a=scanner.nextFloat();
        System.out.println("nhap b=");float b=scanner.nextFloat();
        System.out.println("nhap phep tinh : "); String dau=scanner.next();
        switch (dau) {
		case "+":
			System.out.println(a+"+"+b+"="+(a+b));
			break;
		case "-":
			System.out.println(a+"-"+b+"="+(a-b));
			break;
		case "*":	
		case "x"  :
			System.out.println(a+"x"+b+"="+(a*b));
			break;
		case ":":	
		case "/"  :
			System.out.println(a+":"+b+"="+(a/b));
			break;
        
		default:System.out.println("khong co dau do");
			break;
		}
	}

}
