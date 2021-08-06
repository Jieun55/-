import java.util.Scanner;

public class BJ_1978 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int sum=0;
		
		for(int i=0;i<num;i++) {
			int a = scanner.nextInt();
			for(int k=2; k<=Math.sqrt(a);k++) {
				if(a % k != 0) {
					sum = sum + 1;
				}
			}
		}
		System.out.println(sum);
		scanner.close();
	}
}
