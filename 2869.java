import java.util.Scanner;

public class BJ_2869 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int v = scanner.nextInt();
		int sum = 0, day=0;
		
		while (sum<=v) {
			sum = sum + a;
			sum = sum - b;
			day++;
		}
		System.out.print(day);
		scanner.close();
	}
}

// 스캐너 말고 버퍼리더로 받고, 토큰화로 쪼갠다
// 4 2 10이면, 10을 가기위한 마지막으로 완전한 날은 3일(2+2+2 + 4)
// gap
