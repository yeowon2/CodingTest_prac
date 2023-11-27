import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
 
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	double sum = 0;
    	double avg = 0;
    	
    	// 1. 시험 본 과목의 개수를 변수에 넣어주고 
    	int N = Integer.parseInt(st.nextToken());
    	
    	// 배열 선언 
    	int[] scores = new int[N];
    	
    	st = new StringTokenizer(br.readLine());
    	// 2. N개의 성적을 받는다 이를 Arrays.sort()메소드를 이용하여 정렬해줌
    	for(int i = 0; i < N; i++) {
    		scores[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	Arrays.sort(scores);
    	
    	// 3. (각 점수 / scores[0]) = (sum * 100)/N = avg을 하여 새로운 값을 내자
    	for(int j = 0; j < N; j++) {
    		double x = (double) scores[j]/scores[N-1];
    		sum += x;
    	}
    	
    	avg = (sum/N) * 100;
    	
    	br.close();
    	
    	System.out.println(avg);
    	
    }
}