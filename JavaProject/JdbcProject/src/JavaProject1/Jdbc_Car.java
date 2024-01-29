package JavaProject1;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

public class Jdbc_Car extends JFrame implements ActionListener{
	Container cp;
	JLabel lbTitle, lbcompany, lbmodel, lbrd, lbprice, lbfuel, lbfe, lbop;
	JTextField tfNum;
	JButton bt_jo, bt_su, bt_del;
	
	public Jdbc_Car() {
		setTitle("자동차 관리 시스템");
		cp=this.getContentPane();
		
		this.setBounds(800, 100, 960, 400);
		cp.setBackground(new Color(255,255,200));
		this.initDesign();
		this.setVisible(true);
	}
	
	public void initDesign() {
		this.setLayout(null);
		
		lbTitle=new JLabel("내 차 조회하기", JLabel.CENTER);
		lbTitle.setBounds(20, 20, 300, 50);
		lbTitle.setBorder(new LineBorder(Color.BLACK, 3));
		lbTitle.setFont(new Font("맑은 고딕", Font.BOLD, 25));
		this.add(lbTitle);
		
		tfNum=new JTextField();
		tfNum.setBounds(20, 80, 300, 30);
		add(tfNum);
		
		bt_jo=new JButton("조회");
		bt_jo.setBounds(240, 120, 80, 30);
		add(bt_jo);
		bt_jo.addActionListener(this);
		bt_su=new JButton("수정");
		bt_su.setBounds(150, 300, 80, 30);
		add(bt_su);
		bt_su.addActionListener(this);
		bt_del=new JButton("삭제");
		bt_del.setBounds(240, 300, 80, 30);
		add(bt_del);
		bt_del.addActionListener(this);
		
		JPanel panel=new JPanel();
		panel.setLayout(null);
		panel.setBounds(360, 20, 560, 320);
		panel.setBackground(Color.WHITE);
//		panel.setOpaque(true);
		add(panel);
		
		
		lbcompany=new JLabel("자동차 회사");
		lbcompany.setBounds(380, 20, 120, 30);
		lbcompany.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		panel.add(lbcompany);
		
		lbmodel=new JLabel("모델명");
		lbmodel.setBounds(380, 60, 120, 30);
		lbmodel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		panel.add(lbmodel);
		
		lbrd=new JLabel("차량 등록일");
		lbrd.setBounds(380, 100, 120, 30);
		lbrd.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		panel.add(lbrd);
		
		lbprice=new JLabel("차량 가격");
		lbprice.setBounds(50, 180, 120, 30);
		lbprice.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		panel.add(lbprice);
		
		lbfuel=new JLabel("차량 연료");
		lbfuel.setBounds(380, 180, 120, 30);
		lbfuel.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		panel.add(lbfuel);
		
		lbfe=new JLabel("차량 연비");
		lbfe.setBounds(50, 240, 120, 30);
		lbfe.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		panel.add(lbfe);
		
		lbop=new JLabel("차량 출력");
		lbop.setBounds(380, 240, 120, 30);
		lbop.setFont(new Font("맑은 고딕", Font.BOLD, 15));
		panel.add(lbop);
	
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		
		if(ob==bt_jo) {
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Jdbc_Car();
	}
}
