package TinhDahinh;



import hoccaicuaquang.ngaythangnam;

public class testDaHinh {

	public static void main(String[] args) { 
		HinhHoc hinhHoc;
		hinhHoc=new HinhChuNhat(5, 7);
		System.out.println("chuviHinh chữ nhật ="+hinhHoc.tinhChuVi());
		System.out.println("dien tich Hinh chữ nhật ="+hinhHoc.tinhDienTich());
		hinhHoc=new	HInhVuong(6);
		System.out.println("chuviHinh vuông ="+hinhHoc.tinhChuVi());
		System.out.println("dien tich Hinh vuông ="+hinhHoc.tinhDienTich());
        nhanvien ns;
        ns=new KiSuCauNoi();
        ns.bannoigi();
        ns=new thoivu();
        ns.bannoigi();
	}

}
