package Algorithm.ProgrammersLv0.Day11;

public class Ex04 {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        int t = 0;

        for(int i=0; i<num_list.length/n; i++){
            for(int j=0; j<n; j++){
                answer[i][j] = num_list[t++];
            }
        }
        
        return answer;
    }
}
