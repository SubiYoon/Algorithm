package algoritmReport;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Ex03 {

	public static void main(String[] args) {
		// data.1txt파일의 내용을 읽어 다음 출력형식으로 표시하다.
		try {
			File data1 = new File("/Users/dongsubyoon/multi/JAVA/Workspace/javaAlgorithm/src/algoritmReport/data1.txt");
			FileReader fr = new FileReader(data1);
			BufferedReader br = new BufferedReader(fr);
			
			int count=0;
			
			for(int i=0;;i++){
				String str = br.readLine();
				//System.out.println(str);
				if(str == null) break;
				String[] inData = str.split(" ");
				
				int total = 0;
				
				for(String a : inData) {
					total += Integer.parseInt(a);
				}
				count++;
				System.out.println("#" + count + " " + total);
			}
			
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
