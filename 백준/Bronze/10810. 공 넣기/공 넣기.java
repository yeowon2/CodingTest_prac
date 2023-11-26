import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {
	public static void main(String[] args) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		
		int [] box = new int[N];
		
		for(int x = 0; x < M; x++) {
			st = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			int k = Integer.parseInt(st.nextToken());
			
			for(int y = (i-1); y < j ; y++) {
				box[y] = k;
			}
		}
		br.close();
		
		for(int z = 0; z < N; z++) {
			System.out.print(box[z] + " ");
		}
	}
}