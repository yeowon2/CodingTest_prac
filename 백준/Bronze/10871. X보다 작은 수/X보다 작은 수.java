import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		// 한 줄을 읽고 StringTokenizer를 사용하여 토큰화함 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 토큰에서 N과 X를 추출함
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
		
		int list[] = new int[N];
		
		// 다음 줄을 읽고 정수 배열에 값을 저장함
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		// X보다 작은 값을 출력함 
		for(int j=0; j < N; j++) {
			if(list[j] < X) {
				bw.write(list[j]+ " ");
			}
		}
		br.close();
		
		bw.flush();
		bw.close();
	}

}