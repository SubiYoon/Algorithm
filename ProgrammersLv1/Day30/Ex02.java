package Algorithm.ProgrammersLv1.Day30;

import java.util.Arrays;

/*
둘만의 암호
s에있는 String에 알파벳당 index를 더함
만약 중간에 skip이 있을 경우 index에 ++을 해서 return
 */
public class Ex02 {
    public String solution(String s, String skip, int index) {
        String answer = "";
        char[] cList = new char[skip.length()];

        for(int i=0; i<skip.length(); i++){
            cList[i] = skip.charAt(i);
        }

        //오름차순 정렬
        Arrays.sort(cList);

        //s를 charAt으로 하나씩 비교
        for(int i=0; i<s.length(); i++){
            //최종 answer에 추가할 문자
            int c = (int)s.charAt(i) + index;

            //charAt과 charAt + index 사이에 있을 경우 c++해줌
            for(int j=0; j<cList.length; j++){
                if((int)s.charAt(i) <= (int)cList[j] && (int)cList[j] <= c){
                    c++;
                }

                //z를 넘어간다면 다시 a로 변경
                if(c>122){
                    c-=26;
                }
            }
            answer += (char)c;
        }
        return answer;
    }
}
