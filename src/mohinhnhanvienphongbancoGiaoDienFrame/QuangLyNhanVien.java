package mohinhnhanvienphongbancoGiaoDienFrame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

//import javafx.scene.layout.Border;

public class QuangLyNhanVien extends javax.swing.JFrame {
	private static final long serialVersionUID = 1L;
	JComboBox<PhongBan> jComboBoxphongban;// liệt kê tên các phòng ban
	JList<NhanVien>listNV; // là cái danh sách nhân viên của phòng ban được chọn
	JTextField textFieldMa,textFieldTen,textFieldNgayVaoLam,textFieldNamSinh,textFieldmaPB,textFieldtenPB, thongbao;// là cái để mình điền và thông tin bạn cần
	JButton buttonLuu,buttonXoa,buttonThoat,buttonthemPB,buttonthemNV,buttonxoaPB;// là các sự kiện
	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("dd/MM/yyyy");
	NhanVien nv=null;
	PhongBan pb=null;
	ArrayList<PhongBan>dSPhongBans;// danh sách các phòng ban
	//ArrayList<NhanVien>dSNhanViens;
	public QuangLyNhanVien(String title) {
		super(title);
		addcontainer();
		addEvents();
		fekedata();
	}
	private void fekedata() {
		dSPhongBans=new ArrayList<>();
				
//				PhongBan kt=new PhongBan();
//				kt.setMaPhongBan("kt");
//				kt.setTenPhongBan("Phòng kế toán");
//				kt.themNhanVien(new NhanVien("NV4", "nguyễn thái quyên", new Date(2017-1900,1,1), new  Date(1997-1900,1, 1)));
//				kt.themNhanVien(new NhanVien("NV5", "vổ đức hùng sơn", new Date(2018-1900,1,1), new  Date(1998-1900,1, 1)));
//				dSPhongBans.add(kt);
//		
//				PhongBan kh=new PhongBan();
//				kh.setMaPhongBan("kh");
//				kh.setTenPhongBan("Phòng kế hoạch");
//				kh.themNhanVien(new NhanVien("NV6","nguyễn đình hân", new Date(2019-1900,1,1), new  Date(1998-1900,1, 1)));
//				dSPhongBans.add(kh);
//		
//				PhongBan phtnv=new PhongBan();
//				phtnv.setMaPhongBan("phtnv");
//				phtnv.setTenPhongBan("Phòng hợp tác nhân viên");
//				phtnv.themNhanVien(new NhanVien("NV1", "trương hùng anh", new Date(2014-1900,1,1), new  Date(1990-1900,5, 25)));
//				phtnv.themNhanVien(new NhanVien("NV2", "đổ thị minh  thúy", new Date(2015-1900,1,1), new  Date(1998-1900,5, 17)));
//				phtnv.themNhanVien(new NhanVien("NV3", "dương Huỳnh quang", new Date(2016-1900,1,1), new  Date(1996-1900,1, 1)));
//				dSPhongBans.add(phtnv);
		dSPhongBans=DocluuFile.docfile("giaodien.txt");
		for(PhongBan pb : dSPhongBans) {
			jComboBoxphongban.addItem(pb);
		}
	}
	
