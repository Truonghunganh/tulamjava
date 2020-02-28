package filekhongmahoa;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

import jdk.dynalink.beans.StaticClass;

public class LuuDocFile {
	public static boolean luuafile(ArrayList<KhachHang>dskh, String duongdanfile) {
		try {
			FileOutputStream fileOutputStream=new FileOutputStream(duongdanfile);
			OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream, "UTF-8");
			BufferedWriter bufferedWriter =new BufferedWriter(outputStreamWriter);
			for(KhachHang kh:dskh) {
				String line=kh.getMa()+"  ;  "+kh.getTen()+"  ;  "+kh.getDiachi();
				bufferedWriter.write(line);
				bufferedWriter.newLine();
			}
			System.out.println("lưu file thành công ");
			bufferedWriter.close();
			outputStreamWriter.close();
			fileOutputStream.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return false;
	}
	public static ArrayList<KhachHang> docflie(String duongdanfile) {
		ArrayList<KhachHang> dskh=new ArrayList<>();
		
		try {
			FileInputStream  fileInputStream=new FileInputStream(duongdanfile);
			InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"UTF-8");
			BufferedReader bufferedReader =new BufferedReader(inputStreamReader);
			String line=bufferedReader.readLine();
			while (line!=null) {
				String []arr=line.split(";");
				if (arr.length==3) {
					KhachHang khachHang=new KhachHang(arr[0],arr[1], arr[2]);
					dskh.add(khachHang);
				}
				line=bufferedReader.readLine();
				
			}
			bufferedReader.close();
			inputStreamReader.close();
			fileInputStream.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dskh;
	}
}
