//미완성
import java.util.Scanner;
public class BJ_7568 {
	Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	int[] info = new int[num];
	int[] rank = new int[num];
	
	for(int i=0;i<num;i++) {
		info[i] = scanner.nextInt();
		info[i+1] = scanner.nextInt();
	}
	for(int k=0; i<num;i++) {
		if ((info[i] > info[i+2]) && (info[i+1] > info[i+3])) {
			rank[i] = 1;
		}
		
	}
	for(int n=0;n<num;n++) {
		System.out.print(rank[n] + " ");
	}
}
