package quanglykhachhangphan3bai26;

public class KhachHang {
	private String code;
	private String name;
	private String phone;
	private String email;
	private NhomKhachHang nhomKhachHang;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public NhomKhachHang getNhomKhachHang() {
		return nhomKhachHang;
	}
	public void setNhomKhachHang(NhomKhachHang nhomKhachHang) {
		this.nhomKhachHang = nhomKhachHang;
	}
	public KhachHang(String code, String name, String phone, String email) {
		this.code = code;
		this.name = name;
		this.phone = phone;
		this.email = email;
	}
	@Override
	public String toString() {
		return this.name;
	}
	

}
