package giaodienJframe;


import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

//import javafx.scene.layout.Border;

public class HocbordervaJTextAreaChecboxRadia  extends JFrame {
	JTextField jTextFieldten;
	JTextArea jTextAreadiachi;
	
	JCheckBox jcbdiboi,jcbxemphim;
	
	JRadioButton radnam,radnu;
	ButtonGroup groupgioitinh;
	
	Button  buttonOK;
	public HocbordervaJTextAreaChecboxRadia(String tieude) {
		super(tieude);
		addcontainer();
		
		Events();
	}
	public void addcontainer() {
		Container container=getContentPane();
		
		JPanel jPanelmain=new JPanel();
		jPanelmain.setLayout(new BoxLayout(jPanelmain, BoxLayout.Y_AXIS));
		
		JPanel jPanelthongtin=new JPanel();
		jPanelthongtin.setLayout(new BoxLayout(jPanelthongtin, BoxLayout.Y_AXIS));
		JPanel jPanelten=new JPanel();
		JLabel jLabelten= new JLabel("nhập tên :");
		 jTextFieldten=new  JTextField(20);
		jPanelten.add(jLabelten);
		jPanelten.add(jTextFieldten);
		jPanelthongtin.add(jPanelten);
		
		JPanel jPaneldiachi=new JPanel();
		JLabel jLabeldiachi=new JLabel("địa chỉ :    ");
		jTextAreadiachi=new JTextArea(4,19);	
		jTextAreadiachi.setWrapStyleWord(true);
		jTextAreadiachi.setLineWrap(true);
		JScrollPane jScrollPanediachi=new JScrollPane(jTextAreadiachi,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		javax.swing.border.Border borderthongtin=BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder titledBorderthongtin=new TitledBorder(borderthongtin, "thông tin :");
		titledBorderthongtin.setTitleColor(Color.RED);
		titledBorderthongtin.setTitleJustification(TitledBorder.CENTER);
		jPaneldiachi.add(jLabeldiachi);
		jPaneldiachi.add(jScrollPanediachi);
		jPanelthongtin.add(jPaneldiachi);
		jPanelthongtin.setBorder(titledBorderthongtin);
		
		jPanelmain.add(jPanelthongtin);
		
		JPanel jPanelsothichvagioitinh=new JPanel();
		jPanelsothichvagioitinh.setLayout(new GridLayout(1, 2));
		JPanel jPanelsothich=new  JPanel();
		jPanelsothich.setLayout(new BoxLayout(jPanelsothich, BoxLayout.Y_AXIS));
		jcbdiboi=new JCheckBox("đi bơi");
		jcbxemphim=new JCheckBox("xem phim");
		jPanelsothich.add(jcbdiboi);
		jPanelsothich.add(jcbxemphim);
		javax.swing.border.Border bordersothich=BorderFactory.createLineBorder(Color.yellow);
		TitledBorder titledBordersothich=new TitledBorder(bordersothich, "sở thích");
		titledBordersothich.setTitleColor(Color.black);
		jPanelsothich.setBorder(titledBordersothich);
;		jPanelsothichvagioitinh.add(jPanelsothich);
		
		JPanel jPanelgioitinh=new JPanel();
		jPanelgioitinh.setLayout(new BoxLayout(jPanelgioitinh, BoxLayout.Y_AXIS));
		radnam=new JRadioButton("nam");
		radnu=new JRadioButton("nữ ");
		groupgioitinh=new ButtonGroup();
		groupgioitinh.add(radnam);
		groupgioitinh.add(radnu);
		jPanelgioitinh.add(radnam);
		jPanelgioitinh.add(radnu);
		javax.swing.border.Border bordergioitinh=BorderFactory.createLineBorder(Color.green);
		TitledBorder titledBordergioitinh=new TitledBorder(bordergioitinh, "giới tính");
		titledBordergioitinh.setTitleColor(Color.blue);
		jPanelgioitinh.setBorder(titledBordergioitinh);
		jPanelsothichvagioitinh.add(jPanelgioitinh);
		
		
		jPanelmain.add(jPanelsothichvagioitinh);
		
		JPanel jPanelOK=new JPanel();
		jPanelOK.setLayout(new  FlowLayout(FlowLayout.RIGHT));
		buttonOK=new  Button("OK");
		jPanelOK.add(buttonOK);
		jPanelmain.add(jPanelOK);
		
		container.add(jPanelmain);
	}
	public void Events() {
		buttonOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				String dulieu=jTextFieldten.getText()+"\n";
				dulieu+=jTextAreadiachi.getText()+"\n";
				if (jcbdiboi.isSelected()) {
					dulieu+=jcbdiboi.getText()+"\n";
				}
				if (jcbxemphim.isSelected()) {
					dulieu+=jcbxemphim.getText()+"\n";
				}
				if (radnam.isSelected()) {
					dulieu+=radnam.getText()+"\n";
				}
				else {
					dulieu+=radnu.getText()+"\n";
				}
				
				 JOptionPane.showMessageDialog(null, dulieu);
			}
		});
	}
	public void showWindow() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