	// hàm giao diện
	public void addcontainer() {
		Container container=getContentPane();
		JPanel jPanelmain=new JPanel();
		jPanelmain.setLayout(new BoxLayout(jPanelmain, BoxLayout.Y_AXIS));

		JPanel jPanelphongban=new JPanel();
		jPanelphongban.setLayout(new FlowLayout());
		JLabel jLabelphongban=new JLabel("phòng ban :");
		jComboBoxphongban=new JComboBox<>();
		jComboBoxphongban.setPreferredSize(new Dimension(200, 25));
		jPanelphongban.add(jLabelphongban);
		jPanelphongban.add(jComboBoxphongban);
		jPanelmain.add(jPanelphongban);

		JPanel jPanelthemPB=new JPanel();
		jPanelthemPB.setLayout(new FlowLayout());
		JLabel jpJLabelmaPB=new JLabel("mã PB");
		textFieldmaPB=new JTextField(10);
		jPanelthemPB.add(jpJLabelmaPB);
		jPanelthemPB.add(textFieldmaPB);
		JLabel jLabelthemPB=new JLabel("tên PB:");
		textFieldtenPB=new JTextField(20);
		buttonthemPB=new JButton("thêm Pb");
		jPanelthemPB.add(jLabelthemPB);
		jPanelthemPB.add(textFieldtenPB);
		jPanelthemPB.add(buttonthemPB);
		buttonxoaPB=new JButton("xóa PB");
		jPanelthemPB.add(buttonxoaPB);
		javax.swing.border.Border borderthemPB=BorderFactory.createLineBorder(Color.BLACK);
		TitledBorder titledBorderthemPB=new TitledBorder(borderthemPB,"thêm phòng ban");
		jPanelthemPB.setBorder(titledBorderthemPB);
		jPanelmain.add(jPanelthemPB);

		JPanel jPanelDanhSachvathitiet=new JPanel();
		jPanelDanhSachvathitiet.setLayout(new GridLayout(1, 2));
		JPanel jPanelDanhSach=new JPanel();
		jPanelDanhSach.setLayout(new BorderLayout());
		listNV=new JList<>();
		JScrollPane  jScrollPaneDS=new JScrollPane(listNV,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS , //vertical : theo chiều dọc, scrollbar : thanh
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);// horizontal : ngang
		jPanelDanhSach.add(jScrollPaneDS, BorderLayout.CENTER);
		javax.swing.border.Border borderdanhsach=BorderFactory.createLineBorder(Color.blue);
		TitledBorder titledBorderDS=new TitledBorder(borderdanhsach, "danh sách");
		titledBorderDS.setTitleJustification(TitledBorder.CENTER);
		titledBorderDS.setTitleColor(Color.red);
		jPanelDanhSach.setBorder(titledBorderDS);
		jPanelDanhSachvathitiet.add(jPanelDanhSach);

		JPanel jPanelchitiet=new JPanel();
		jPanelchitiet.setLayout(new BoxLayout(jPanelchitiet, BoxLayout.Y_AXIS));

		JPanel jPanelma=new JPanel();
		jPanelma.setLayout(new FlowLayout());
		JLabel jLabelma=new JLabel("Mã :");
		textFieldMa=new JTextField(20);
		jPanelma.add(jLabelma);
		jPanelma.add(textFieldMa);
		jPanelchitiet.add(jPanelma);

		JPanel jPanelten=new JPanel();
		jPanelten.setLayout(new FlowLayout());
		JLabel jLabelten=new JLabel("tên :");
		textFieldTen=new JTextField(20);
		jPanelten.add(jLabelten);
		jPanelten.add(textFieldTen);
		jPanelchitiet.add(jPanelten);

		JPanel jPanelNgayvaolamviec=new JPanel();
		jPanelNgayvaolamviec.setLayout(new FlowLayout());
		JLabel jLabelNGLV=new JLabel("ngày làm :");
		textFieldNgayVaoLam=new JTextField(20);
		jPanelNgayvaolamviec.add(jLabelNGLV);
		jPanelNgayvaolamviec.add(textFieldNgayVaoLam);
		jPanelchitiet.add(jPanelNgayvaolamviec);

		JPanel jPanelNgaysinh=new JPanel();
		jPanelNgaysinh.setLayout(new FlowLayout());
		JLabel jLabelNgaysinh=new JLabel("năm sinh :");
		textFieldNamSinh=new JTextField(20);
		jPanelNgaysinh.add(jLabelNgaysinh);
		jPanelNgaysinh.add(textFieldNamSinh);
		jPanelchitiet.add(jPanelNgaysinh);

		jLabelma.setPreferredSize(jLabelNgaysinh.getPreferredSize());
		jLabelten.setPreferredSize(jLabelNgaysinh.getPreferredSize());
		jLabelNGLV.setPreferredSize(jLabelNgaysinh.getPreferredSize());

		javax.swing.border.Border borderchitiet=BorderFactory.createLineBorder(Color.green);
		TitledBorder titledBorderchitiet=new TitledBorder(borderchitiet, "thông tin chi tiết");
		titledBorderchitiet.setTitleColor(Color.blue);
		titledBorderchitiet.setTitleJustification(TitledBorder.CENTER);
		jPanelchitiet.setBorder(titledBorderchitiet);
		jPanelDanhSachvathitiet.add(jPanelchitiet);
		jPanelmain.add(jPanelDanhSachvathitiet);

		JPanel jPanelbutton=new JPanel();
		jPanelbutton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		JLabel jLabelthongbao= new JLabel("thông bao");
		jPanelbutton.add(jLabelthongbao);
		thongbao=new JTextField(20);
		jPanelbutton.add(thongbao);
		
		buttonthemNV =new JButton("thêm nhân viên");
		buttonLuu=new JButton("lưu");
		buttonXoa=new JButton("Xóa");
		buttonThoat=new  JButton("thoát");
		jPanelbutton.add(buttonthemNV);
		jPanelbutton.add(buttonLuu);
		jPanelbutton.add(buttonXoa);
		jPanelbutton.add(buttonThoat);
		javax.swing.border.Border borderbutton=BorderFactory.createLineBorder(Color.CYAN);
		TitledBorder titledBorderbutton=new TitledBorder(borderbutton, "các chức năng");
		titledBorderbutton.setTitleColor(Color.green);
		titledBorderbutton.setTitleJustification(TitledBorder.CENTER);
		jPanelbutton.setBorder(titledBorderbutton);
		jPanelmain.add(jPanelbutton);

		container.add(jPanelmain);
	}
	
