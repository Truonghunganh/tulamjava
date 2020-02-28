package quanglykhachhangphan3bai26;

import java.util.Vector;

public class NhomKhachHang {
	private String code;
	private String name;
	private  Vector<KhachHang> dSkhcuanhomdo;
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Vector<KhachHang> getdSkhcuanhomdo() {
		return dSkhcuanhomdo;
	}
	public void setdSkhcuanhomdo(Vector<KhachHang> dSkhcuanhomdo) {
		this.dSkhcuanhomdo = dSkhcuanhomdo;
	}
	public NhomKhachHang(String code, String name) {
		this.code = code;
		this.name = name;
		this.dSkhcuanhomdo=new Vector<KhachHang>();
	}
	public NhomKhachHang() {
		super();
	}
	public void addKhachHang(KhachHang khachHang) {
		
		this.dSkhcuanhomdo.add(khachHang);// nhóm đó có bao nhiêu khách hàng 
		khachHang.setNhomKhachHang(this);// cho biết khách hàng đó thuộc nhóm nào
	}
	@Override
	public String toString() {
		return this.name;
	}
}
