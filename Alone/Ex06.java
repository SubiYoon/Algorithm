package sw.test;

public class Ex06_array2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int k=1;
		for(int i=0; i<arr.length; i++){	
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = k;
				k++;
				System.out.printf("%d\t", arr[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("*************************************");
		int[][] arr2 = new int[5][5];
		for(int i=0; i<arr.length; i++){	
			for(int j=0; j<arr[i].length; j++) {
				arr2[j][i] = k;
				k++;
				System.out.printf("%d\t", arr[j][i]);
			}
			System.out.println();
		}
	}

}
