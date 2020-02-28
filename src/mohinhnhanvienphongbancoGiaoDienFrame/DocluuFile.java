package mohinhnhanvienphongbancoGiaoDienFrame;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DocluuFile {
	public static boolean luu(ArrayList<PhongBan>dspb,String tenfile) {
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(tenfile);
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(dspb);
			objectOutputStream.close();
			fileOutputStream.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}
	@SuppressWarnings("unchecked")
	public static ArrayList<PhongBan> docfile(String tenfile ) {
		ArrayList<PhongBan>dspb=new ArrayList<>();
		try {
			FileInputStream fileInputStream=new FileInputStream(tenfile);
			ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
			Object data=objectInputStream.readObject();
			dspb=(ArrayList<PhongBan>) data;
			objectInputStream.close();
			fileInputStream.close();
			return dspb;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return dspb;
	}
}
