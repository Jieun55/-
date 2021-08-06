import java.util.Scanner;

public class BJ_4153 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int high=0; int mid=0; int low=0;
		while(true) {
			int a = scanner.nextInt();
			int b = scanner.nextInt();
			int c = scanner.nextInt();
			
			if(a == 0 && b == 0 && c == 0) break;
			if (a > b && a > c)
				if (b > c) {high = a; mid = b; low = c;}
				else {high = a; mid = c; low = b;}
			else if (b > a && b > c)
				if (a > c) {high = b; mid = a; low = c;}
				else {high = b; mid = c; low = a;}
			else if (c > a && c > b)
				if (a > b) {high = c; mid = a; low = b;}
				else {high = c; mid = b; low = a;}		
			
			if (high*high == mid*mid + low*low)
				System.out.println("right");
			else
				System.out.println("wrong");
		}
	}
}
