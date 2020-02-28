package filemahoa;

import java.io.Serializable;


@SuppressWarnings("serial")
public class KhachHang implements Serializable ,Comparable<KhachHang>{
	private int ma;
	private String ten;
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public KhachHang(int ma, String ten) {
		super();
		this.ma = ma;
		this.ten = ten;
	}
	@Override
	public String toString() {
		return this.ma+"\t"+this.ten;
	}
	@Override
	public int compareTo(KhachHang khachHang) {
		return this.ten.compareToIgnoreCase(khachHang.ten);
	}
           
}
