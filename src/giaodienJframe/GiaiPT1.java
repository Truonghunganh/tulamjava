package giaodienJframe;
// có ba sự kiện : 
// mà nên dùng 1 cái 
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class GiaiPT1 extends JFrame{
	JTextField a,b,kq;
	JButton kqnut,help,thoatnut;
	
	//chia  sẽ sự kiện 
	ActionListener giaiPTb1 =new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent arg0) {

			suliPTB1();
		}
	};					
	public void addEvents() {
		kqnut.addActionListener(giaiPTb1);
		help.addActionListener(new  helpnut());
		thoatnut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
				
			}
		});
	}
	protected void suliPTB1() {
		try {

			String hesoa=a.getText();
			String hesob=b.getText();
			double soa=Double.parseDouble(hesoa);
			double sob=Double.parseDouble(hesob);
			if (soa==0 && sob==0) {
				kq.setText("vô số nghiệm");
			} else {
				if (soa==0) {
					kq.setText("vô  nghiêm");
				} else {
					double x=-sob/soa;
					kq.setText("x="+x);
				}

			}

		} catch (Exception e) {
			kq.setText("bạn nhập sai rồi");
		}	
	}
	class helpnut  implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, "hãy liên hệ hunganh250590@gmail.com");
		}
		
	}
	public GiaiPT1(String tieude) {
		this.setTitle(tieude);
		addcontainer();
		addEvents();
	}
	public void addcontainer() {
		Container container=getContentPane();
		
		JPanel jPanelmain= new JPanel();
		jPanelmain.setLayout(new BoxLayout(jPanelmain, BoxLayout.Y_AXIS));
		
		JPanel jPanel1=new JPanel();
		jPanel1.setLayout(new FlowLayout());
		JLabel jLabel1=new JLabel("giải phương trình bật nhất");
		jLabel1.setForeground(Color.blue);
		Font font1=new Font("arial", Font.BOLD, 20);
		jLabel1.setFont(font1);
		jPanel1.add(jLabel1);
		jPanelmain.add(jPanel1);
		
		JPanel jPanel2=new JPanel();
		jPanel1.setLayout(new FlowLayout());
		JLabel label2=new JLabel("hệ số a :");
		a=new JTextField(15);
		jPanel2.add(label2);
		jPanel2.add(a);
		jPanelmain.add(jPanel2);
		
		JPanel jPanelhesob=new JPanel();
		jPanelhesob.setLayout(new FlowLayout());
		JLabel jLabelB=new JLabel("hệ sô b:");
		 b=new JTextField(15);
		jPanelhesob.add(jLabelB);
		jPanelhesob.add(b);
		jPanelmain.add(jPanelhesob);
		
		JPanel jPanelnut=new JPanel();
		jPanelnut.setLayout(new FlowLayout());
		kqnut=new JButton("kết quả");
		thoatnut=new JButton("thoat");
		thoatnut.setIcon(new ImageIcon("hinh/exit.png"));
		help=new JButton("Help me");
		jPanelnut.add(kqnut);
		jPanelnut.add(thoatnut);
		jPanelnut.add(help);
		jPanelmain.add(jPanelnut);
		
		JPanel ketqua=new JPanel();
		ketqua.setLayout(new  FlowLayout());
		JLabel  chukq=new JLabel("kết quả :");
		 kq=new JTextField(15);
		ketqua.add(chukq);
		ketqua.add(kq);
		jPanelmain.add(ketqua);
		
		
		container.add(jPanelmain);
	}
	public void showWindow() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
