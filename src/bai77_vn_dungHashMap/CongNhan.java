package bai77_vn_dungHashMap;

public class CongNhan extends Nhanvien {

	protected   String SoAnSinhXH;
	protected   double BacLuong;
	public String getSoAnSinhXH() {
		return SoAnSinhXH;
	}
	public void setSoAnSinhXH(String soAnSinhXH) {
		SoAnSinhXH = soAnSinhXH;
	}

	public double getBacLuong() {
		return BacLuong;
	}
	public void setBacLuong(double bacLuong) {
		BacLuong = bacLuong;
	}
	
	@Override
	public String toString() {
		return super.toString()+" ; số an sinh xã hội : "+SoAnSinhXH+";bậc lương : "+BacLuong;
	}
	@Override
	public double pay() {
		return 0;
	}

}
