import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int A = scanner.nextInt();
		int B = scanner.nextInt();
		int C = scanner.nextInt();
		
		if(B+C >=60) {
			int x = (B+C)/60;
			B = (B+C)%60;
			A = A + x;
			if(A == 24) {
				A = 0;
				System.out.println(A + " " + B);
			} else if (A > 24) {
				A = A -24;
				System.out.println(A + " " + B);
			} else {
				System.out.println(A + " " + B);
			}
		} else if(B+C < 60) {
			B = (B+C);
			System.out.println(A + " " + B);
		}
		
	}
}