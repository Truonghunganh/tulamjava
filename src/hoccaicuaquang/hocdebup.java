package hoccaicuaquang;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class hocdebup {

	public static void main(String[] args) {
		DecimalFormat decimalFormat=new DecimalFormat("#,###");//1 mình cái ni là rút gọn số thực
		DecimalFormatSymbols decimalFormatSymbols=new DecimalFormatSymbols(Locale.getDefault());
		decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
		double c=999998;
		System.out.println(c);
		System.out.println(decimalFormat.format(c));

	}

}
