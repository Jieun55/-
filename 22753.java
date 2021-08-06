import java.util.Scanner;

public class BJ_22753 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int year = scanner.nextInt();
		
		if (year%400 == 0) System.out.print(1);
		else if (year%4 == 0) {
			if (year%100 == 0) {
				System.out.print(0);
			}
			else System.out.print(1);
		}
		else System.out.print(0);
	scanner.close();
	}
}
