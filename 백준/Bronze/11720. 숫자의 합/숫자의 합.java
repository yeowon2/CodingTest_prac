import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class Main {
  public static void main(String[] args) throws Exception {
	  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	  
	  int sum = 0;
	  
	  // 숫자의 갯수 N 받기
	  int N = Integer.parseInt(br.readLine());
	  
	  // 숫자 N개를 공백 없이 받기
	  String nums = br.readLine();
	  
	  // 받은 숫자 N개를 잘라서 sum으로 합하기
	  if (N == 1) {
		  System.out.println(nums);
	  } else {
		  for(int i =1 ; i <= N; i++) {
			  int num = Integer.parseInt(nums.substring(i-1, i));
			  sum += num;
		  }
		  System.out.println(sum);
	  }
  }
}