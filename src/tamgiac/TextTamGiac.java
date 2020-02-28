package tamgiac;

public class TextTamGiac {

	public static double tongcuamang(double ...a) {
		double s=0;
		for(double x:a) {
			s+=x;
		}
		return s;
	}
	public static void main(String[] args) {
		TamGiac aGiac=new TamGiac(3, 4, 5);
		System.out.println(aGiac);
        System.out.println(tongcuamang(1,2,4));
        System.out.println(tongcuamang(1,2,4,7.8));
	}

}
