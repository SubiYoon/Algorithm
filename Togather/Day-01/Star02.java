package Algorith;

public class Star02 {

	public static void main(String[] args) {
	
		for(int i=1; i<=6; i++) {
			for(int k=6;k>i;k--) {
				System.out.print(" ");
			}
			
			for(int j=0;j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
