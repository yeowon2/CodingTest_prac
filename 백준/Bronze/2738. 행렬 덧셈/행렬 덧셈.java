import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		// 한 줄을 읽어서 N과 M 받아오기 
		int N = Integer.parseInt(st1.nextToken());
		int M = Integer.parseInt(st1.nextToken());
		
		// 2차원 배열 생성하기
		int A[][] = new int [N][M];
		int B[][] = new int [N][M];
		int sum[][] = new int [N][M];
		
		// 2차원 배열에 차례대로 값 넣어주기 br.readline으로 이중 for문을 통해 
		// 행렬 A
		for(int i = 0; i < N; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < M; j ++) {
				A[i][j] = Integer.parseInt(st2.nextToken());
			}
		}
		// 행렬 B
		for(int i = 0; i < N; i++) {
			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for(int j = 0 ; j < M; j ++) {
				B[i][j] = Integer.parseInt(st2.nextToken());
			}
		}
		
		// 행렬 A와 B 출력하기
		for(int i = 0; i < N; i++) {
			for(int j = 0 ; j < M; j ++) {
				sum[i][j] = A[i][j] + B[i][j];
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0 ; j < M; j ++) {
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}