package Algorithm.ProgrammersLv0.Day10;

public class Ex04 {
    public int solution(int n) {
        int answer = 0;
        int count = 0;
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i%j==0){
                    count++;
                }
                if(count==3){
                    answer++;
                    break;
                }
            }
            count=0;
        }
        
        return answer;
    }
}
