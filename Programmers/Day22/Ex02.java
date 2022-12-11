package Algorithm.Programmers.Day22;

/*
 조카가 발음 할 수 있는 단어의 갯수를 반환
 "aya", "ye", "woo", "ma"
 연속 발음 안됨 ex) "yeye", "mama"
 두단어가 연결된 단어는 가능 ex) "aya+ye"
 */
public class Ex02 {
    public int solution(String[] babbling) {
        int answer = 0;
        String[] pass = {"aya", "ye", "woo", "ma"};
        String[] nonPass = {"ayaaya" , "yeye", "woowoo", "mama"};
        
        for(String bab : babbling){
            for(String n : nonPass){
                bab = bab.replace(n, "?");
            }

            for(String p : pass){
                bab = bab.replace(p, "!");
            }

            System.out.println(bab);

            int count=0;
            for(int i=0; i<bab.length(); i++){
                if(!(bab.charAt(i)=='!')){
                    count=1;
                    break;
                }
            }
            if(count==0){
                answer++;
            }

        }

        return answer;
    }

    public static void main(String[] args) {
        Ex02 ex = new Ex02();
        String[] arr1 = {"aya", "yee", "u", "maa"}; 
        String[] arr2 = {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"};
        System.out.println(ex.solution(arr1));  //1
        System.out.println(ex.solution(arr2));  //2
    }
}
