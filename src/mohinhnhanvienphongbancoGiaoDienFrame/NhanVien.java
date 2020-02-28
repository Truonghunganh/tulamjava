package mohinhnhanvienphongbancoGiaoDienFrame;

import java.io.Serializable;
import java.util.Date;

public class NhanVien implements  Serializable {
	private static final long serialVersionUID = 1L;
	private String maNhanVien;
	private String tenNhanVien;
	private Date ngayvaolamviec;
	private Date ngaysinh;
	private  PhongBan  phongBan;
	public String getMaNhanVien() {
		return maNhanVien;
	}
	public void setMaNhanVien(String maNhanVien) {
		this.maNhanVien = maNhanVien;
	}
	public String getTenNhanVien() {
		return tenNhanVien;
	}
	public void setTenNhanVien(String tenNhanVien) {
		this.tenNhanVien = tenNhanVien;
	}
	public Date getNgayvaolamviec() {
		return ngayvaolamviec;
	}
	public void setNgayvaolamviec(Date ngayvaolamviec) {
		this.ngayvaolamviec = ngayvaolamviec;
	}
	public Date getNgaysinh() {
		return ngaysinh;
	}
	public void setNgaysinh(Date ngaysinh) {
		this.ngaysinh = ngaysinh;
	}
	public PhongBan getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(PhongBan phongBan) {
		this.phongBan = phongBan;
	}
	public NhanVien(String maNhanVien, String tenNhanVien, Date ngayvaolamviec, Date ngaysinh) {
		this.maNhanVien = maNhanVien;
		this.tenNhanVien = tenNhanVien;
		this.ngayvaolamviec = ngayvaolamviec;
		this.ngaysinh = ngaysinh;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.tenNhanVien;
	}

}
