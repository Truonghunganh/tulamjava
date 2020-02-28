package luyentap75nhanvien;

import java.io.Serializable;
@SuppressWarnings("serial")
public class NhanVien implements Serializable{//có quyền chụp ảnh  để lưu
	private int MaNV;
	private String ho;
	private String ten;
	private int SoSP;
	public String getHo() {
		return ho;
	}
	public void setHo(String ho) {
		this.ho = ho;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSoSP() {
		return SoSP;
	}
	public void setSoSP(int soSP) {
		SoSP = soSP;
	}
	public boolean LonHon(NhanVien nv2) {
		if (this.getSoSP()>nv2.getSoSP()) {
			return true;
		}
		return false;
	}
	public double getLuong() {
		if (this.getSoSP()<1) {
			return 0;
		}
		if (this.getSoSP()<200) {
			return getSoSP()*0.5;
		}
		if (getSoSP()<400) {
			return getSoSP()*0.55;
		}
		if (getSoSP()<600) {
			return getSoSP()*0.6;
		}
		
		return getSoSP()*0.65;
	}
	public NhanVien(int ma,String ho,String ten,int SoSP) {
	    this.MaNV=ma;
		this.ho=ho;
		this.ten=ten;
		this.SoSP=SoSP;
		if (SoSP<0) {
			this.SoSP=0;
		}
		
	}
	public int getMaNV() {
		return MaNV;
	}
	public void setMaNV(int maNV) {
		MaNV = maNV;
	}
     
}
