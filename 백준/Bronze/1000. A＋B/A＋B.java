import java.util.Scanner;

public class Main {

	
	public static int sum (int n, int m) {
		return n+m;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int sum = sum(a,b);
		
		System.out.println(sum);
		
	}
	
	
}