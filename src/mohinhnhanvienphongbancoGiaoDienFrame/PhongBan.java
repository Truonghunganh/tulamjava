package mohinhnhanvienphongbancoGiaoDienFrame;

import java.io.Serializable;
import java.util.Vector;

public class PhongBan implements Serializable{
	private static final long serialVersionUID = 1L;
	private String maPhongBan;
	private String tenPhongBan;
	private Vector<NhanVien>dsNhanViens;
	public String getMaPhongBan() {
		return maPhongBan;
	}
	public void themNhanVien(NhanVien nhanVien) {
		dsNhanViens.add(nhanVien);
		nhanVien.setPhongBan(this);
	}
	public void setMaPhongBan(String maPhongBan) {
		this.maPhongBan = maPhongBan;
	}
	public String getTenPhongBan() {
		return tenPhongBan;
	}
	public void setTenPhongBan(String tenPhongBan) {
		this.tenPhongBan = tenPhongBan;
	}
	public Vector<NhanVien> getDsNhanViens() {
		return dsNhanViens;
	}
	public void setDsNhanViens(Vector<NhanVien> dsNhanViens) {
		this.dsNhanViens = dsNhanViens;
	}
	public PhongBan(String maPhongBan, String tenPhongBan, Vector<NhanVien> dsNhanViens) {
		this.maPhongBan = maPhongBan;
		this.tenPhongBan = tenPhongBan;
		this.dsNhanViens = dsNhanViens;
	}
	public PhongBan() {
		this.dsNhanViens=new Vector<>();
	}
	@Override
	public String toString() {
		return this.tenPhongBan;
	}
	public boolean ktmaNV(String ma) {
		for (int i = 0; i < dsNhanViens.size(); i++) {
			if (ma.equals(dsNhanViens.get(i).getMaNhanVien())) {
				return true;
			}
		}
		return false;
	}
}
