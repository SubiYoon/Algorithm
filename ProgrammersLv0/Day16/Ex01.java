package Algorithm.ProgrammersLv0.Day16;

//유한소수 판별
//a는 분자 b는 분모
public class Ex01 {
    public int solution(int a, int b) {
        int answer = 0;

        System.out.println(finalBottom(a, b));

        return answer;
    }

    public int finalBottom(int a, int b){
        int bottom = 0;
        if(a>b){
            for(int i=2; i<=a; i++){
                if(a%i==0 && b%i==0){
                    a/=i;
                    b/=i;
                }
            }
        }else {
            for(int i=2; i<=b; i++){
                if(a%i==0 && b%i==0){
                    a/=i;
                    b/=i;
                }
            }
        }

        bottom=b;
        return bottom;
    }
}
