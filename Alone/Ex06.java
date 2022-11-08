package algoritmReport;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ex05 {

	public static void main(String[] args) {
		
		Integer[][] arr = new Integer[5][5];
		int k1=1;
		for(int i=0; i<arr.length; i++){	
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = k1++;
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("*************************************");
		for(int i=0; i<arr.length; i++){	
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%d\t", arr[j][i]);
			}
			System.out.println();
		}
		
		System.out.println("*************************************");
		for(int i=0; i<arr.length; i++) {
			if(i%2==0) {
				for(int j=0; j<arr[i].length; j++) {
					System.out.printf("%d\t", arr[i][j]);
				}
				System.out.println();
				
			}else {
				for(int j=arr[i].length-1; j>=0; j--) {
					System.out.printf("%d\t", arr[i][j]);
				}
				System.out.println();
			}
		}
		
		System.out.println("*************************************");
		for(Integer[] row : arr) {	//2차원 배열arr의 1줄의 정보를 1차원배열로 row에 대입해준다.
			//1. 컬렉션중에 List로 변환
			List<Integer> list = Arrays.asList(row);
			//2. 뒤집기
			Collections.reverse(list);
			//3. 배열로 변환
			Integer result[] = list.toArray(new Integer[0]);
			//4. 출력
			for(int i=0; i<result.length; i++) {
				System.out.printf("%d\t", result[i]);
			}
			System.out.println();
		}
	}

}
