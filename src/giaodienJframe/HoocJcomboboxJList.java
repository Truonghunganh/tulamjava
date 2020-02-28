package giaodienJframe;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Vector;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class HoocJcomboboxJList extends JFrame {
	private static final long serialVersionUID = 1L;
	JComboBox<Object>  chonso;
	JList<Object> chonso0 ;
	JButton ok;
	public HoocJcomboboxJList(String title) {
		super(title);
		addcontainer();
		addEvent();
		
	}
	public void addcontainer() {
		Container container=getContentPane();
		container.setLayout(new BoxLayout(container, BoxLayout.Y_AXIS));
		JPanel jPanelcombobox=new JPanel();
		jPanelcombobox.setLayout(new  FlowLayout());
		JLabel jLabelcombobox=new JLabel("chọn số :");
		chonso=new JComboBox<>();
		Random random=new Random();
		for (int i = 0; i < 10; i++) {
			chonso.addItem(random.nextInt(20));
		}
		jPanelcombobox.add(jLabelcombobox);
		jPanelcombobox.add(chonso);		
		container.add(jPanelcombobox);
		
		JPanel jPanelJlist=new JPanel();
		jPanelJlist.setLayout(new FlowLayout());
		JLabel jLabelJlist=new JLabel("chọn số : ");
		chonso0=new JList<>();
		Vector<Integer> vector=new Vector<>();
		for (int i = 0; i < 10; i++) {
	       vector.add(random.nextInt(20));
		}
		chonso0.setListData(vector);
		JScrollPane jScrollPanechonso0=new JScrollPane(chonso0,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		jPanelJlist.add(jLabelJlist);
		jPanelJlist.add(jScrollPanechonso0);
		container.add(jPanelJlist);
		
		JPanel jPanelOK=new JPanel();
		jPanelOK.setLayout(new FlowLayout());
		ok=new JButton("OK");
		jPanelOK.add(ok);
		container.add(jPanelOK);
	}
	public void addEvent() {
		chonso.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				int vt=chonso.getSelectedIndex();
				if (vt!=-1) {
					JOptionPane.showMessageDialog(null, "vị tri chọn : "+vt+" ; giá trị : "+chonso.getSelectedItem());
				}
			}
		});
		ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
			JOptionPane.showMessageDialog(null, "vi trí chọn :"+chonso0.getSelectedIndex()+"; giá trị : "+chonso0.getSelectedValue());
				
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
