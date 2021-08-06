import java.util.Scanner;

public class BJ_5585 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		int change = 1000 - money;
		int i = 0;
		
		while(change > 0) {
			if(change - 500 >= 0) change -= 500;
			else if(change - 100 >= 0) change -= 100;
			else if(change - 50 >= 0) change -= 50;
			else if(change - 10 >= 0) change -= 10;
			else if(change - 5 >= 0) change -= 5;
			else change -= 1;
		i += 1;
		}
		System.out.println(i);
		scanner.close();
	}
}
