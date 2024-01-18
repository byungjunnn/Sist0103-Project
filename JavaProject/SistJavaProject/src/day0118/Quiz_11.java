package day0118;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Quiz_11 extends JFrame implements ActionListener{
	Container cp;
	JLabel lbl;
	JButton[] btn=new JButton[5];
	String[] btnLabel= {"Red","Orange","Yellow","Green","Blue"};
	Color[] btnColor= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE};
	
	public Quiz_11() {
		super("계산 연습문제");
		
		cp=this.getContentPane();
		
		this.setBounds(800, 100, 600, 300);
		cp.setBackground(new Color(255,255,200));
		setDesign();
		this.setVisible(true);
	}
	public void setDesign() {
		JPanel panel=new JPanel();
		panel.setBackground(Color.black);
		this.add(panel, BorderLayout.NORTH);
		
		for(int i=0;i<btn.length;i++) {
			btn[i]=new JButton(btnLabel[i]);
			btn[i].setBackground(btnColor[i]);
			panel.add(btn[i]);
		}
		lbl=new JLabel("안녕하세요", JLabel.CENTER);
		
		this.add(lbl);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Quiz_11();
	}
}