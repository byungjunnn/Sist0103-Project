package day0130;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class UpdateStuInfo extends JFrame{
	
	Container cp;
	JTextField tfName, tfJava, tfJsp, tfSpring;
	JComboBox<String> cbBan;
	JButton btnMod;
	String num; //수정할 번호
	
	public UpdateStuInfo(String title) {
		super(title);
		cp=this.getContentPane();
		this.setBounds(200, 100, 200, 250);
		cp.setBackground(new Color(255, 204, 204));
		initDesign();
		setVisible(true);
	}
	
	public void initDesign() {
		this.setLayout(null);
		
		JLabel lblTitle1=new JLabel("이름");
		JLabel lblTitle2=new JLabel("반");
		JLabel lblTitle3=new JLabel("Java");
		JLabel lblTitle4=new JLabel("Jsp");
		JLabel lblTitle5=new JLabel("Spring");
		
		tfName=new JTextField(4);
		tfJava=new JTextField(3);
		tfJsp=new JTextField(3);
		tfSpring=new JTextField(3);
		
		String[] ban= {"aws반", "front반","backend반","design반"};
		cbBan=new JComboBox<String>(ban);
		btnMod=new JButton("수정");
		
		//라벨 5개
		lblTitle1.setBounds(30, 10, 60, 30);
		add(lblTitle1);
		lblTitle2.setBounds(30, 40, 60, 30);
		add(lblTitle2);
		lblTitle3.setBounds(30, 70, 60, 30);
		add(lblTitle3);
		lblTitle4.setBounds(30, 100, 60, 30);
		add(lblTitle4);
		lblTitle5.setBounds(30, 130, 60, 30);
		add(lblTitle5);
		
		//이름, 반, 자바, jsp, spring 순으로
		tfName.setBounds(80, 15, 70, 22);
		add(tfName);
		cbBan.setBounds(80, 45, 70, 22);
		add(cbBan);
		tfJava.setBounds(80, 75, 70, 22);
		add(tfJava);
		tfJsp.setBounds(80, 105, 70, 22);
		add(tfJsp);
		tfSpring.setBounds(80, 135, 70, 22);
		add(tfSpring);
		
		btnMod.setBounds(60, 170, 70, 30);
		add(btnMod);
		
	}
	public static void main(String[] args) {
		new UpdateStuInfo("학생정보수정프레임");
	}
}
