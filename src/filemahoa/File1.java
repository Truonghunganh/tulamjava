package filemahoa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class File1 {
	public static boolean Luufile1(ArrayList<KhachHang>dsKhachHangs,String duongdanfile) {
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(duongdanfile);
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(dsKhachHangs);
			objectOutputStream.close();
			fileOutputStream.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
    @SuppressWarnings("unchecked")
	public static ArrayList<KhachHang> docfile1 (String duongdanfile) {
    	ArrayList<KhachHang>dsKhachHangs=new ArrayList<>();
		try {
			FileInputStream fileInputStream=new FileInputStream(duongdanfile);
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			Object data=objectInputStream.readObject();
			dsKhachHangs=(ArrayList<KhachHang>) data;
			objectInputStream.close();
			fileInputStream.close();
		} catch (Exception e) {
		    e.printStackTrace();
		}
		return dsKhachHangs;
	} 
}
