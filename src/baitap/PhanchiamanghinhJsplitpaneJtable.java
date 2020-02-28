package baitap;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class PhanchiamanghinhJsplitpaneJtable extends JFrame {

	DefaultTableModel defaultTableModel;
	JTable  jTable;
	public  void tieude(String tieude,ArrayList<SinhVien> SV) {
		this.setTitle(tieude);
		giaodien(SV);
		hoatdong();
		hiienlenmanghinh();
	}
	public void giaodien(ArrayList<SinhVien> SV) {
		Container container=getContentPane();//container : thùng đựng hàng, content : nội dung, Pane : khung
		JPanel phai=new JPanel();
		phai.setLayout(new BorderLayout());
		
		JPanel trai=new JPanel();//panel : bảng điều khiển , bảng danh sách 
		trai.setPreferredSize(new Dimension(200, 0));//dimension : kích thước , preferred : ưa thích
		JSplitPane main=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, trai, phai);// horizontal : ngang; split : chia
		main.setOneTouchExpandable(true);// cái dấu đi qua đi lại
		container.add(main);
		
		JPanel trencuaphai=new JPanel();
		trencuaphai.setPreferredSize(new Dimension(0, 100));
		JPanel duoicuaphai=new JPanel();
		duoicuaphai.setLayout(new BorderLayout());
		JSplitPane phai00=new JSplitPane(JSplitPane.VERTICAL_SPLIT,trencuaphai ,duoicuaphai);
		phai00.setOneTouchExpandable(true);
		phai.add(phai00);
		
		defaultTableModel=new DefaultTableModel();
		defaultTableModel.addColumn("mã");
		defaultTableModel.addColumn("tên");
		defaultTableModel.addColumn("tuổi");
		defaultTableModel.addColumn("địa chỉ");
		String sv1[]= {"sv1","trương hùng anh","29","điện phước"};
		defaultTableModel.addRow(sv1);
		for (int i = 0; i < SV.size(); i++) {
		defaultTableModel.addRow(SV.get(i).sv());
		}
		jTable=new JTable(defaultTableModel);
		JScrollPane sctable=new JScrollPane(
				jTable,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		duoicuaphai.add(sctable);
	
	}
	public void hoatdong() {
		
	}
	public void hiienlenmanghinh() {
		this.setSize(700, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setVisible(true);
	}
}
