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
	        int r_c = 12;
	        int l_c = 10;
	        //동등한 거리값을 위해 r_c에서 빼줄 값
	        int num = 2;
	        
//	        int[][] key = {{1,2,3},{4,5,6},{7,8,9},{10,0,12}};
//	        for(int i=0; i<key.length; i++) {
//	        	for(int j=0; j<key[i].length; j++) {
//	        		System.out.print(key[i][j]+"\t");
//	        	}
//	        	System.out.println();
//	        }
//	        
//	        System.out.println("==================");
	        
	        //1,4,7과 3,6,9를 누를때 and 왼손이 움직이지 않고, 2,5,8,0을 누를때
	        for(int i=0; i<numbers.length; i++) {
	        	if(numbers[i]==1 || numbers[i]==4 || numbers[i]==7){
	        		answer+="L";
	        		l_c = numbers[i];
	        	}else if(numbers[i]==3 || numbers[i]==6 || numbers[i]==9) {
	        		answer+="R";
	        		r_c = numbers[i];
	        	}else if(hand=="right" && l_c==10 && (numbers[i]==2 || numbers[i]==5 || numbers[i]==8  || numbers[i]==0)){
	        		answer+="R";
	        		r_c=numbers[i];
	        	}else if(hand=="left" && r_c==12 && (numbers[i]==2 || numbers[i]==5 || numbers[i]==8  || numbers[i]==0)){
	        		answer+="L";
	        		l_c=numbers[i];
	        	}else if(hand=="right" && (r_c-l_c==2 || r_c-l_c==4) && (numbers[i]==2 || numbers[i]==5 || numbers[i]==8  || numbers[i]==0)) {
	        		if(numbers[i]-r_c-num >= numbers[i]-l_c) {
	        			answer+="R";
	        			r_c=numbers[i];
	        		}else answer+="L"; l_c=numbers[i];
	        	}else if(hand=="left" && (l_c-r_c==2 || l_c-r_c==4) && (numbers[i]==2 || numbers[i]==5 || numbers[i]==8  || numbers[i]==0)) {
	        		if(numbers[i]-r_c-num >= numbers[i]-l_c) {
	        			answer+="L";
	        			l_c=numbers[i];
	        		}else answer+="R"; r_c=numbers[i];
	        	}else if(numbers[i] > l_c && numbers[i] > r_c && (numbers[i]==2 || numbers[i]==5 || numbers[i]==8  || numbers[i]==0) && numbers[i]-l_c < numbers[i] - r_c) {
	        		answer+="L";
	        		l_c=numbers[i];
	        	}else if(numbers[i] > l_c && numbers[i] > r_c && (numbers[i]==2 || numbers[i]==5 || numbers[i]==8  || numbers[i]==0) && numbers[i]-l_c > numbers[i] - r_c) {
	        		answer+="R";
	        		r_c=numbers[i];
	        	}else if(numbers[i] < l_c && numbers[i] < r_c &&  (numbers[i]==2 || numbers[i]==5 || numbers[i]==8  || numbers[i]==0) &&  numbers[i]-l_c > numbers[i] - r_c) {
	        		answer+="L";
	        		l_c=numbers[i];
	        	}else if(numbers[i] < l_c && numbers[i] < r_c &&  (numbers[i]==2 || numbers[i]==5 || numbers[i]==8  || numbers[i]==0) &&  numbers[i]-l_c < numbers[i] - r_c) {
	        		answer+="R";
	        		r_c=numbers[i];
	        	}
	        }
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,5,8,2,1,4,5,9,5};
		System.out.println(solution(arr, "right")); // "LRLLLRLLRRL"

	}

}
