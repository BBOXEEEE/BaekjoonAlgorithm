import java.util.Scanner;

public class Java10950 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int T = in.nextInt();
		for(int t=0; t<T; ++t) {
			int A = in.nextInt();
			int B = in.nextInt();
			System.out.println(A+B);
		}
		in.close();
	}
}