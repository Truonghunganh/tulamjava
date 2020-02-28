package giaodienJframe;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocBorderlayout extends JFrame {
	public HocBorderlayout(String tieude) {
		this.setTitle(tieude);
	}
	public void addContainer() {
		Container container=getContentPane();
		JPanel jPanel=new JPanel();
		jPanel.setLayout(new BorderLayout());
		
		JPanel dong =new JPanel();
		dong.setBackground(Color.blue);
		dong.setPreferredSize(new Dimension(0, 50));
		jPanel.add(dong,BorderLayout.NORTH);
		
		JPanel tay=new JPanel();
		tay.setBackground(Color.RED);
		tay.setPreferredSize(new Dimension(0, 50));
		jPanel.add(tay,BorderLayout.SOUTH);
		
		JPanel nam=new JPanel();
		nam.setBackground(Color.yellow);
		nam.setPreferredSize(new Dimension(50, 0));
		jPanel.add(nam,BorderLayout.EAST);
		
		JPanel bat=new JPanel();
		bat.setBackground(Color.BLACK);
		bat.setPreferredSize(new Dimension(50, 0));
		jPanel.add(bat,BorderLayout.WEST);
		
		JPanel center=new JPanel();
		center.setBackground(Color.white);
		jPanel.add(center,BorderLayout.CENTER);
		
		container.add(jPanel);
		
	}
	public void showWindow() {
		this.setSize(800,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		//this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

}
