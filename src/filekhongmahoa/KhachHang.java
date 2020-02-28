package filekhongmahoa;

public class KhachHang {
	private String ma;
	private String ten;
	private String diachi;
	public String getMa() {
		return ma;
	}
	public void setMa(String ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiachi() {
		return diachi;
	}
	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	public KhachHang(String ma, String ten, String diachi) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.diachi = diachi;
	}
	public KhachHang() {
		super();
	}
	@Override
	public String toString() {
		
		return this.ma+"   ;   "+this.ten+"   ;   "+this.diachi;
	}

}
