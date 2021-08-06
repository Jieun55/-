import java.util.Scanner;

public class BJ_2609 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int n1 = num1; int n2= num2;
		int gcd = 1; int b = 2; int lcm = 1;
		
		while(true) {
			if (num1 < b || num2 < b) break;
			if (num1 % b == 0 && num2 % b == 0) {
				gcd = gcd * b;
				num1 = num1 / b;
				num2 = num2 / b;
			}
			else
				b = b+1;
		}
		lcm = n1 * n2 / gcd;
		System.out.println(gcd);
		System.out.println(lcm);
	}
}
