package day0117;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;

public class FileReadWrite_06 {

	Scanner sc=new Scanner(System.in);
	static final String FILENAME="C:\\sist0103\\file\\shop.txt";
	FileWriter fw=null;
	FileReader fr=null;
	BufferedReader br=null;
	
	public int getMenu() {
		int num;
		System.out.println("[메뉴] 1.상품추가   2.전체상품출력   3.삭제   5.종료");
		num=Integer.parseInt(sc.nextLine());
		return num;
	}
	
	//입력 후 파일에 저장
	public void sangpumAdd() {
		String sangName;
		int su, dan;
		//바나나,10,3500과 같이 파일에 저장
		System.out.println("상품명 입력");
		sangName=sc.nextLine();
		System.out.println("수량 입력");
		su=Integer.parseInt(sc.nextLine());
		System.out.println("단가 입력");
		dan=Integer.parseInt(sc.nextLine());
		
		try {
			fw=new FileWriter(FILENAME, true);
			fw.write(sangName+","+su+","+dan+"\n");
			System.out.println("**추가되었습니다**");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				fw.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//파일 출력
	public void fileAllDatas() {
		int total=0;
		int num=0;
		
		NumberFormat nf=NumberFormat.getCurrencyInstance(); //단위, 컴마 추가
		
		//제목 출력
		System.out.println("번호\t상품명\t수량\t단가\t금액");
		System.out.println("------------------------------------------------");
		
		try {
			fr=new FileReader(FILENAME);
			br=new BufferedReader(fr);
			
			while(true) {
				String s=br.readLine();
				
				if(s==null)
					break;
				
				String[] data=s.split(",");
				String sang=data[0];
				int su=Integer.parseInt(data[1]);
				int dan=Integer.parseInt(data[2]);
				
				int sum=su*dan;
				
				//총금액에 각 금액 추가
				total+=sum;
				
				System.out.println(++num+"\t"+sang+"\t"+su+"\t"+nf.format(dan)+"\t"+nf.format(sum));
			}
			System.out.println();
			System.out.println("\t\t총금액="+nf.format(total)+"원");
		} catch (FileNotFoundException e) {
			System.out.println("저장된 파일이 없습니다");
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	//파일 삭제
	public void deleteShop() {
		//File객체생성
		File file=new File(FILENAME);
		
		//파일이 존재한다면 삭제
		if(file.exists())
			file.delete();
		
		System.out.println("**파일이 삭제되었습니다**");
	}
	//메인에서 처리할 메서드
	public void process() {
		while(true) {
			int num=0;
			
			num=this.getMenu();
			
			switch(num) {
			case 1:
				System.out.println("상품정보를 입력합니다");
				sangpumAdd();
				break;
			case 2:
				System.out.println("전체상품을 출력합니다");
				fileAllDatas();
				break;
			case 3:
				System.out.println("**파일을 삭제합니다");
				deleteShop();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			default:
				System.out.println("숫자 확인 후 다시 입력바랍니다");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FileReadWrite_06 frw=new FileReadWrite_06();
		frw.process();
	}
}