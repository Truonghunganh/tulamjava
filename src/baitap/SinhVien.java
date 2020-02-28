package baitap;

public class SinhVien {

	private String maSV ;
	private String tenSV ;
	private int tuoiSV ;
	private String diaChiSV ;
	public String getMaSV() {
		return maSV;
	}
	public void setMaSV(String maSV) {
		this.maSV = maSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public int getTuoiSV() {
		return tuoiSV;
	}
	public void setTuoiSV(int tuoiSV) {
		this.tuoiSV = tuoiSV;
	}
	public String [] sv() {
		String sv[]= {this.maSV,this.tenSV,this.tuoiSV+"",this.diaChiSV};
		return sv;
	}
	public String getDiaChiSV() {
		return diaChiSV;
	}
	public void setDiaChiSV(String diaChiSV) {
		this.diaChiSV = diaChiSV;
	}
	public SinhVien(String maSV, String tenSV, int tuoiSV, String diaChiSV) {
		super();
		this.maSV = maSV;
		this.tenSV = tenSV;
		this.tuoiSV = tuoiSV;
		this.diaChiSV = diaChiSV;
	}
	public SinhVien() {
		super();
	}
	
}
