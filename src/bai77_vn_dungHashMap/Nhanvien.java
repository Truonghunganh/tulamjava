 package bai77_vn_dungHashMap;

public abstract class Nhanvien {
	protected String MaNV;
	protected String Ten;
	protected String Diachi;
	protected String Sodienthoai;
	
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getDiachi() {
		return Diachi;
	}
	public void setDiachi(String diachi) {
		Diachi = diachi;
	}
	public String getSodienthoai() {
		return Sodienthoai;
	}
	public void setSodienthoai(String sodienthoai) {
		Sodienthoai = sodienthoai;
	}
	
	@Override
	public String toString() {
		return "MSNV : "+MaNV+" ; tên : "+Ten+" ; địa chỉ : "+Diachi+"; số điện thoại : "+Sodienthoai;
	}
	public  abstract double pay() ;

}
