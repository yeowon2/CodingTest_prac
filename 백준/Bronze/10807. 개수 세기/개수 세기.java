import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		// 정수의 개수 N 주기 (이 때, N의 개수는 1~100개)
		int N = Integer.parseInt(br.readLine());
		
		// N개의 정수가 공백으로 구분되어져 잇음 
		// N개의 정수를 공백으로 구분되게 우리가 다 값을 줘야 하는가? 일단 배열을 선언해줘야 함 
		int random[] = new int [N];

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i < N; i++) {
			random[i] = Integer.parseInt(st.nextToken()); 
		}
		
		// 찾으려고 하는 정수 v가 주어짐 
		int v = Integer.parseInt(br.readLine());
		// random 배열 내에서 주어진 v와 같은 수가 있는지 확인해보기 위한 count 선언
		int count = 0;
		
		// 첫 째 줄에 입력으로 주이전 N개의 정수 중에 v가 몇개인지 출력한다 
		for(int j = 0; j < N; j++) {
			if(v == random[j]) {
				count++;
			}
		}
		bw.write(count + "\n");
		
		br.close();
		
		bw.flush();
		bw.close();
		
	}

}