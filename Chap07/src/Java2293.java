import java.util.Scanner;

public class Java2293 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int D = 1;
		int R = 2;
		if(N==1) System.out.println(D);
		else {
			while(R<=N) {
				R+=6*D;
				++D;
			}
			System.out.println(D);
		}
		in.close();
	}
}