package luyentap76nhanvien;

import java.io.Serializable;

//staff member : thành viên đội ngủ nhân viên
@SuppressWarnings("serial")
public abstract class StaffMember implements Serializable{
	protected String name;
	protected String address;
	protected String phone;
	protected String masonhanvien ;
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return"tên : "+ getName()+" ; địa chỉ : "+address+" ; SĐT : "+phone+" ; mã số nhân viên :" +masonhanvien+" ; ";
	}
	
	public String getMasonhanvien() {
		return masonhanvien;
	}
	public void setMasonhanvien(String masonhanvien) {
		this.masonhanvien = masonhanvien;
	}
	public abstract double pay();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public StaffMember() {
		super();
	}
	public StaffMember(String name, String address, String phone,String msnv) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.masonhanvien=msnv;
	}
	public int maphanloai() {
		return 1;
	}
                 
}
