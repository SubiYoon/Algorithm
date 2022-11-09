package algoritmReport;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex09 {
	public static Scanner sc = new Scanner(System.in);
	public static Random r = new Random();
	
	public static void number(int num) {
		//번호 생성
		int[] arr = new int[6];
		for(int i=0; i<num; i++) {
			for(int j=0; j<arr.length; j++) {
				arr[j]=r.nextInt(44)+1;
				//번호 중복 확인
				do {
					for(int k=0; k<arr.length; k++) {
						if(arr[j]==arr[k]) {
							arr[j]=r.nextInt(44)+1;
						}
					}break;
					
				}while(true);
			}
			//보너스 번호 생성
			int bonus=r.nextInt(44)+1;
			//보너스 번호 중복 확인
			do {
				for(int k=0; k<arr.length; k++) {
					if(arr[k]==bonus) {
						bonus=r.nextInt(44)+1;
					}
				}break;
				
			}while(true);
			//오름차순 정렬
			for(int j=0; j<arr.length; j++) {
				int change= j;
				for(int k =j+1; k<arr.length; k++) {
					if(arr[change] > arr[k]) {
						change=k;
					}
				}
				//스와이프
				int temp=arr[j];
				arr[j]= arr[change];
				arr[change]=temp;
			}
			
			//번호 + 보너스번호 출력 
			System.out.println((i+1)+"게임="+ Arrays.toString(arr) + ", bonus=" + bonus);
		}
	}
	public static void main(String[] args) {
		
		do {
			//게임수 입력
			System.out.print("게임수 = ");
			int gameNum = sc.nextInt();
			
			//번호 뽑는 함수 호출
			number(gameNum);
			
			//종료여부 결정
			System.out.print("계속하시겠습니까(1:예, 2:아니오)?");
			int end = sc.nextInt();
			if(end==2) {
				sc.close();
				return;	//종료
			}else if(end==1) { 
				continue;	//반복
			}
		}while(true);
	}

}
