import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException { // Null 예외 처리
        
    	
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 버퍼 선언
    	
    	boolean[] arr = new boolean[31]; // 0번은 없으니까 1~30번까지 있으려면 공간이 31 개 필요함
    	
    	for(int i=0; i<28; i++) { // 변수 i 는 0~28번 미만이므로 총 28번을 반복함. 그럼 2개 호출가능
    		StringTokenizer st = new StringTokenizer(br.readLine(), " "); // 개행 및 " " 마다나눔
    		int A = Integer.parseInt(st.nextToken()); // 변수 A에 계속 학생번호를 받음   	 	
	    	arr[A] = true; // arr[학생번호]를 true로 넣어줌
    	}
    	
    	for(int i=1; i<arr.length; i++) { // i가 1부터인 이유는 0번 학생은 없음
    		if(arr[i] != true) { // arr[학생 번호] 가 true가 아니면 과제 안한 학생임
    			System.out.println(i); // 과제 안한 학생의 번호를 호출
    		}

    	}
    	br.close(); // 버퍼종료
    	
    }
}