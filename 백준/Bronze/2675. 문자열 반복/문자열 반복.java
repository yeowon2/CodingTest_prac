import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
 
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i = 0; i < T; i++) {
			// 각 테스트 케이스에 대해 새로운 라인을 읽도록 함 
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int R = Integer.parseInt(st.nextToken());
			String S = st.nextToken();
			String [] arr = new String[S.length()]; 
			
			// 이제 S를 잘라서 R만큼 반복해줘야 함 
			for(int j = 0; j < S.length(); j++) {
				arr[j] = S.substring(j, j+1);
				bw.append(arr[j].repeat(R));
			}
			bw.newLine();
		}
		br.close();
		bw.flush();
		bw.close();
				
	}
}