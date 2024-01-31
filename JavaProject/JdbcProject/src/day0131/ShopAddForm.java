package day0131;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ShopAddForm extends JFrame implements ActionListener{
	

	JTextField tfSang, tfSu, tfDan;
	JLabel lblPhoto;
	String imageName;
	JButton btnImage, btnInsert;
	
	//db모델 생성: 추가, 삭제 등 가져오기 위해
	ShopDbModel model=new ShopDbModel();
	//내부클래스 생성
	PhotoDraw photoDraw=new PhotoDraw();
	
	public ShopAddForm() {
		super("상품 추가폼");
		this.setBounds(800, 100, 400, 350);
		initDesign();
		setVisible(true);
	}
	
	public void initDesign() {
		setLayout(null);
		
		JLabel lbl1=new JLabel("상품명");
		lbl1.setBounds(30, 10, 60, 30);
		add(lbl1);
		
		tfSang=new JTextField();
		tfSang.setBounds(110, 10, 100, 30);
		add(tfSang);
		
		JLabel lbl2=new JLabel("사진선택");
		lbl2.setBounds(30, 60, 60, 30);
		add(lbl2);
		
		btnImage=new JButton("사진선택");
		btnImage.setBounds(110, 60, 100, 30);
		add(btnImage);
		btnImage.addActionListener(this);
		
		//이미지 추가
		photoDraw.setBounds(250, 10, 80, 90);
		add(photoDraw);
		
		//이미지명
		lblPhoto=new JLabel("이미지명");
		lblPhoto.setBorder(new LineBorder(Color.pink));
		lblPhoto.setBounds(20, 120, 300, 30);
		add(lblPhoto);
		
		//수량
		JLabel lbl3=new JLabel("수량");
		lbl3.setBounds(30, 160, 70, 30);
		add(lbl3);
		
		tfSu=new JTextField();
		tfSu.setBounds(110, 160, 70, 30);
		add(tfSu);
		
		//단가
		JLabel lbl4=new JLabel("단가");
		lbl4.setBounds(30, 200, 70, 30);
		add(lbl4);
		
		tfDan=new JTextField();
		tfDan.setBounds(110, 200, 70, 30);
		add(tfDan);
		
		//db추가 버튼
		btnInsert=new JButton("DB추가");
		btnInsert.setBounds(110, 240, 100, 30);
		btnInsert.addActionListener(this);
		add(btnInsert);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object ob=e.getSource();
		
		if(ob==btnImage) {
			FileDialog dlg=new FileDialog(this, "이미지 가져오기", FileDialog.LOAD);
			dlg.setVisible(true);
			//취소 누르면 메서드 종료
			if(dlg.getDirectory()==null)
				return;
			//이미지명 얻기
			imageName=dlg.getDirectory()+dlg.getFile();
			
			//라벨에 이미지명 출력
			lblPhoto.setText(imageName);
			
			//이미지 출력
			photoDraw.repaint();
		}else if(ob==btnInsert) {
			//ShopDto생성
			ShopDto dto=new ShopDto();
			
			//dto에 4개의 데이터 넣기
			dto.setSangpum(tfSang.getText());
			dto.setPhoto(imageName);
			dto.setSu(Integer.parseInt(tfSu.getText()));
			dto.setDan(Integer.parseInt(tfDan.getText()));
			
			//db모델에서 insert메서드 호출
			model.insertShop(dto);
			
			//현재창 닫기
			setVisible(false);
		}
	}
	
	//내부클래스는 메서드처럼 사용(이미지 삽입), 다만 상속 받을 수 있음
	class PhotoDraw extends Canvas{
		
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			
			if(imageName!=null) {
				Image image=new ImageIcon(imageName).getImage();
				g.drawImage(image, 10, 10, 60, 70, this);
			}
		}
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		new ShopAddForm();
//	}

}
