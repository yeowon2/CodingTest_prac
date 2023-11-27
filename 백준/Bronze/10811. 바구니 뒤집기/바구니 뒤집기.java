import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	// 1. N와 M의 값을 들고 와서 각각 변수에 넣어준다 
    	int N = Integer.parseInt(st.nextToken());
    	int M = Integer.parseInt(st.nextToken());
    	
    	// 2. 배열 만들어주기
    	int[] bucket = new int[N];
    	for(int x = 0; x < N; x++) {
    		bucket[x] = x+1;
    	}
    	
    	// 3. i와 j의 값을 들고 와서 각각 변수에 넣어준다
    	for(int y = 1; y <= M; y++) {
    		st = new StringTokenizer(br.readLine());
    		
    		int i = Integer.parseInt(st.nextToken())-1;
    		int j = Integer.parseInt(st.nextToken())-1;

    		// 4. while문 사용하기
    		while(i < j) {
    			int temp = bucket[i];
    			bucket[i++] = bucket[j];
    			bucket[j--] = temp;
    		}
    	}
    		br.close();
    		
		for(int z = 0; z < N; z++) {
			System.out.print(bucket[z]+ " ");
		}
    }
}