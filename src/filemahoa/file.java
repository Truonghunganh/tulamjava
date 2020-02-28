package filemahoa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class file {

	public static boolean luufile(Object data,String file) {
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
			objectOutputStream.writeObject(data);
			objectOutputStream.close();
			fileOutputStream.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	public static Object docfile(String file) {
		try {
			FileInputStream  fileInputStream=new FileInputStream(file);
			ObjectInputStream objectInputStream=new  ObjectInputStream(fileInputStream);
			Object data=objectInputStream.readObject();
			objectInputStream.close();
			fileInputStream.close();
			return data;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
