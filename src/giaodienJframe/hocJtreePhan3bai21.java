package giaodienJframe;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class hocJtreePhan3bai21 extends JFrame{
	private static final long serialVersionUID = 1L;
	JTree jTree;
	JTextField thongbaoField;
		
	DefaultMutableTreeNode defaultMutableTreeNode;
	public hocJtreePhan3bai21(String tiêude) {
		super(tiêude);
		giaodien();
		sukien();
		
	}
	private void hienthi() {
		this.setSize(new Dimension(500,500));
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	private void sukien() {
		jTree.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				Object object=jTree.getLastSelectedPathComponent(); // là cái node được chọn
				DefaultMutableTreeNode caiduocchoNode=(DefaultMutableTreeNode)object;
				thongbaoField.setText(caiduocchoNode.getUserObject()+"");
			}
		});
	}
	private void giaodien() {
		Container container=getContentPane();
		JPanel traiJPanel=new JPanel();
		JPanel phảiJPanel=new JPanel();
		JSplitPane mainJSplitPane=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT);
		// panel : bảng điều khiển, khung
		// split : phân chia
		// horizontal :  theo chiều ngang
		// scroll : 
		container.add(mainJSplitPane);
		mainJSplitPane.add(traiJPanel);
		mainJSplitPane.add(phảiJPanel);
		defaultMutableTreeNode =new DefaultMutableTreeNode("công ty");
		jTree=new JTree(defaultMutableTreeNode);
		JScrollPane hopjJScrollPane=new JScrollPane(jTree,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		traiJPanel.add(hopjJScrollPane,BorderLayout.CENTER);
		traiJPanel.setPreferredSize(new Dimension(200,0));
		traiJPanel.setLayout(new BoxLayout(traiJPanel,BoxLayout.Y_AXIS));
	
		DefaultMutableTreeNode ketoanNode=new DefaultMutableTreeNode("kế toán");
		defaultMutableTreeNode.add(ketoanNode);
		DefaultMutableTreeNode quanlyNode =new DefaultMutableTreeNode("quảng lý ");
		defaultMutableTreeNode.add(quanlyNode);
		
		DefaultMutableTreeNode NV1=new DefaultMutableTreeNode("trương hùng anh");
		ketoanNode.add(NV1);
		DefaultMutableTreeNode NV2=new DefaultMutableTreeNode("trương ánh diệu");
		ketoanNode.add(NV2);
		DefaultMutableTreeNode NV3=new DefaultMutableTreeNode("trương phước thiên");
		ketoanNode.add(NV3);
		
		thongbaoField=new JTextField(20);
		phảiJPanel.add(thongbaoField);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hocJtreePhan3bai21 họcJtreePhan3baif22=new hocJtreePhan3bai21("học jtree ");
		họcJtreePhan3baif22.hienthi();
	}

}
