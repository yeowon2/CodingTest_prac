import java.util.Scanner;

public class Main {

	
	public static int min (int n, int m) {
		return n-m;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int min = min(a,b);
		
		System.out.println(min);
		
		scanner.close();
	}
	
	
}
