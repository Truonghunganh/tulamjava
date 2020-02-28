package TinhDahinh;

public abstract class HinhHoc {
     private int chieuDai;
     private int chieuRong;
	public int getChieuDai() {
		return chieuDai;
	}
	public void setChieuDai(int chieuDai) {
		this.chieuDai = chieuDai;
	}
	public int getChieuRong() {
		return chieuRong;
	}
	public void setChieuRong(int chieuRong) {
		this.chieuRong = chieuRong;
	}
    public abstract double tinhChuVi();
    public abstract double tinhDienTich();
	public HinhHoc(int chieuDai, int chieuRong) {
		super();
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}
	public HinhHoc() {
		super();
	}
    
}
