package giaodienJframe;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.nio.CharBuffer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Hocjsplitpanel extends JFrame implements Readable{
	private static final long serialVersionUID = 1L;
	DefaultTableModel defaultTableModel;// là cái bảng để chứa dữ liệu
	JTable jTableSinhVien;// là nơi chứa cái bảng
	JTextField jTextFieldten;
	JTextField soluongField;
	Button buttonthem, buttonxoa;
	public Hocjsplitpanel(String  tieude) {
		super(tieude);
		giaodien();
		hoatdong();
		
	}
	public static void main(String[] args) {
		Hocjsplitpanel hocjsplitpanel=new Hocjsplitpanel("học jsplitpanel");
		hocjsplitpanel.hienthi();
	}
	private void hoatdong() {
	// kích vào hàng nào đó ( dùng chuột )
	jTableSinhVien.addMouseListener(new MouseListener() {
		
		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void mouseClicked(MouseEvent e) {
			
			int row=jTableSinhVien.getSelectedRow();// số thứ tự cái hàng được chọn
			if (row==-1) {//Khi không  kịch vào nào cả 
				return;// không làm gì cả 
			}
			jTextFieldten.setText((String)jTableSinhVien.getValueAt(row, 1));// hiện cái cột tên (cột 1 ) với dòng bạn kích vào
			JOptionPane.showMessageDialog(null, "mã :"+defaultTableModel.getValueAt(row, 0)+"\n"+"tên :"+defaultTableModel.getValueAt(row, 1)+"\n"+"địa chỉ :"+defaultTableModel.getValueAt(row, 2));// hiện dữ liệu hàng đó
		}
	});
	
	// dùng bàn phím để kích vào hàng bạn chọn
	jTableSinhVien.addKeyListener(new KeyListener() {
		
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
		
		@Override
		public void keyReleased(KeyEvent e) {
			jTextFieldten.setText((String)jTableSinhVien.getValueAt(jTableSinhVien.getSelectedRow(), 1));
			
		}
		
		@Override
		public void keyPressed(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}
	});
	buttonthem.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			defaultTableModel.addRow(new String[] {"01","trương hùng anh ", "điện phước "});
				
			
		}
	});
	buttonxoa.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			int row= jTableSinhVien.getSelectedRow();// lấy cái số thứ tự hàng khi kích vào
			if (row==-1) {/// nếu không kích vào cái hàng nào thì không làm gì cả
				return;
			}
			defaultTableModel.removeRow(row);// xóa cái hàng ở vị trí đó
			}
	});
	}

	private void hienthi() {
 	      this.setSize(800, 500);
 	      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
 	      this.setVisible(true);
 	     while (true) {
 			soluongField.setText(defaultTableModel.getRowCount()+"");
 		}    
		
	}

	private void giaodien() {
		Container container=getContentPane();
		JPanel jPaneltrai=new JPanel();
		JPanel jPanelphai1=new JPanel();
		jPanelphai1.setPreferredSize(new Dimension(0,100));
		JPanel jPanelphai2=new JPanel();
		// JSplitPane :ngăn chia ( để phân chia màn hình )
		JSplitPane jSplitPanephai=new JSplitPane(JSplitPane.VERTICAL_SPLIT,jPanelphai1,jPanelphai2);
		jSplitPanephai.setOneTouchExpandable(true);
		JSplitPane jpJSplitPaneMain=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jPaneltrai,jSplitPanephai);// là cái đường thẳng lớn để duy chuyễn qua lại
		jpJSplitPaneMain.setOneTouchExpandable(true);// là cái muỗi tên nhỏ nhỏ để duy chuyển qua lại
		container.add(jpJSplitPaneMain);
			
		jPaneltrai.setPreferredSize(new Dimension(500,0));// set kích thước mật định cho nó
		
		defaultTableModel=new DefaultTableModel();// bảng là nơi chứa dữ liệu
		defaultTableModel.addColumn("mã");
		defaultTableModel.addColumn("tên");
		defaultTableModel.addColumn("địa chi");
		
		defaultTableModel.addRow(new String[] {"01","trương hùng anh ", "điện phước "});
		defaultTableModel.addRow(new String[] {"02","trương ánh diệu ", "điện phước "});
		defaultTableModel.addRow(new String[] {"03","trương phước thiện ", "điện phước "});
		
		//defaultTableModel.addColumn("số điện thoại");
		
		jTableSinhVien=new JTable(defaultTableModel);// là chưa cái bảng
		JScrollPane jScrollPaneSinhVien=new JScrollPane(// là cái hộp có cột
				jTableSinhVien,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,// VERTICAL : theo chiều dọc 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS// HORIZONTAL : theo chiều ngang
				);
		jPaneltrai.setLayout(new BorderLayout());// hết biên
		jPaneltrai.add(jScrollPaneSinhVien,BorderLayout.CENTER);// 
	
		jTextFieldten =new JTextField(20);//cái để hiện tên 
		jPanelphai1.add(jTextFieldten);
		soluongField=new JTextField(5);
		jPanelphai1.add(soluongField);
		buttonthem=new Button("thêm");
		jPanelphai1.add(buttonthem);
		buttonxoa=new Button("xoa");
		jPanelphai1.add(buttonxoa);
	}
	@Override
	public int read(CharBuffer cb) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}
}
