import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 정수의 개수 
		int N = Integer.parseInt(br.readLine());
		
		// n개의 정수를 하나의 줄로 받아옴 
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int list[] = new int[N];
		int index = 0;
		
		while(st.hasMoreTokens()) {
			
			list[index] = Integer.parseInt(st.nextToken());
			index ++;
			
		}

		Arrays.sort(list);
		
		System.out.print(list[0] + " " + list[N-1]);
	}
}