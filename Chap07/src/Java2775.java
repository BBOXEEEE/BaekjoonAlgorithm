import java.util.Scanner;

public class Java2775 {
	public static void main(String[] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int[][] apart = new int[15][15];
		for(int i=0; i<15; ++i)
			apart[0][i] = i;
		for(int i=1; i<15; ++i)
			for(int j=1; j<15; ++j)
				apart[i][j] = apart[i][j-1] + apart[i-1][j];
		int T = in.nextInt();
		for(int t=0; t<T; ++t) {
			int k = in.nextInt();
			int n = in.nextInt();
			System.out.println(apart[k][n]);
		}
		in.close();
	}
}