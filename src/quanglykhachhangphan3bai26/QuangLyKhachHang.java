package quanglykhachhangphan3bai26;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
// borderLayout() dùng trong :JTree,JtextArea ,JTable
public class QuangLyKhachHang extends JFrame{
	private static final long serialVersionUID = 1L;
	JTree jTree;//  là cái cây
	DefaultMutableTreeNode defaultMutableTreeNode;// là cái mục của cây

	JTable jTableNhungKH;// là chứa cái bảng
	DefaultTableModel defaultTableModelNhungKH;// cái ni để chứa  dữ liệu

	JTextField jTextFieldCode,jTextFieldName,jTextFieldPhone,jTextFieldEmail;// để hiện và nhập dữ liệu

	JButton jButtonthem,jButtonxoa;// cái nút

	ArrayList<NhomKhachHang> DSnhomkhachhang;//các nhóm

	NhomKhachHang nhomKhachHang;// 1 nhóm
	public QuangLyKhachHang(String tieude) {
		super(tieude);
		addcontrols();
		addEvent();
	}
	private void addcontrols() {
		// container : thùng đựng hành
		// pane : khung
		// horizontal : ngang
		// split : chia
		// vertical : theo chiều dọc
		// sơ khai về giao diện
		Container container=getContentPane();
		JPanel jPaneltrai=new JPanel();
		jPaneltrai.setPreferredSize(new Dimension(200,0));
		JPanel jPanelphai=new JPanel();
		jPanelphai.setLayout(new BorderLayout());
		JSplitPane jSplitPanemain=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jPaneltrai,jPanelphai);
		container.add(jSplitPanemain);
		JPanel jPanelphai1=new JPanel();
		jPanelphai1.setPreferredSize(new Dimension(0,200));
		JPanel jPanelphai2=new JPanel();
		JSplitPane jSplitPanemain1=new JSplitPane(JSplitPane.VERTICAL_SPLIT,jPanelphai1,jPanelphai2);
		jPanelphai.add(jSplitPanemain1);
		// node : nút
		// default : mật định
		// mutable : biến đổi 
		// scroll : cuộn
		// layout : bố trí
		// border : biên giới
		// scrollbar : thanh cuộn
		jPaneltrai.setLayout(new BorderLayout());
		defaultMutableTreeNode=new DefaultMutableTreeNode("công ty");//là cái cây
		jTree=new JTree(defaultMutableTreeNode);// là  nơi chứa cái cây đó
		// đây là  cái hộp để chứa cái cây
		JScrollPane jScrollPanetrai=new JScrollPane(
				jTree,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jPaneltrai.add(jScrollPanetrai,BorderLayout.CENTER);// nơi chứa cái hộp
		
		// là nơi chứa dữ liệu
		jPanelphai1.setLayout(new BorderLayout());
		defaultTableModelNhungKH=new DefaultTableModel();
		defaultTableModelNhungKH.addColumn("mã khách hàng");
		defaultTableModelNhungKH.addColumn("tên khách hàng");
		defaultTableModelNhungKH.addColumn("số điện thoại");
		defaultTableModelNhungKH.addColumn("email");
		jTableNhungKH=new JTable(defaultTableModelNhungKH);//là 1 cái bảng chứa các hàng và các cột
		JScrollPane jScrollPanePhai1=new JScrollPane(jTableNhungKH,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);// cái hộp chứa cái bảng đó

		jPanelphai1.add(jScrollPanePhai1,BorderLayout.CENTER);// cho cái hộp đó vào giao diện

		// là nơi chứa cái để nhập dữ liệu và   cái nút
		jPanelphai2.setLayout(new BoxLayout(jPanelphai2,BoxLayout.Y_AXIS));
		JPanel jPanelCode=new JPanel();
		JLabel jLabelCode=new JLabel("mã khách hàng :");
		jPanelCode.add(jLabelCode);
		jTextFieldCode=new JTextField(20);
		jPanelCode.add(jTextFieldCode);
		jPanelphai2.add(jPanelCode);

		JPanel jPanelName=new JPanel();
		JLabel jLabelName=new JLabel("tên khách hàng :");
		jPanelName.add(jLabelName);
		jTextFieldName=new JTextField(20);
		jPanelName.add(jTextFieldName);
		jPanelphai2.add(jPanelName);

		JPanel jPanelPhone=new JPanel();
		JLabel jLabelPhone=new JLabel("SĐT khách hàng :");
		jPanelPhone.add(jLabelPhone);
		jTextFieldPhone=new JTextField(20);
		jPanelPhone.add(jTextFieldPhone);
		jPanelphai2.add(jPanelPhone);

		JPanel jPanelEmail=new JPanel();
		JLabel jLabelEmail=new JLabel("email khách hàng :");
		jPanelEmail.add(jLabelEmail);
		jTextFieldEmail=new JTextField(20);
		jPanelEmail.add(jTextFieldEmail);
		jPanelphai2.add(jPanelEmail);

		jLabelCode.setPreferredSize(jLabelEmail.getPreferredSize());
		jLabelName.setPreferredSize(jLabelEmail.getPreferredSize());
		jLabelPhone.setPreferredSize(jLabelEmail.getPreferredSize());

		JPanel jPanelbutton=new JPanel();
		jButtonthem=new JButton("thêm");
		jPanelbutton.add(jButtonthem);
		jButtonxoa=new JButton("xóa");
		jPanelbutton.add(jButtonxoa);
		jPanelphai2.add(jPanelbutton);
		fakeData();// dữ liệu giả định
	}
	protected void hiendanhkhachhangtheonhom() {
		defaultTableModelNhungKH.setRowCount(0);//xóa tắt cả dữ liệu đi
		// hiên cái danh sách khách hàng ở nhóm đó
		for(KhachHang khachHang:nhomKhachHang.getdSkhcuanhomdo()) {
			defaultTableModelNhungKH.addRow(new String[]{khachHang.getCode(),khachHang.getName(),khachHang.getPhone(),khachHang.getEmail()});
		}		
	}
	private void addEvent() {
		// khi kích chuột vào 1 cái mục trên cái cây
		jTree.addMouseListener(new MouseListener() {

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
				// đây là cái cây được chọn
				 defaultMutableTreeNode=(DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();// lấy cái mục được chọn
				jTextFieldCode.setText(defaultMutableTreeNode.getUserObject()+"");// cái giá trị của node
				jTextFieldPhone.setText(defaultMutableTreeNode.getLevel()+"");// số bật của cái cây
				if (defaultMutableTreeNode!=null&& defaultMutableTreeNode.getLevel()==1) {// là cái nhóm khách hàng (=1)
					nhomKhachHang=(NhomKhachHang) defaultMutableTreeNode.getUserObject();//lấy cái nhóm khách hàng
					hiendanhkhachhangtheonhom();// hiện nó ra

				}
			}
		});
		// khi kích   vào 1 khách hàng
		jTableNhungKH.addMouseListener(new MouseListener() {
			
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
				int KHduocchon=jTableNhungKH.getSelectedRow();// lấy cái hàng được chọn
				if (KHduocchon==-1) {// nếu không được chọn thì  không  làm gì cả
					return;
				}
				// nếu được chọn thì hiện các hàng đó lên
				jTextFieldCode.setText(jTableNhungKH.getValueAt(KHduocchon, 0)+"");
				jTextFieldName.setText(jTableNhungKH.getValueAt(KHduocchon, 1)+"");
				jTextFieldPhone.setText(jTableNhungKH.getValueAt(KHduocchon, 2)+"");
				jTextFieldEmail.setText(jTableNhungKH.getValueAt(KHduocchon, 3)+"");
			}
		});
		jButtonthem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				KhachHang khachHang=new KhachHang(jTextFieldCode.getText(), jTextFieldName.getText(), jTextFieldPhone.getText(), jTextFieldEmail.getText());
				// tìm ra cái nhóm để thêm vào danh sách 
				int sonhomduocchon=sonhomduocchon();
				if (sonhomduocchon!=-1) {
					DSnhomkhachhang.get(sonhomduocchon).addKhachHang(khachHang);
					//nhomKhachHang.addKhachHang(khachHang);
				}
				// thêm khách hàng vao cái cây
				if (defaultMutableTreeNode!=null||defaultMutableTreeNode.getLevel()==1) {
					DefaultMutableTreeNode defaultMutableTreeNode1=new DefaultMutableTreeNode(khachHang);
					defaultMutableTreeNode.add(defaultMutableTreeNode1);
					// thêm khách hàng vào bảng
					defaultTableModelNhungKH.setRowCount(0);
					for(KhachHang kHang : nhomKhachHang.getdSkhcuanhomdo()) {
						defaultTableModelNhungKH.addRow(new String[] {kHang.getCode(),kHang.getName(),kHang.getPhone(),kHang.getEmail()});
					}
				}
				
			}
		});

	}

	protected int sonhomduocchon() {
		for (int i = 0; i <DSnhomkhachhang.size(); i++) {
			if (DSnhomkhachhang.get(i).getCode().equals(nhomKhachHang.getCode())) {
				return i;
			}
		}
		return -1;
	}
	// fake : giả mạo
	protected void fakeData() {
		DSnhomkhachhang =new ArrayList<NhomKhachHang>();
		NhomKhachHang  nhomKhachHangtiennang=new NhomKhachHang("nh1", "khách hàng tiềm năng");
		DSnhomkhachhang.add(nhomKhachHangtiennang);
		nhomKhachHangtiennang.addKhachHang(new KhachHang("001", "trương Hùng anh", "0796234625", "hunganh250590@gmail.com"));
		nhomKhachHangtiennang.addKhachHang(new KhachHang("002", "dương Huỳnh quang", "0796234625", "quang250590@gmail.com"));
		nhomKhachHangtiennang.addKhachHang(new KhachHang("003", " nguyễn hoàng", "0796234625", "Hoang250590@gmail.com"));

		NhomKhachHang  nhomKhachHangVit=new NhomKhachHang("nh2", "khách hàng Vit");
		DSnhomkhachhang.add(nhomKhachHangVit);
		nhomKhachHangVit.addKhachHang(new KhachHang("004", "vỏ đức hùng sơn", "0796234625", "son250590@gmail.com"));

		NhomKhachHang  nhomKhachHangkhotinh=new NhomKhachHang("nh3", "khách hàng khó tính");
		DSnhomkhachhang.add(nhomKhachHangkhotinh);
		for(NhomKhachHang nhomKhachHang :DSnhomkhachhang) {
			DefaultMutableTreeNode defaultMutableTreeNode1=new DefaultMutableTreeNode(nhomKhachHang);
			defaultMutableTreeNode.add(defaultMutableTreeNode1);
			for (int i = 0; i < nhomKhachHang.getdSkhcuanhomdo().size(); i++) {
				DefaultMutableTreeNode defaultMutableTreeNode2=new DefaultMutableTreeNode(
						nhomKhachHang.getdSkhcuanhomdo().get(i));
				defaultMutableTreeNode1.add(defaultMutableTreeNode2);

			}
		}
	}

	public void showWindow() {
		this.setSize(800,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
