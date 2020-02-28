package giaodienJframe;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class hocJtabedPanebai24 extends JFrame {

	public hocJtabedPanebai24(String tieude) {
		super(tieude);
		addControls();
		addEvent();
	}
	private void addEvent() {
		
	}
	private void addControls() {
		Container container=getContentPane();
		JTabbedPane jTabbedPane=new JTabbedPane();
		container.add(jTabbedPane);
		JPanel jPanel1=new JPanel();
		jPanel1.setBackground(Color.BLACK);
		JPanel jPanel2=new JPanel();
		jPanel2.setBackground(Color.blue);
		JPanel jPanel3=new JPanel();
		jPanel3.setBackground(Color.cyan);
		jTabbedPane.add(jPanel1,"tab1");
		jTabbedPane.add(jPanel2,"tab2");
		jTabbedPane.add(jPanel3,"tab3");
	}
	public void showwindow() {
		this.setSize(500, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public static void main(String[] args) {
		hocJtabedPanebai24 hocJtabedPanebai24=new hocJtabedPanebai24("hoc tabedPane");
		hocJtabedPanebai24.showwindow();
	}

}
