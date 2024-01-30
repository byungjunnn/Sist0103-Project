package JavaProject1;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Jdbc_MyCar extends JFrame{
	Container cp;
	DefaultTableModel model;
	JTable table;
	JButton bt_su, bt_del;
	
	public Jdbc_MyCar() {
		setTitle("자동차 관리 시스템");
		cp=this.getContentPane();
		
		this.setSize(800, 650);
		cp.setBackground(new Color(255,255,200));
		this.setLocationRelativeTo(null);
		initDesign();
	}
	public void initDesign() {
		this.setLayout(null);
		
		JPanel panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBounds(315, 30, 450, 255);
		panel1.setBackground(Color.WHITE);
		add(panel1);
		
		JPanel panel2=new JPanel();
		panel2.setLayout(null);
		panel2.setBounds(20, 300, 745, 250);
		panel2.setBackground(Color.WHITE);
		add(panel2);
		
		bt_su=new JButton("수정");
		bt_su.setBounds(580, 560, 80, 30);
		add(bt_su);
		
		bt_del=new JButton("삭제");
		bt_del.setBounds(685, 560, 80, 30);
		add(bt_del);
		
		model=new DefaultTableModel(0, 0);
		table=new JTable(model);
		panel2.add("Center", new JScrollPane(table));
		
	}

	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new Jdbc_MyCar();
//	}

}
