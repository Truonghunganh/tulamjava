package giaodienJframe;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.MenuBar;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.filechooser.FileFilter;

import org.w3c.dom.Text;

import hoccaicuaquang.ngaythangnam;

public class HocJoptionPanevaJFileChooserbai25phan3 extends JFrame{
	private static final long serialVersionUID = 1L;
	JMenuBar jMenuBar;
	JMenu jMenuhethong;
	JMenuItem jMenuItemsave;
	JMenuItem jMenuItemOpen;
	JMenuItem jMenuItemexit;
	// item : mục
	//area : khu vực 
	javax.swing.JTextArea jTextAreaData;// cái để chứa dữ liệu lớn
	// chooser : người chọn
	JFileChooser jFileChooser;// là cái  loại file được chọn như .docx hay .txt hay ............
	public HocJoptionPanevaJFileChooserbai25phan3(String tieude) {
		super(tieude);
		addControls();
		addEvent();

	}
	private void addEvent() {
		// khi chọn thoát giao diện
		jMenuItemexit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				xulithoat();

			}
		});
		// khi chọn mở file mới
		jMenuItemOpen.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				xulyOpenFile();
			}
		});
		// khi chọn lưu file lại 
		jMenuItemsave.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				xulysaveFile();
			}
		});
		// phân chia cái loại file
		jFileChooser.setFileFilter(new FileFilter() {

			@Override
			public String getDescription() {
				return "Text .txt";// là cái để hiện lên màng hình
			}

			@Override
			public boolean accept(File f) {
				return f.getAbsolutePath().endsWith(".txt");// là cái loại file tương ứng với cái ở trên
			}
		});
		jFileChooser.setFileFilter(new FileFilter() {

			@Override
			public String getDescription() {
				return "Word 2003,2007,2010,2013";
			}

			@Override
			public boolean accept(File f) {
				// TODO Auto-generated method stub
				return f.getAbsolutePath().endsWith(".doc")||f.getAbsolutePath().endsWith(".docx");
			}
		});

	}
	protected void xulysaveFile() {
		// dialog : hộp thoại 
		// approve : phê duyện , xác nhận ( áp phưu )
		// option : lựa chọn
		// message : thông điệp ( mét sịt )
		if (jFileChooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION) {// null : nghĩa là hiện cái cửa sổ được chọn nằm ở giữa màn hình
			String data=jTextAreaData.getText();//lấy cái dữ liệu trong cái jtextarea
			try {
				FileOutputStream fileOutputStream=new FileOutputStream(jFileChooser.getSelectedFile());// tạo đường dẫn
				OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream);// tạo cái để ghi vào 
				outputStreamWriter.write(data);// ghi cái dữ liệu vào cái file đó
				outputStreamWriter.close();// đóng nó lại
				fileOutputStream.close();// đóng 
				JOptionPane.showMessageDialog(null, "lưu  thành công");// nếu lưu  thành công thì xuất ra cho họ biết
			} catch (Exception e) {

			}
		}
	}
	protected void xulyOpenFile() {
		
		if (jFileChooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION) {// mở cái hộp thoại mở file lên 
			try {
				// stream : suối , sông
				
				File File=jFileChooser.getSelectedFile();// lấy cái file được chọn
				FileInputStream fileInputStream=new FileInputStream(File);// đưa cái file đó vào cái đường dẫn ghi fle
				InputStreamReader inputStreamReader=new InputStreamReader(fileInputStream,"UTF-8");// tạo cái lớp để đọc
				BufferedReader bufferedReader=new BufferedReader(inputStreamReader);// tạo 1 bộ  đệm 
				String line=bufferedReader.readLine();//  lấy 1 dòng ra 
				StringBuilder stringBuilder=new StringBuilder();// tạo cái để chứa dữ liệu
				while (line!=null) {
					stringBuilder.append(line+"\n");// thêm dữ liệu vào 
					line=bufferedReader.readLine();// đọc  dòng tiệp theo
				}		
				bufferedReader.close();// tắc cái lớp buferedreader
				jTextAreaData.setText(stringBuilder.toString());// hiện cái dữ liệu trên file vào Jtextarea
			} catch (Exception e) {
			}

		}
	}
	//Option : lựa chọn 
	// pane : khung
	// show : chỉ 
	// confirm : xác nhận ( cừng phưm )
	// dialog : hộp thoại
	protected void xulithoat() {
		int ret=JOptionPane.showConfirmDialog(null, 
				"bạn có muốn thoát hay không ?",// cái để hiện trên giao diện 
				"Xác nhận thoát",// cái tiêu  đề trên giao diện 
				JOptionPane.YES_NO_OPTION);//
		if (ret == JOptionPane.YES_NO_OPTION) {// nếu bấm "yes" thì tắc
			System.exit(0);
		}
	}
	private void addControls() {
		jFileChooser=new JFileChooser();


		menu();
		Container container=getContentPane();
		container.setLayout(new BorderLayout());// đặt nó có hướng
		jTextAreaData=new JTextArea();// khởi tạo
		jTextAreaData.setLineWrap(true);// xuống dòng
		jTextAreaData.setWrapStyleWord(true);// nguyên từ là xuống dòng
		JScrollPane jScrollPanechuadata=new JScrollPane(// tao ra cái hộp đựng 
				jTextAreaData,// bỏ cái chứa dữ liệu vô
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		container.add(jScrollPanechuadata,BorderLayout.CENTER);//bỏ cái hộp đó vào ở giữa giao diện
	}
	private void menu() {
		jMenuBar=new JMenuBar();
		setJMenuBar(jMenuBar);

		jMenuhethong=new JMenu("hệ thống");
		jMenuBar.add(jMenuhethong);
		jMenuItemsave=new JMenuItem("Save");
		jMenuhethong.add(jMenuItemsave);
		jMenuhethong.addSeparator();
		jMenuItemOpen=new JMenuItem("Open");
		jMenuhethong.add(jMenuItemOpen);
		jMenuhethong.addSeparator();
		jMenuItemexit=new JMenuItem("Exit");
		jMenuhethong.add(jMenuItemexit);



	}
	public void Showwindow() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		HocJoptionPanevaJFileChooserbai25phan3 hocJoptionPanevaJFileChooserbai25phan3=new HocJoptionPanevaJFileChooserbai25phan3("hoc JoptionPanevaJFileChooser");
		hocJoptionPanevaJFileChooserbai25phan3.Showwindow();
	}

}
