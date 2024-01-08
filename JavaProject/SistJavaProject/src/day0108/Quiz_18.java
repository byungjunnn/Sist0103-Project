package day0108;

import java.util.Scanner;

public class Quiz_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//quiz_1();
		quiz_2();
		
	}
	public static void quiz_1() {
	
		/*Q. 반복해서 숫자를 입력하여 양수의 갯수와 음수의 갯수를 구하시오(0입력시 종료)
		 * 
		 * 6
		 * -10
		 * 88
		 * 120
		 * -130
		 * 0
		 * 양수의 갯수: 3개
		 * 음수의 갯수: 2개
		 */
		Scanner sc=new Scanner(System.in);
		int num;
		int pcount=0;
		int mcount=0;
		
		while(true) {
			System.out.print("");
			num=sc.nextInt();
			
			if(num==0) {
				System.out.println("종료");
				break;
			}
			if(num>0)
				pcount++;
			else
				mcount++;
			
		}
		System.out.println("양수의 갯수: "+pcount+"개");
		System.out.println("음수의 갯수: "+mcount+"개");
		
	}
	public static void quiz_2() {
		//반복해서 점수를 입력하고 (1~100) 0을 입력시 빠져나와 총 갯수와 합계와 평균을 구하시오
		//범위에 맞지않는 점수는 횟수에서 제외되어야 한다
		Scanner sc=new Scanner(System.in);
		int score;
		int count = 0, sum=0;
		double avg=0;
		
		while(true) {
			System.out.print("");
			score=sc.nextInt();
			
			if(score==0)
				break;
			
			if(score<0 || score>100) {
				System.out.println("잘못 입력하였습니다");
				continue;
			}
			count++;
			sum+=score;

		}
		avg=sum/count;
		System.out.println("총갯수: "+count);
		System.out.println("합계: "+sum);
		System.out.println("평균: "+avg);
	}
		
}
