import java.util.Scanner;

public class BJ_20363 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int light = scanner.nextInt();
		int water = scanner.nextInt();
		int m, n = 0;
		
		if (light > water) {
			m = water / 10;
			light += m;
		}
		else {
			n = light / 10;
			water += n;
		}
		System.out.println(light + water);
		scanner.close();
	}
}
