package Algorithm.ProgrammersLv0.Day16;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;

//등수 매기기
public class Ex02 {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];

        // index용 TreeMap
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < score.length; i++) {
            map.put(i, sum(score[i]));
        }

        // 평균 순서 List
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            list.add(sum(score[i]));
        }
        Collections.sort(list);

        //등수 매기기
        int rank = map.size();
        int equal_num = 0;
        int before_index = 0;
        
        for(int i=0; i<list.size(); i++){
            for(int j=0; j<map.size(); j++){
                if(list.get(i)==map.get(j)){
                    if(list.get(i)==equal_num){
                        answer[before_index] = --rank;
                    }
                    answer[j]=rank;
                    before_index = j;
                    rank--;
                    break;
                }
            }
            equal_num=list.get(i);
        }

        return answer;
    }

    public int sum(int[] arr) {
        return arr[0] + arr[1];
    }
}
