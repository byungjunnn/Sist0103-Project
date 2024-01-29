package JavaProject1;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;

public class Jdbc_MyCar extends JFrame{
	Container cp;
	
	public Jdbc_MyCar() {
		setTitle("자동차 관리 시스템");
		cp=this.getContentPane();
		
		this.setBounds(800, 100, 960, 400);
		cp.setBackground(new Color(255,255,200));
		
		this.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
