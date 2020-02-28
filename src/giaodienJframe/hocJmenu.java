package giaodienJframe;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPopupMenu;
import javax.swing.JTabbedPane;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;


// extend : thêm ,kế thừa
public class hocJmenu extends JFrame{
	private static final long serialVersionUID = 1L;
	//menu : thực đơn
	//  bar : quán ba
	JMenuBar jMenuBar;
	
	JMenu fileJMenu;
	// item : mục
	JMenuItem newJMenuItem;
	JMenuItem saveJMenuItem;
	JMenuItem openJMenuItem;
	JMenuItem exitJMenuItem;

	JMenu editJMenu;
	JMenuItem copyJMenuItem;
	JMenuItem pasteJMenuItem;
	
	Button button1,button2,button=null;
	JMenuItem jMenuItemdo,jMenuItemxanhItem;
	// tool : công cụ
	// check : kiểm tra 
	// box : cái hộp
	JToolBar jToolBar;
	JButton jButtonlenh1,jButtonlenh2;
	JCheckBox jCheckBox;
	
	
	public hocJmenu(String tieude) {
		super(tieude);
		giaodien();
		sukien();
	}
	@SuppressWarnings("deprecation")
	private void giaodien() {
		// 1 . là cái thanh công cụ
		jMenuBar=new JMenuBar(); // là nơi chứa tất cả các nhóm trên thanh công cụ (JMenu , JMenuItem )
		setJMenuBar(jMenuBar);// hiện nó lên màn hình
		
		fileJMenu=new JMenu("File");// là 1 nhóm file chứa các chức năng
		jMenuBar.add(fileJMenu);
		newJMenuItem =new JMenuItem("New");// là 1 chức năng
		fileJMenu.add(newJMenuItem);
		// separator : dải phân cách
		fileJMenu.addSeparator();// véc ngăn
		openJMenuItem=new JMenuItem("Open");
		fileJMenu.add(openJMenuItem);
		fileJMenu.addSeparator();
		saveJMenuItem=new JMenuItem("Save");
		fileJMenu.add(saveJMenuItem);
		fileJMenu.addSeparator();
		exitJMenuItem=new JMenuItem("Exit");
		exitJMenuItem.setAccelerator(KeyStroke.getKeyStroke('Q', Toolkit.getDefaultToolkit().getMenuShortcutKeyMask()));//là ghi chú thích
		exitJMenuItem.setIcon(new ImageIcon("hinh/exit2.png"));// gắn hình ảnh cho nó
		fileJMenu.add(exitJMenuItem);
		
		editJMenu=new JMenu("Edit");// 1 nhóm khác
		jMenuBar.add(editJMenu);
		copyJMenuItem=new JMenuItem("Copy");
		editJMenu.add(copyJMenuItem);
		editJMenu.addSeparator();
		pasteJMenuItem=new JMenuItem("Paste");
		editJMenu.add(pasteJMenuItem);
		
		// 2 . là cái màn hình chính
		// container : thùng đựng hành
		Container container=getContentPane();// cái giao diện chính
		// panel : bảng điều khiển 
		JPanel mainJPanel=new JPanel();
		// layout : bố trí ,
		// border : biên giới
		mainJPanel.setLayout(new BorderLayout());// nó có hướng (center : giữa,east : đông , bên phải ,west : bên trái ,south : dưới , north : phía trên )
		
		// mouse : con chuộc
		//listener : lắng nghe
		// pop click listener : người nghe nhấn chuộc
		JTabbedPane jTabbedPane=new JTabbedPane();
		container.add(jTabbedPane);
		jTabbedPane.add(mainJPanel,"haha");
		JPanel jPanelbutton=new JPanel();
		jPanelbutton.setLayout(new FlowLayout());
		button1=new Button("hùng anh 1");
		jPanelbutton.add(button1);
		button1.addMouseListener(new PopClicklistener());
		button2 =new Button("ánh diệu");
		button2.addMouseListener(new PopClicklistener());// lắng nghe nút nhấn chuộc qua lớp PopClicklistener 
		jPanelbutton.add(button2);
		mainJPanel.add(jPanelbutton,BorderLayout.CENTER);// các nút button ở chính giữa
		
		// tool : dụng cụ , công cụ
		// 
		jToolBar =new JToolBar();// 
		jButtonlenh1=new JButton("lệnh 1");
		jToolBar.add(jButtonlenh1);
		jButtonlenh2=new JButton("lệnh 2");
		jToolBar.add(jButtonlenh2);
		jCheckBox=new JCheckBox("jcheckbor");// là nút tíc vào
		jToolBar.add(jCheckBox);
		mainJPanel.add(jToolBar,BorderLayout.NORTH);// cho jtoolbar vào giao diện về hướng tây
		
	}
	private void sukien() {
		// nút tắc trên thanh công cụ
		exitJMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
	}
	public void hienthi() {
		this.setSize(500,500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);// có tắt bằng dấu chéo trên giao diện
		this.setVisible(true);// hiệu giao diện ra
	}
	public static void main(String[] args) {
		hocJmenu hocJmenu=new hocJmenu("học jmenu");
		hocJmenu.hienthi();
	}
	class PopUp extends JPopupMenu{
		private static final long serialVersionUID = 1L;
		// pop up : bật lên
		// là hàm khi kích chuột phải vào các button ( nếu truyền button vào ) thì nó hiện ra
		public PopUp() {
			jMenuItemdo=new JMenuItem("màu đỏ");
			add(jMenuItemdo);
			jMenuItemxanhItem=new JMenuItem("màu xanh");
			add(jMenuItemxanhItem);
			
			// sự kiện của nó
			// performed : thực hiện , biểu diễn
			// event : sự kiện
			jMenuItemdo.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (button!=null) {//nếu button # null thì cho nó thành màu đỏ 
						button.setBackground(Color.red);
					}
				}
			});
			jMenuItemxanhItem.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					if (button!=null) {
						button.setBackground(Color.BLUE);// thây đổi màu cho button
					}
				}
			});
			
			jButtonlenh1.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					JOptionPane.showMessageDialog(null, "đây là lệnh 1");// nếu nút đó được chọn thì hiện cái chữ đó hiện lên
				}
			});
		}
	}
	//adapter : bộ chuyển đổi
	// tạo sự kiện để lắn nghe nhấn chuột
	class PopClicklistener extends MouseAdapter{
		public void mousePressed(MouseEvent e) {
			if (e.isPopupTrigger()) {
				doPop(e);
			}
		}
		// hàm này là trong lớp MouseAdapter để kích chuột phải
		public void  mouseReleased(MouseEvent e) {
			if (e.isPopupTrigger()) {
				doPop(e);// thì thực hiện cái hàm ở dưới
			}
		}
		private void doPop(MouseEvent e) {
			// TODO Auto-generated method stub
			PopUp menu=new PopUp();// gọi cái hàm đó
			button=(Button) e.getComponent();//thây đổi giá trị của button thông qua class PopUp ( kế thua từ lớp JPopupMenu )
			menu.show(button,e.getX(), e.getY());// hiện button tại cái vị trí đó 
		}
	}
	}
