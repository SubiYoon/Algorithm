package Algorith.Day20;
/*
 키패드 무슨손으로 눌렀니??
 
 1,4,7은 왼손(왼손의 시작은 *)
 3,6,9는 오른손(오른손의 시작은 #)
 2,5,8,0은 현재위치에서 가장 가까운 손
 번호의 거리가 같으면 오른손잡이는 오른손 왼손잡이는 왼손을 씀
 */


public class Ex01 {

	 public static String solution(int[] numbers, String hand) {
	        String answer = "";
	        int rc = 12;
	        int lc = 10;
	        //동등한 거리값을 위해 r_c에서 빼줄 값
	        int num = 2;
	        
	        int[][] key = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
	        for(int i=0; i<key.length; i++) {
	        	for(int j=0; j<key[i].length; j++) {
	        		System.out.print(key[i][j]+"\t");
	        	}
	        	System.out.println();
	        }
	        
	        System.out.println("==================");
	        
	        for(int i=0; i<numbers.length; i++) {
	        	if(numbers[i]==0) {
	        		numbers[i]=11;
	        	}
	        }
	      
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		//int[] arr = {1,3,4,5,8,2,1,4,5,9,5};
		int[] arr1 = {7,0,8,2,8,3,1,5,7,6,2};
		int[] arr2 = {1,2,3,4,5,6,7,8,9,0};
		//System.out.println(solution(arr, "right")); // "LRLLLRLLRRL"
		System.out.println(solution(arr1, "left")); // "LRLLLRLLRRL"
		System.out.println(solution(arr2, "right")); // "LRLLLRLLRRL"

	}

}
