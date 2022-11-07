package eLearning.algoritm.chapter07;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test01 {
	/*
	- 두개의 배열 A,B가 있고, 배열의 원소는 모두 자연수 두 배열은 모두 N개의 원소로 구성
	- 최대 K번의 바궈치기 연산을 수행
	- 바꿔치기연산 : 배열 A에 있는 원소 하나와 배열 B에 있는 원소 하나를 골라 두 원소를 서로 바꾸는 것
	- 최종 목표는 배열 A의모든 원소의 합이 최대가 되도록 하는 것
	- N, K 그리고 배열 A,B의 정보가 주어 졌을 때, K번 바꿔치기 연산 수행
	- 배열 A의 모든 원소의 합이 최댓값을 출력
	
	 -입력 : 5 3 
	 		1 2 5 4 3
	 		5 5 6 6 5
	 -결과 : 26
	 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		Integer[] a = new Integer[n];
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		Integer[] b = new Integer[n];
		for(int i=0; i<n; i++) {
			b[i] = sc.nextInt();
		}
		
		Arrays.sort(a);
		Arrays.sort(b, Collections.reverseOrder());
		
		for(int i=0; i<k; i++) {
			if(a[i] >= b[i]) {
				break;
			}else {
				a[i]=b[i];
			}
		}
		
		int result=0;
		for(int i=0; i<n; i++) {
			result+=a[i];
		}
		
		System.out.println(result);
		}

	}
