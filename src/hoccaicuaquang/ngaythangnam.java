package hoccaicuaquang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class ngaythangnam {

	public static void main(String[] args) {
		// ngày tháng năm của máy của minh
		Calendar calendar=Calendar.getInstance();
		int year=calendar.get(Calendar.YEAR);
		System.out.println(year);
		int day=calendar.get(Calendar.DATE);
		System.out.println(day);
		int month=calendar.get(Calendar.MONTH);
		System.out.println(month);
	    
		Date date=calendar.getTime();
		SimpleDateFormat   simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
		System.out.println( simpleDateFormat.format(date));
		
	    SimpleDateFormat simpleDateFormat2=new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");
	    System.out.println(simpleDateFormat2.format(date));
	    
	    SimpleDateFormat simpleDateFormat3=new SimpleDateFormat("dd/MM/yyyy/ hh:mm:ss aaa");
	    System.out.println(simpleDateFormat3.format(date));
	    
	    //tính tuổi của bạn nhap năm sinh
	    System.out.println(" nhap năm sinh (dd//MM/yyyy) : ");
	    String nS=new Scanner(System.in).nextLine();
	    
	    try {
			Date birthday=simpleDateFormat.parse(nS);
			//cho năm sinh vào lịch
			calendar.setTime(birthday);
			// lấy cái năm sinh ra
			int yearNs=calendar.get(Calendar.YEAR);
			
			//tinh tuổi
			int tuoi=year-yearNs;
			System.out.println("tuổi của bạn là :"+tuoi);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
