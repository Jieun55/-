import java.util.Scanner;

public class BJ_6502 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = 1;
		
		while(true) {
			int r = scanner.nextInt();
			if(r == 0) break;
			int w = scanner.nextInt();
			int l = scanner.nextInt();
			double k = Math.sqrt(w*w + l*l);

			if (k <= r*2)
				System.out.println("Pizza " + i + " fits on the table.");
			else
				System.out.println("Pizza " + i + " does not fit on the table.");
			i += 1;
		}
	scanner.close();
	}
}
