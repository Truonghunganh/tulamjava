package oppquanglysinhven;


public class SinhVien implements Comparable<SinhVien>{

	private  int MSSV;
	private  String tenSV;
	private  double diemSV;
	private  int tuoiSV;
	private XepLoai Loai;


	public XepLoai getXepLoai() {
		if (diemSV>=8) {
			Loai=XepLoai.gioi;
		} else {
			if (diemSV>=6.5) {
				Loai=XepLoai.kha;                   
			} else {
				if (diemSV>=5) {
					Loai=XepLoai.trungbinh;
				} else {
					Loai=XepLoai.yeu;
				}
			}  
		}
		return Loai;
	}
	public  int getMSSV() {
		return MSSV;
	}
	public  void setMSSV(int mSSV) {
		MSSV = mSSV;
	}
	public String getTenSV() {
		return tenSV;
	}
	public void setTenSV(String tenSV) {
		this.tenSV = tenSV;
	}
	public  double getDiemSV() {
		return this.diemSV;
	}
	public void setDiemSV(double diemSV) {
		this.diemSV = diemSV;
	}
	public  int getTuoiSV() {
		return tuoiSV;
	}
	public  void setTuoiSV(int tuoiSV) {
		this.tuoiSV = tuoiSV;
	}
	public SinhVien( int MSSV,String tenSV,double diemSV,int tuoiSV) {
		this.MSSV=MSSV;
		this.tenSV=tenSV;
		this.diemSV=diemSV;
		this.tuoiSV=tuoiSV;
        this.Loai=getXepLoai(); 
	}
	@Override
	public String toString() {
		return getMSSV()+"\t"+tenSV+"\t"+diemSV+"\t"+tuoiSV+"\t"+this.Loai.description();
	}
	@Override
	public int compareTo(SinhVien sv) {
		//sấp xếp theo mã tăng dần
		/*if (this.MSSV>sv.MSSV) {
			return 1;
		}
		if (this.MSSV<sv.MSSV) {
			return -1;
		}
		return 0;
	*/	 
		//sấp xếp theo tên không phân biệt chữ hoa chữ thường 
		//		return this.tenSV.compareToIgnoreCase(sv.tenSV);
		return this.tenSV.compareToIgnoreCase(sv.tenSV)*-1;//giảm dần 
	}
}
