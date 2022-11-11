package Algorith.Day05;

public class Ex04 {
	    public int solution(String s) {
	        int answer = 0;

	        if(1<=s.length() && s.length()<=5) {
				answer = Integer.valueOf(s);
	        }
	        
	        return answer;
	    }
	}