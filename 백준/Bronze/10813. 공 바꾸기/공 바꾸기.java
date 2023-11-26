import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;
 
public class Main {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		// 1. 한 줄을 N과 M을 받기
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		// 2. 받은 N을 가지고 배열을 새롭게 생성해준 다음 각 번호와 똑같은 값을 넣어줄 것 i=0 부터 시작이면 i+1이 들어가도록
		int[] box = new int[N];
		for(int x = 0; x < N; x++) {
			box[x] = x+1;
		}
		
		// 3. for문을 돌리는데 이 때 temp라는 변수를 만들어서 값을 변경해주도록 ! 이때 if문 써주면 될듯 
		for(int y = 1; y <= M; y++) {
			st = new StringTokenizer(br.readLine());
			
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			int temp = 0; // 중간 역할을 해줄 temp 생성
			
			if(box[i-1] != box[j-1]) { // 값을 교환
				temp = box[i-1];
				box[i-1] = box[j-1];
				box[j-1] = temp;
			} else {
				continue;
			}
		}
		
		br.close();
		
		// 4. for문을 돌려서 System.out.print를 해주면 됨 
		for(int z = 0; z < N; z++) {
			System.out.print(box[z]+" ");
		}
	}
}