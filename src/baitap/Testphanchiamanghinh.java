package baitap;

import java.util.ArrayList;

public class Testphanchiamanghinh {

	static ArrayList<SinhVien> dsSinhViens=new ArrayList<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        PhanchiamanghinhJsplitpaneJtable phanchiamanghinhJsplitpaneJtable=new PhanchiamanghinhJsplitpaneJtable();
        SinhVien sv1=new SinhVien("sv2", "dương quỳnh quang", 23, "huế");
        dsSinhViens.add(sv1);
        phanchiamanghinhJsplitpaneJtable.tieude("phân chia màng hình",dsSinhViens);
	}

}
