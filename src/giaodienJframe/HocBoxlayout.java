package giaodienJframe;


import java.awt.Button;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings({ "serial" })
public class HocBoxlayout extends JFrame {
	public HocBoxlayout(String tieude) {
		this.setTitle(tieude);
		containeltheohangngang();
		showWiindow();
		
	}
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		HocBorderlayout borderlayout=new HocBorderlayout("hocj borderlayout");
	}
	public  void containeltheohangdoc() {
		Container  container=getContentPane();
		JPanel jPanel=new JPanel();
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.Y_AXIS));
		//JButton : nút nó nhỏ 
		JButton a=new JButton("aaaaaaa");
		JButton b=new JButton("bbbbbbb");
		JButton c=new JButton("cccccccc");
		JButton d=new JButton("dddddddd");
		jPanel.add(a);
		jPanel.add(b);
		jPanel.add(c);
		jPanel.add(d);
		container.add(jPanel);
	}
	public void containeltheohangngang() {
		Container  container=getContentPane();
		JPanel jPanel=new JPanel();
		jPanel.setLayout(new BoxLayout(jPanel, BoxLayout.X_AXIS));
		// Button : nút toàn màn hình 
		Button a=new Button("aaaaaaa");
		Button b=new Button("bbbbbbb");
		Button c=new Button("cccccccc");
		Button d=new Button("dddddddd");
		jPanel.add(a);
		jPanel.add(b);
		jPanel.add(c);
		jPanel.add(d);
		container.add(jPanel);
	}
	public void showWiindow() {
		this.setSize(500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
