package Algorithm.Alone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex02 {
	public static void main(String[] args) {
		/*
	 	[입력] Scanner 사용 XX
	 	56 82 35 95 68 35 75 92
	  
	  	[처리조건]
	  	콘솔에서 입력받은 데이터를 배열에 저장한 후 총합과 평균(정수)을 출력하라.
	  	
	  	[출력]
	  	____(총합) (빈칸)__(평균)
	 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String data = br.readLine();	//한줄 문자열 입력
			
			String[] str = data.split(" ");
			
			//System.out.println(Arrays.toString(str));
			
			int total = 0;
			
			for(int i=0; i<str.length; i++) {
				total += Integer.valueOf(str[i]);
			}
			
			int avg = total/str.length;
			
			System.out.printf("%d %d", total, avg);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
