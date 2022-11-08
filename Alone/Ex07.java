package algoritmReport;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		//과제물
	/*
	  
	 년도를 입력받아 윤년과 평균을 구별하여 출력하라.
	 1행은 입력받을 테이터수
	 
	 
	 1. 4의 배수의 해이면서 100의 배수는 아닌 경우(윤년)
	 2. 400의 배수인 경우
	 
	 [입력]
	 6
	 4 100 400 2000 2001 2004
	 
	 [출력]
	 #1 윤년
	 #2 평년
	 #3 윤년
	 #4 윤년
	 #5 평년
	 #6 윤년
	 */

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		ArrayList<Integer> year = new ArrayList<Integer>();
		
		for(int i=0; i<num; i++) {
			year.add(sc.nextInt());
		}
		
		for(int i=0; i<num; i++) {
			if(year.get(i)%4==0 && year.get(i)%100!=0) {
				System.out.println("#"+(i+1)+" 윤년");
			}else {
				if(year.get(i)%400==0) {
					System.out.println("#"+(i+1)+" 윤년");
				}else {
					System.out.println("#"+(i+1)+" 평년");
				}
			}
		}
		sc.close();
	}

}
