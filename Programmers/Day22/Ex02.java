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
