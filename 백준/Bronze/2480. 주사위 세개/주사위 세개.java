import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int z = scanner.nextInt();
		
		if(x == y && y == z) {
			
			System.out.println(10000 + (x*1000));
			
		} else if ((x == y && y != z) || (x == z && x != y) || (y == z && x!= y)) {
			
			if (x == y && y != z) {
				System.out.println(1000 + (x*100));
			} else if (x == z && x != y) {
				System.out.println(1000 + (x*100));
			} else if (y == z && x!= y) {
				System.out.println(1000 + (y*100));
			}
			
		} else {
			if(x > y && x > z ) {
				System.out.println(x*100);
			} else if (y > z && y > x) {
				System.out.println(y*100);
			} else if (z > x && z > y){
				System.out.println(z*100);
			}
		}
	}
}
