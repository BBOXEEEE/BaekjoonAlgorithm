import java.util.Scanner;

public class Java2525 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int H = in.nextInt();
		int M = in.nextInt();
		int T = in.nextInt();
		
		int tmp = H*60+M+T;
		H=(tmp/60)%24;
		M=tmp%60;
		System.out.println(H + " " + M);
		in.close();
	}
}