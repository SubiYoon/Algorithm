package Algorithm.Alone;


import java.util.Scanner;

public class Ex08 {

	/*
	 피보나치 수열 만들기
	 [입력]
	 10
	 
	 [출력]
	 1 1 2 3 5 8 13 21 34 55
	 */

	
	static Scanner sc = new Scanner(System.in);
	
	public static void fibonacci(int num) {
		int[] arr = new int[num];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i=2; i<num; i++) {
			arr[i] = arr[i-1]+arr[i-2];
		}
		
		for(int i=0; i<num; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int num = sc.nextInt();

		fibonacci(num);

		sc.close();
	}

}
