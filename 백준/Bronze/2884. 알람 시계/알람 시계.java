import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int H = scanner.nextInt();
		int M = scanner.nextInt();
		
		if (M < 45) {
			if(H == 0) {
				H = 23;
				M = 60 - (45 - M);
				System.out.println(H + " " + M);
			} else {
				H = H-1;
				M = 60 - (45 - M);
				System.out.println(H + " " + M);
			}
		} else if(M >= 45) {
			M = M - 45;
			System.out.println(H + " " + M);
		}
		
	}
}