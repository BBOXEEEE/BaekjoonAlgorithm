import java.util.Scanner;

public class Java1978 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		int count = 0;
		for(int t=0; t<N; ++t) {
			int num = in.nextInt();
			int check = 0;
			for(int i=2; i<=num; ++i) {
				if(num%i == 0) ++check;
			}
			if(check == 1) ++count;
		}
		System.out.println(count);
		in.close();
	}
}