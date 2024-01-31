package day0131;

import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShopMain extends JFrame implements ActionListener{

	JButton btnAdd, btnDel, btnUpdate, btnList;
	
	public ShopMain() {
		super("ShopMain");
		this.setBounds(800, 100, 400, 400);
		initDesign();
		setVisible(true);
	}
	
	public void initDesign() {
		setLayout(new GridLayout(2,2));
		btnAdd=new JButton("상품추가");
		btnDel=new JButton("상품삭제");
		btnUpdate=new JButton("상품수정");
		btnList=new JButton("상품목록");
		
		add(btnAdd);
		add(btnDel);
		add(btnUpdate);
		add(btnList);
		
		btnAdd.addActionListener(this);
		btnDel.addActionListener(this);
		btnUpdate.addActionListener(this);
		btnList.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		
		if(ob==btnAdd) {
			ShopAddForm add=new ShopAddForm();
		}else if(ob==btnDel) {
			String num=JOptionPane.showInputDialog("삭제할 num을 입력해 주세요");
			
		}else if(ob==btnUpdate) {
			System.out.println("update");
		}else if(ob==btnList) {
			ShopListForm listForm=new ShopListForm();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ShopMain();
	}

}
