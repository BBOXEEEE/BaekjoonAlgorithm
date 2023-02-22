import java.util.Scanner;

public class Java11653 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		StringBuilder result = new StringBuilder();
		int factor = 2;
		while(N!=1) {
			if(N%factor == 0) {
				N/=factor;
				result.append(factor + "\n");
			}
			else ++factor;
		}
		System.out.println(result);
		in.close();
	}
}