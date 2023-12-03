import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 문장 읽어와서 StringTokenizer에 넣어주기
		String sentence = br.readLine();
		StringTokenizer st = new StringTokenizer(sentence); // 이를 출력하면 this만 나옴
		
		int count = 0;
		
		// 문장을 공백으로 나눠서 배열에 넣어주기 => count 사용?
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken()); // sb는 합쳐주는 메소드
			count ++;
		}
		System.out.println(count);
	}
}