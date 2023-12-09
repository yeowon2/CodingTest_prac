import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	int q = 0; // 쿼터 ($0.25) -> 25
    	int d = 0; // 다임 ($0.10) -> 10
    	int n = 0; // 니켈 ($0.05) -> 5
    	int p = 0; // 페니 ($0.01) -> 1
    	int extra = 0; 
    	
    	// 테스트 케이스 개수 받기
    	int t = Integer.parseInt(br.readLine());
    	
    	// C들 받아주기 -> for문으로 t번만큼 반복하며 값을 넣어주기 
    	for(int i = 0; i < t; i++) {
    		int c = Integer.parseInt(br.readLine()); 
    		
    		q = c/25;
    		extra = c%25;
    		d = extra/10;
    		extra = extra%10;
    		n = extra/5;
    		extra = extra%5;
    		p = extra/1;
    		
    		bw.write(q + " " + d + " " + n + " " + p);
    		bw.newLine();
    	}
    	
    	br.close();
    	bw.flush();
    	bw.close();
    }
}
