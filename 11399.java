import java.util.Arrays;
import java.util.Scanner;

public class BJ_11399 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] people = new int[num];
		int time = 0;
		
		for(int i=0; i<num; i++) {
			people[i] = scanner.nextInt();
		}
		Arrays.sort(people);
		
		for(int n=0; n<num; n++) {
			for(int m=0;m<num-n;m++) {
				time += people[n];
			}
		}
		System.out.println(time);
		scanner.close();
	}
}
