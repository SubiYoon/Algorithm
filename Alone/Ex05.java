package Algorithm.Alone;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Ex05 {

	public static void main(String[] args) {
/*
 data2.txt의 파일을 입력하여 성적처리를 하는 프로그램을 작성하라.
 중간고사, 기말고사, 과제물, 출석점수[입력]
 [입력]
 90 89 99 100
 100 66 55 85
 60 60 58 73
 90 50 99 70
 70 60 80 92
 90 80 72 70
 
 [처리조건1]
 평균 60%
 과제 20%
 출석 20%
 
 [처리조건2]
 학점
 A학점: 90~100
 B학점 : 80~89.9
 C학점 : 70~79.9
 D학점 : 60~69.9
 F학점 : 60미만
 
 [처리조건3]
 A, B -> excellent
 C, D -> Good
 F -> poor
 
 평균, 학점, 평가
 [출력]
 93.50 A excellent
 
 
 */
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("/Users/dongsubyoon/multi/JAVA/Workspace/javaAlgorithm/src/algoritmReport/data2.txt")));
			
			for(int i=0;;i++) {
				
				ArrayList<Integer> arr = new ArrayList<Integer>();
				
				String inData = br.readLine();		//한줄로 데이터 받아오기
				if(inData == null) break;			//null 받으면 종료
				String[] str = inData.split(" ");	//배열로 담기
				for(String s : str) {
					arr.add(Integer.parseInt(s));	//형변환하기
				}
				
				double avg= (double)(arr.get(0) + arr.get(1)) / 2;	//	연산
				double report = arr.get(2);							//	연산
				double check = arr.get(3);							//	연산
				double total = avg*0.6 + report*0.2 + check*0.2;	//	연산
				
				char abcdf;
				String m = null;
				
				if(total >=90) {									//	학점결정
					abcdf = 'A';
				}else if(total >=80) {
					abcdf = 'B';
				}else if(total >=70) {
					abcdf = 'C';
				}else if(total >=60) {
					abcdf = 'D';
				}else {
					abcdf = 'F';
				}
				
				switch (abcdf) {							//	문구 설정
				case 'A': case 'B': m="exellent"; break;
				case 'C': case 'D': m="good"; break;
				case 'F': m="poor";
				}
				
				System.out.printf("%d번 학생 : %.2f %c %s\n", i+1, total, abcdf, m);	//출력
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
