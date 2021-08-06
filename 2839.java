import java.util.Scanner;
public class BJ_2839 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sugar = scanner.nextInt();
		int bag = 0;
		
		if (sugar % 5 == 0) {
			System.out.println(sugar/5);
			return;}
		while(sugar >= 3) {
			sugar -= 3;
			bag += 1;
			
			if (sugar % 5 == 0) {
				System.out.println(bag + sugar/5);
				break;
			}
		}
		//나머지 경우
		if (sugar % 5 == 1 || sugar % 5 == 2) {
			System.out.println(-1);
		}
	}
}
