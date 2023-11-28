import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
   public static void main(String[] args) throws Exception{

	   BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	   BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	   
	   // 1. 테스트 케이스 개수 적어주기 
	   int T = Integer.parseInt(br.readLine());
	   
	   // 2. 각 테스트 케이스에 대해 주어진 문자열 받기 (배열로?)
	   for(int i = 0; i < T; i ++) {
		  String str = br.readLine();
		  if(str.length() == 1) {
			  bw.write(str + str + "\n");
		  } else {
			  String start = str.substring(0,1);
			  String end = str.substring(str.length()-1, str.length());
			  bw.write(start + end + "\n");
		  }
	   }
	   
	   // 3. 첫 글자와 마지막 글자를 연속하여 출력함 (주어진 문자열이 1개냐 2개이상이냐로 나눠야 할듯)
	   bw.flush();
	   bw.close();
	   br.close();
   }
}