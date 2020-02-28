package giaodienJframe;


import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

//import javafx.scene.layout.Border;

public class HocbordervaJTextArea  extends JFrame {
	JTextField jTextFieldten;
	JTextArea jTextAreadiachi;
	Button  buttonOK;
	public HocbordervaJTextArea(String tieude) {
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
		
		
		
		JPanel jPanelOK=new JPanel();
		jPanelOK.setLayout(new  FlowLayout(FlowLayout.RIGHT));
		buttonOK=new  Button("OK");
		jPanelOK.add(buttonOK);
		jPanelmain.add(jPanelOK);
		
		container.add(jPanelmain);
	}
	public void Events() {
		
	}
	public void showWindow() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
