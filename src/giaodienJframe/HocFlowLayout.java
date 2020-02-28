package giaodienJframe;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocFlowLayout extends  JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public HocFlowLayout(String tieude) {
    	this.setTitle(tieude);
    	addcontainer();
    }
    public void addcontainer() {
		Container container=getContentPane();
		JButton button1=new JButton("hung anh");
		JButton button2=new JButton("thúy");
		JButton button3=new JButton("quang");
		JButton button4=new JButton("quyên");
		JPanel jPanel=new JPanel();
		jPanel.setLayout(new  FlowLayout());
		jPanel.add(button1);
		jPanel.add(button2);
		jPanel.add(button3);
		jPanel.add(button4);
		container.add(jPanel);
	}
    public void showWindow() {
		this.setSize(600, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		}
}
