import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
 
	public static void main(String[] args) throws IOException{
	 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			String x = st.nextToken();
			String y = st.nextToken();
			bw.write("Case #" + (i+1) + ": " + x + " + " + y + " = " + (Integer.parseInt(x)+ Integer.parseInt(y)) + "\n");
		}
		
		br.close();
		
		bw.flush();
		bw.close();
		
	}
}