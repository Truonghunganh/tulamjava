package giaodienJframe;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Giaodien extends JFrame {
	public Giaodien(String tentieude) {
		this.setTitle(tentieude);// tên tiêu đề
		Container container=getContentPane();// lấy cái lớp chứa cái cửa sổ ra
		JPanel control=new JPanel();// tạo cái lớp chứa control(  điều khiển )
		control.setBackground(Color.blue);//tạo hình nền 
		JButton jButton=new JButton("haha");
		control.add(jButton);
		container.add(control);// đưa  lên giao diện 
		this.setSize(500, 400);// set chiều rộng và chiều cao
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);//cho phép nhấn vào dấu chéo để tắt
		this.setLocationRelativeTo(null);//mật định cái màng hình nằm giữa destop
		this.setResizable(false);//không thể thây đổi kích thước của màn hình
		this.setVisible(true);// hiển thị nó ra màn hình destop( bắt buộc phải có)
	}

}
