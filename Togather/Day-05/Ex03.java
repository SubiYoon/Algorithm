package Algorith.Day05;
//py갯수 같은지 아닌지 판별
public class Ex03 {
	    boolean solution(String s) {
	        boolean answer = true;

	        int countP=0;
			int countY=0;
			if(s.length()<=50) {
				for(int i=0; i<s.length(); i++) {
					char c = s.charAt(i);
					if(c == 'p' || c =='P') countP++;
					else if(c == 'y' || c== 'Y') countY++;
				}
				if(countP!=countY) answer = false;
			}

	        return answer;
	    }
	}