	// hàm sự kiện
	public void addEvents() {
		
		// khi kích vào thì hiện ra tên danh sách phòng ban
		jComboBoxphongban.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (jComboBoxphongban.getSelectedIndex()==-1) {
					return;
				}
				pb=(PhongBan) jComboBoxphongban.getSelectedItem();// là phòng ban khi kích vào
				textFieldmaPB.setText(pb.getMaPhongBan());
				textFieldtenPB.setText(pb.getTenPhongBan());
				listNV.setListData(pb.getDsNhanViens());// lấy cái danh sách phòng ban đó gán cho cái danh sách nhân viên 
			}
		});
		// kích vào cái danh sách cái 1 nhân viên cần xem thì nó hiện ra chi tiết của nhân viên đó
		listNV.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent arg0) {

			}

			@Override
			public void mouseExited(MouseEvent arg0) {

			}

			@Override
			public void mouseEntered(MouseEvent arg0) {


			}

			@Override
			public void mouseClicked(MouseEvent arg0) {
				if (listNV.getSelectedIndex()==-1) {
					return;
				}
				nv=listNV.getSelectedValue();// lấy cái nhân viên khi kích vào 
				textFieldMa.setText(nv.getMaNhanVien());
				textFieldTen.setText(nv.getTenNhanVien());
				textFieldNgayVaoLam.setText(simpleDateFormat.format(nv.getNgayvaolamviec()));
				textFieldNamSinh.setText(simpleDateFormat.format(nv.getNgaysinh()));
			}
		});
		// thoát khỏi giao diện
		buttonThoat.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		// xóa 1 nhân viên được chọn
		buttonXoa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (nv!=null) {
					pb.getDsNhanViens().remove(nv);//xóa khỏi phòng ban
					nv=null;// cho cái nhân viên  được chọn = null
					listNV.setListData(pb.getDsNhanViens());// điều chỉ lại cái danh sách nhân viên của phòng ban đó
					thongbao.setText("đã xóa thành công nhân viên");
				}
			}
		});
		buttonLuu.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				try {
					
					boolean kt=DocluuFile.luu(dSPhongBans,"giaodien.txt");
					if (kt) {
						thongbao.setText("đã lưu thành công");
					} else {
						thongbao.setText("đã lưu thất bại");
					}
				} catch (Exception e) {
					// TODO: handle exception
				}

			}
		});
		buttonthemPB.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				String ma=textFieldmaPB.getText();
				if (ktmaPB(ma)) {
					thongbao.setText("mã bị trùng");
				} else {
					String ten=textFieldtenPB.getText();
					if (ten.equals("")||ma.equals("")) {
						thongbao.setText("dữ liệu không đủ");
					} else {
						PhongBan phongBanmoi=new PhongBan();
						phongBanmoi.setMaPhongBan(ma);
						phongBanmoi.setTenPhongBan(ten);
						dSPhongBans.add(phongBanmoi);
						jComboBoxphongban.addItem(phongBanmoi);	
						thongbao.setText("đa thêm thành công phòng ban");
					}

				}
			}

			private boolean ktmaPB(String ma) {
				for (int i = 0; i < dSPhongBans.size(); i++) {
					if (ma.equals(dSPhongBans.get(i).getMaPhongBan())) {
						return true;
					}
				}
				return false;
			}
		});
		buttonthemNV.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				NhanVien nv;
				try {
					if (ktmaNV(textFieldMa.getText())) {
						thongbao.setText("mà nhân viên bị trùng");
					} else {
						nv = new NhanVien(
								textFieldMa.getText(),
								textFieldTen.getText(), 
								simpleDateFormat.parse(textFieldNgayVaoLam.getText()),
								simpleDateFormat.parse(textFieldNamSinh.getText()));
						if (pb!=null) {
							pb.themNhanVien(nv);
							listNV.setListData(pb.getDsNhanViens());
							thongbao.setText("thêm thành công");
						}else {
							thongbao.setText("do chưa chọn phòng ban");
						}
					}
					
				} catch (Exception e1) {
					thongbao.setText("dữ liệu bị sai");
				}
				
			}

			private boolean ktmaNV(String ma) {
				for (int i = 0; i < dSPhongBans.size(); i++) {
					if(dSPhongBans.get(i).ktmaNV(ma)) {
						return true;
					}
				}
				return false;
			}
		});
		
		buttonxoaPB.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if (pb!=null) {
					for (int i = 0; i < dSPhongBans.size(); i++) {
						jComboBoxphongban.removeItem(dSPhongBans.get(i));
					}
					dSPhongBans.remove(pb);
						for(PhongBan pb : dSPhongBans) {
						jComboBoxphongban.addItem(pb);
					}
					thongbao.setText("đã xóa thành công");
				}
				else {
					thongbao.setText("xóa thất bại vì chưa chọn phòng ban nao ;");
				}
			}
		});
	}
	public void showWindow() {
		this.setSize(650, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
