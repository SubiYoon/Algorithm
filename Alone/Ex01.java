package Algorithm.Alone;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex01 {

	public static void main(String[] args) {
		// [문제] 다중 for문을 이용하여 1~50사이의 값중에서 소수를 구하시오.
		/* [출결과]
			2 3 5 7 11 ... 47
			개수 : 15
		*/
		
		//나의 해결법
		TreeSet<Integer> set=new TreeSet<Integer>();
		
		for(int i=1; i<=50; i++) {
			set.add(i);
			for(int j=2; j<i; j++) {
				if(i%j == 0) {
					set.remove(i);
				}
			}
		}
		
		set.remove(1);
		
		Iterator<Integer> iter=set.iterator();
		while(iter.hasNext()){
			System.out.print(iter.next()+" ");
		}
		System.out.println("\n개수 : " + set.size());
		
		//다른 해결법
		int count=0;
		
		for(int i=2; i<=50; i++) {
			int j=0;
			for(j=2; j<i; j++) {
				if(i%j==0) {
					break;
				}
			}
			if(i==j) {
				count++;
				System.out.print(i+ " ");
			}
		}
		System.out.print("\n개수 : " + count);
	}
}
